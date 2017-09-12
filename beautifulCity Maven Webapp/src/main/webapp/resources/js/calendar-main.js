(function(){

    $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/acLasted",
        success:function(data,status,jqXHR){
            var fAc=data;
            var img=document.getElementsByClassName("acImg");
            var title=document.getElementsByClassName("activity-title");
            var content=document.getElementsByClassName("activity-content");
            var time=document.getElementsByClassName("activity-time");
            for(var i=0;i<fAc.length;i++){
                img[i].src=fAc[i].acIcon;
                title[i].innerText=fAc[i].acName;
                title[i].onclick=openActivity;
                title[i].href="http://localhost:8080/beautifulCity/activity";
                title[i].target="_blank";
                content[i].innerText=fAc[i].acContent;
                time[i].innerText=fAc[i].startTime;
            }
        }
    });

    var datepicker = window.datepicker;
    var monthData;
    var $wrapper;
    datepicker.buildUi = function(year,month){
        monthData = datepicker.getMonthData(year,month);
        var html = ' <div class="datepicker-header">'+
                   '<div class="datepicker-leftbtn"></div>'+
                   '<span class="datepicker-curr-month">'+monthData.year+'年'+monthData.month+'月'+'</span>'+
                   '<div class="datepicker-rightbtn"></div>'+
                   '</div>'+
                   '<div class="datepicker-body">'+
                   '<table>'+
                    '<thead>'+
                        '<tr>'+
                            '<th>一</th>'+
                            '<th>二</th>'+
                            '<th>三</th>'+
                            '<th>四</th>'+
                            '<th>五</th>'+
                            '<th>六</th>'+
                            '<th>日</th>'+
                        '</tr>'+
                    '</thead>'+
                    '<tbody>';
        for(var i = 0 ; i< monthData.days.length ; i++){
            var date = monthData.days[i];
            if (i%7 ===0 ) {
                html += '<tr>';
            }
            html += '<td data-date="'+date.date+'">' + date.showDate +'</td>';
            if (i%7 ===6 ) {
                html += '</tr>';
            };
        }
        html += '</tbody>'+
                '</table>'+
                '</div>';
        return html;
    };
    datepicker.init = function(year,month){
        var html = datepicker.buildUi(year,month);
        $wrapper = document.querySelector('.datepicker-wrapper');
        var a = document.getElementById("datepicker");
        if (!$wrapper) {
            $wrapper = document.createElement('div');
            a.appendChild($wrapper);
            $wrapper.className = 'datepicker-wrapper';
        };
        $wrapper.innerHTML = html;
    };
    function format(date){
        ret='';
        var padding = function(num){
            if (num <= 9){
               return '0'+ num;
            }
                return num;
        }

        ret += date.getFullYear() + '-';
        ret += padding(date.getMonth() + 1) + '-';
        ret += padding(date.getDate());
        return ret;
    }
    datepicker.init();
    $wrapper.addEventListener("click",function(e){
            var $target = e.target;
            if ($target.classList.contains('datepicker-leftbtn')){
                var month,year;
                if(monthData){
                    month = monthData.month;
                    year = monthData.year;
                }
                month = month - 1;
                if (month === 0) {
                    month = 12;
                    year = year - 1;
                };
                datepicker.init(year,month);
            }
            if ($target.classList.contains('datepicker-rightbtn')) {
                var month,year;
                if(monthData){
                    month = monthData.month;
                    year = monthData.year;
                }
                month = month + 1;
                if (month === 13) {
                    month = 1;
                    year = year + 1;
                };
                datepicker.init(year,month);
            };
            if ($target.tagName.toLowerCase() == 'td') {
                    var date = new Date(monthData.year,monthData.month - 1,$target.dataset.date);
                    $('.activity-center').remove();
                    var dt=format(date);
                    $.ajax({
                        method: "GET",
                        url:"http://localhost:8080/beautifulCity/getAc",
                        async:true,
                        data:{'dt':dt},
                        success:function(data,status,jqXHR){
                           var ac=data;
                           var bodyUl=document.getElementById("bodyUl");
                           for(var i=0;i<ac.length;i++){
                                var acLi=document.createElement("li");
                                acLi.className="activity-center";
                                var acDivImg=document.createElement("div");
                                acDivImg.className="activity-img";
                                var acImg=document.createElement("img");
                                acImg.src=ac[i].acIcon;
                                var wDiv=document.createElement("div");
                                wDiv.className="activity-words";
                                var h61=document.createElement("a");
                                h61.className="activity-title";
                                h61.innerHTML=ac[i].acName;
                                h61.onclick=openActivity;
                                h61.href="http://localhost:8080/beautifulCity/activity";
                                h61.target = "_blank";
                                var h62=document.createElement("h6");
                                h62.className="activity-content";
                                h62.innerHTML=ac[i].acContent;
                                var h63=document.createElement("h6");
                                h63.className="activity-time";
                                h63.innerHTML=ac[i].startTime;

                                acDivImg.appendChild(acImg);
                                wDiv.appendChild(h61);
                                wDiv.appendChild(h62);
                                wDiv.appendChild(h63);
                                acLi.appendChild(acDivImg);
                                acLi.appendChild(wDiv);
                                bodyUl.appendChild(acLi);
                            }
                        }
                    });
                    var b = document.getElementsByTagName("td");
                    for(var i = 0; i<b.length;i++){
                    b[i].style.color="#555555";
                }
                    $target.style.color="red";
            };
    })

    function openActivity(){
        var act=this.innerHTML;
        $.ajax({
            method: "GET",
            url:"http://localhost:8080/beautifulCity/activityWords",
            data:{'atl':act}
        });
    }
})();
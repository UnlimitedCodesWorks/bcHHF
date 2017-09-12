(function(){
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
                    alert(format(date));
                    var b = document.getElementsByTagName("td");
                    for(var i = 0; i<b.length;i++){
                    b[i].style.color="#555555";
                }
                    $target.style.color="red";
            };
    })
})();
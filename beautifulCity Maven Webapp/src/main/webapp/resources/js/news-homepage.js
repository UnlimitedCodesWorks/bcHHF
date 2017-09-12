window.onload=function(){

    var myarray=[];
    var myarray1=[];

    $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/lastedNews",
        async:false,
        success:function(data,status,jqXHR){
            var lasted=data;
            for(var i=0;i<lasted.length;i++){
                myarray.push(lasted[i].newsIcon);
                myarray1.push(lasted[i].newsName);
            }
        }
    });

    var imageLi = document.getElementById("news-rollingUL").getElementsByTagName("li");
    var sreenWidth = document.body.clientWidth;
    for (var i = 0 ;i < imageLi.length ; i++) {
        imageLi[i].getElementsByTagName("img")[0].src = myarray[i];
        imageLi[i].style.width = sreenWidth+"px";
        imageLi[i].getElementsByTagName("img")[0].style.width = "100%";
        imageLi[i].getElementsByTagName("img")[0].style.height = "500"+"px";
    }
    var baseWidth = imageLi[0].clientWidth;
    document.getElementById("rollingnews-title").getElementsByTagName("a")[0].innerText = myarray1[0];
    document.getElementById("rollingnews-title").getElementsByTagName("a")[0].onclick=goNewsPage;
    document.getElementById("news-rollingUL").style.width = baseWidth*5+"px";
    var j = 0;
    var timerImage = window.setInterval(function(){
        if (j != 4) {
            j++;
            document.getElementById("news-rollingUL").style.left = (j)*(-sreenWidth)+"px";
            document.getElementById("rollingnews-title").getElementsByTagName("a")[0].innerText = myarray1[j];
        }else{
            j = 0;
            document.getElementById("news-rollingUL").style.left = (j)*(-sreenWidth)+"px";
            document.getElementById("rollingnews-title").getElementsByTagName("a")[0].innerText = myarray1[j];
        }
    },3000);

    $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/ten",
        async:false,
        success:function(data,status,jqXHR){
            var ten=data;
            var id=document.getElementById("news-main-body-neirong");
            for(var i=0;i<ten.length;i++){
                var ul=document.createElement("ul");
                ul.className="news-main-body-ul";
                var li=document.createElement("li");
                var span1=document.createElement("span");
                span1.className="news-main-body-span1";
                var a=document.createElement("a");
                a.className="span1-a";
                a.innerText=ten[i].newsName;
                a.onclick=goNewsPage;
                a.href="http://localhost:8080/beautifulCity/newspage";
                a.target="_blank";
                var span2=document.createElement("span");
                span2.className="news-main-body-span2";
                span2.innerText=ten[i].startTime;

                span1.appendChild(a);
                li.appendChild(span1);
                li.appendChild(span2);
                ul.appendChild(li);
                id.appendChild(ul);
            }
            $('.news-main-body-ul').mouseover(function(){
                $(this).children("li").css("margin-left","49.587px");
                $(this).children("li").css("width","982.625px");
            });
            $('.news-main-body-ul').mouseout(function(){
                $(this).children("li").css("margin-left","54.587px");
            });
        }
    });

    $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/setTotal",
        async:false,
        success:function(data,status,jqXHR){
            var row=data;
            var total=row[0].total;
            var num=Math.ceil(total/10);
            var pagination=document.getElementsByClassName("pagination")[0];
            for(var i=1;i<=num;i++){
                var pageLi=document.createElement("li");
                var pageA=document.createElement("a");
                pageA.className="pageA";
                pageA.innerText=i;
                pageLi.appendChild(pageA);
                pagination.appendChild(pageLi);
            }
        }
    });

    $('.pageA').click(function() {
        $('.news-main-body-ul').remove();
        var number=this.innerText;
        $.ajax({
            method: "GET",
            dataType:"json",
            url:"http://localhost:8080/beautifulCity/refresh",
            data:{'num':number},
            async:false,
            success:function(data,status,jqXHR){
                var ten=data;
                var id=document.getElementById("news-main-body-neirong");
                for(var i=0;i<ten.length;i++){
                    var ul=document.createElement("ul");
                    ul.className="news-main-body-ul";
                    var li=document.createElement("li");
                    var span1=document.createElement("span");
                    span1.className="news-main-body-span1";
                    var a=document.createElement("a");
                    a.className="span1-a";
                    a.innerText=ten[i].newsName;
                    a.onclick=goNewsPage;
                    a.href="http://localhost:8080/beautifulCity/newspage";
                    a.target="_blank";
                    var span2=document.createElement("span");
                    span2.className="news-main-body-span2";
                    span2.innerText=ten[i].startTime;

                    span1.appendChild(a);
                    li.appendChild(span1);
                    li.appendChild(span2);
                    ul.appendChild(li);
                    id.appendChild(ul);
                }
                $('.news-main-body-ul').mouseover(function(){
                    $(this).children("li").css("margin-left","49.587px");
                    $(this).children("li").css("width","982.625px");
                });
                $('.news-main-body-ul').mouseout(function(){
                    $(this).children("li").css("margin-left","54.587px");
                });
            }
        });
    });

    function goNewsPage(){
        var aT=this.innerText;
        $.ajax({
            method: "GET",
            url:"http://localhost:8080/beautifulCity/getNewsTitle",
            data:{'newsTitle':aT}
        });
    }
}
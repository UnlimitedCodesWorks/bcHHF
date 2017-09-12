window.onload=function(){
    var myarray = ["../images/abc.jpg","../images/abc.jpg","../images/abc.jpg","../images/abc.jpg"];
    var myarray1 = ["深化千岛湖的水质改革问题1","深化千岛湖的水质改革问题2","深化千岛湖的水质改革问题3","深化千岛湖的水质改革问题4"]
    var imageLi = document.getElementById("news-rollingUL").getElementsByTagName("li");
    var sreenWidth = document.body.clientWidth;
    for (var i = 0 ;i < imageLi.length ; i++) {
        imageLi[i].getElementsByTagName("img")[0].src = myarray[i];
        imageLi[i].style.width = sreenWidth+"px";
        imageLi[i].getElementsByTagName("img")[0].style.width = "100%";
        imageLi[i].getElementsByTagName("img")[0].style.height = "500"+"px";
    }
    var baseWidth = imageLi[0].clientWidth;
    document.getElementById("rollingnews-title").innerText = myarray1[0];
    document.getElementById("news-rollingUL").style.width = baseWidth*4+"px";
    var j = 0;
    var timerImage = window.setInterval(function(){
        if (j != 3) {
            j++;
            document.getElementById("news-rollingUL").style.left = (j)*(-sreenWidth)+"px";
            document.getElementById("rollingnews-title").innerText = myarray1[j];
        }else{
            j = 0;
            document.getElementById("news-rollingUL").style.left = (j)*(-sreenWidth)+"px";
            document.getElementById("rollingnews-title").innerText = myarray1[j];
        }
    },3000);
    $('.news-main-body-ul').mouseover(function(){
        $(this).children("li").css("margin-left","49.587px");
         $(this).children("li").css("width","982.625px");
    });
    $('.news-main-body-ul').mouseout(function(){
        $(this).children("li").css("margin-left","54.587px");
    });
}
window.onload=function(){
	var mlUlLi=document.getElementById("mlUl").getElementsByTagName("li");
	mlUlLi[0].onclick=function(){
    	document.getElementById("v-guan").style.display="block";
    	document.getElementById("i-guan").style.display="none";
    	document.getElementById("t-guan").style.display="none";
    	document.getElementById("n-guan").style.display="none";
    	document.getElementById("a-guan").style.display="none";
    }

	mlUlLi[1].onclick=function(){
    	document.getElementById("v-guan").style.display="none";
    	document.getElementById("i-guan").style.display="block";
    	document.getElementById("t-guan").style.display="none";
    	document.getElementById("n-guan").style.display="none";
    	document.getElementById("a-guan").style.display="none";
    }

	mlUlLi[2].onclick=function(){
    	document.getElementById("v-guan").style.display="none";
    	document.getElementById("i-guan").style.display="none";
    	document.getElementById("t-guan").style.display="block";
    	document.getElementById("n-guan").style.display="none";
    	document.getElementById("a-guan").style.display="none";
    }

	mlUlLi[3].onclick=function(){
    	document.getElementById("v-guan").style.display="none";
    	document.getElementById("i-guan").style.display="none";
    	document.getElementById("t-guan").style.display="none";
    	document.getElementById("n-guan").style.display="block";
    	document.getElementById("a-guan").style.display="none";
    }

	mlUlLi[4].onclick=function(){
    	document.getElementById("v-guan").style.display="none";
    	document.getElementById("i-guan").style.display="none";
    	document.getElementById("t-guan").style.display="none";
    	document.getElementById("n-guan").style.display="none";
    	document.getElementById("a-guan").style.display="block";
    }

    $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/setSenven",
        success:function(data,status,jqXHR){
            var village=document.getElementsByClassName("village")[0];
            var vill=data;
            for(var i=0;i<vill.length;i++){
                var ul=document.createElement("ul");
                ul.className="u-info";
                var imgLi=document.createElement("li");
                var img=document.createElement("img");
                img.src=vill[i].villImg;
                var li2=document.createElement("li");
                li2.innerText=vill[i].villPlace;
                var li3=document.createElement("li");
                li3.innerText=vill[i].villContent;
                var li4=document.createElement("li");
                var button1=document.createElement("button");
                button1.setAttribute("type","button");
                button1.className="update btn";
                button1.innerText="修改";
                var button2=document.createElement("button");
                button2.setAttribute("type","button");
                button2.className="delete btn";
                button2.innerText="删除";

                imgLi.appendChild(img);
                li4.appendChild(button1);
                li4.appendChild(button2);
                ul.appendChild(imgLi);
                ul.appendChild(li2);
                ul.appendChild(li3);
                ul.appendChild(li4);
                village.appendChild(ul);
            }
        }
    });

    var pageNum;
    $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/setPage",
        async:false,
        success:function(data,status,jqXHR){
            var total=data;
            var totalNum=total[0].total;
            pageNum=Math.ceil(totalNum/7);
        }
    });

    $.page({
        ele: '#page1 ul',
        curPage: 1, // 当前页
        visiblePages: 5, // 可见页码
        change: function(num) { // 回调
            $.ajax({
                method: "GET",
                dataType:"json",
                url:"http://localhost:8080/beautifulCity/vGuan",
                data:{'number':num},
                success:function(data,status,jqXHR){
                    $('.u-info').remove();
                    var village=document.getElementsByClassName("village")[0];
                    var vill=data;
                    for(var i=0;i<vill.length;i++){
                        var ul=document.createElement("ul");
                        ul.className="u-info";
                        var imgLi=document.createElement("li");
                        var img=document.createElement("img");
                        img.src=vill[i].villImg;
                        var li2=document.createElement("li");
                        li2.innerText=vill[i].villPlace;
                        var li3=document.createElement("li");
                        li3.innerText=vill[i].villContent;
                        var li4=document.createElement("li");
                        var button1=document.createElement("button");
                        button1.setAttribute("type","button");
                        button1.className="update btn";
                        button1.innerText="修改";
                        var button2=document.createElement("button");
                        button2.setAttribute("type","button");
                        button2.className="delete btn";
                        button2.innerText="删除";

                        imgLi.appendChild(img);
                        li4.appendChild(button1);
                        li4.appendChild(button2);
                        ul.appendChild(imgLi);
                        ul.appendChild(li2);
                        ul.appendChild(li3);
                        ul.appendChild(li4);
                        village.appendChild(ul);
                    }
                }
            });
        },
        totalPages: pageNum // 总页数
    });

    $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/setSenvenNews",
        success:function(data,status,jqXHR){
            var activity1=document.getElementsByClassName("news-activity")[0];
            var news=data;
            for(var i=0;i<news.length;i++){
                var newsUl=document.createElement("ul");
                newsUl.className="n-a-info n-infomation";
                var li1=document.createElement("li");
                var img=document.createElement("img");
                img.src=news[i].newsIcon;
                var li2=document.createElement("li");
                li2.innerText=news[i].newsName;
                var li3=document.createElement("li");
                li3.innerText=news[i].newsContent;
                var li4=document.createElement("li");
                li4.innerText=news[i].startTime;
                var li5=document.createElement("li");
                li5.innerText=news[i].admin;
                var li6=document.createElement("li");
                var newsUpdate=document.createElement("button");
                newsUpdate.setAttribute("type","button");
                newsUpdate.className="update btn";
                newsUpdate.innerText="修改";
                var newsDelate=document.createElement("button");
                newsDelate.setAttribute("type","button");
                newsDelate.className="delete btn";
                newsDelate.innerText="删除";

                li1.appendChild(img);
                li6.appendChild(newsUpdate);
                li6.appendChild(newsDelate);
                newsUl.appendChild(li1);
                newsUl.appendChild(li2);
                newsUl.appendChild(li3);
                newsUl.appendChild(li4);
                newsUl.appendChild(li5);
                newsUl.appendChild(li6);
                activity1.appendChild(newsUl);
            }
        }
    });

    var pageNewsNum;
    $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/setNewsPage",
        async:false,
        success:function(data,status,jqXHR){
            var totalNews=data;
            var totalNewsNum=totalNews[0].total;
            pageNewsNum=Math.ceil(totalNewsNum/7);
        }
    });

    $.page({
        ele: '#page2 ul',
        curPage: 1, // 当前页
        visiblePages: 5, // 可见页码
        change: function(num) { // 回调
            $.ajax({
                method: "GET",
                dataType:"json",
                url:"http://localhost:8080/beautifulCity/nGuan",
                data:{'pageNumber':num},
                success:function(data,status,jqXHR){
                    $('.n-infomation').remove();
                    var activity1=document.getElementsByClassName("news-activity")[0];
                    var news=data;
                    for(var i=0;i<news.length;i++){
                        var newsUl=document.createElement("ul");
                        newsUl.className="n-a-info n-infomation";
                        var li1=document.createElement("li");
                        var img=document.createElement("img");
                        img.src=news[i].newsIcon;
                        var li2=document.createElement("li");
                        li2.innerText=news[i].newsName;
                        var li3=document.createElement("li");
                        li3.innerText=news[i].newsContent;
                        var li4=document.createElement("li");
                        li4.innerText=news[i].startTime;
                        var li5=document.createElement("li");
                        li5.innerText=news[i].admin;
                        var li6=document.createElement("li");
                        var newsUpdate=document.createElement("button");
                        newsUpdate.setAttribute("type","button");
                        newsUpdate.className="update btn";
                        newsUpdate.innerText="修改";
                        var newsDelate=document.createElement("button");
                        newsDelate.setAttribute("type","button");
                        newsDelate.className="delete btn";
                        newsDelate.innerText="删除";

                        li1.appendChild(img);
                        li6.appendChild(newsUpdate);
                        li6.appendChild(newsDelate);
                        newsUl.appendChild(li1);
                        newsUl.appendChild(li2);
                        newsUl.appendChild(li3);
                        newsUl.appendChild(li4);
                        newsUl.appendChild(li5);
                        newsUl.appendChild(li6);
                        activity1.appendChild(newsUl);
                    }
                }
            });
        },
        totalPages: pageNewsNum // 总页数
    });

    $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/setSenvenActivity",
        success:function(data,status,jqXHR){
            var activity2=document.getElementsByClassName("news-activity")[1];
            var ac=data;
            for(var i=0;i<ac.length;i++){
                var acUl=document.createElement("ul");
                acUl.className="n-a-info a-information";
                var li1=document.createElement("li");
                var acImg=document.createElement("img");
                acImg.src=ac[i].acIcon;
                var li2=document.createElement("li");
                li2.innerText=ac[i].acName;
                var li3=document.createElement("li");
                li3.innerText=ac[i].acContent;
                var li4=document.createElement("li");
                li4.innerText=ac[i].startTime;
                var li5=document.createElement("li");
                li5.innerText=ac[i].admin;
                var li6=document.createElement("li");
                var acBtn1=document.createElement("button");
                acBtn1.setAttribute("type","button");
                acBtn1.className="update btn";
                acBtn1.innerText="修改";
                var acBtn2=document.createElement("button");
                acBtn2.setAttribute("type","button");
                acBtn2.className="delete btn";
                acBtn2.innerText="删除";

                li1.appendChild(acImg);
                li6.appendChild(acBtn1);
                li6.appendChild(acBtn2);
                acUl.appendChild(li1);
                acUl.appendChild(li2);
                acUl.appendChild(li3);
                acUl.appendChild(li4);
                acUl.appendChild(li5);
                acUl.appendChild(li6);
                activity2.appendChild(acUl);
            }
        }
    });

    var pageAcNum;
    $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/setActivityPage",
        async:false,
        success:function(data,status,jqXHR){
            var totalAc=data;
            var totalAcNum=totalAc[0].total;
            pageAcNum=Math.ceil(totalAcNum/7);
        }
    });

    $.page({
        ele: '#page3 ul',
        curPage: 1, // 当前页
        visiblePages: 5, // 可见页码
        change: function(num) { // 回调
            $.ajax({
                method: "GET",
                dataType:"json",
                url:"http://localhost:8080/beautifulCity/aGuan",
                data:{'aNumber':num},
                success:function(data,status,jqXHR){
                    $('.a-information').remove();
                    var activity2=document.getElementsByClassName("news-activity")[1];
                    var ac=data;
                    for(var i=0;i<ac.length;i++){
                        var acUl=document.createElement("ul");
                        acUl.className="n-a-info a-information";
                        var li1=document.createElement("li");
                        var acImg=document.createElement("img");
                        acImg.src=ac[i].acIcon;
                        var li2=document.createElement("li");
                        li2.innerText=ac[i].acName;
                        var li3=document.createElement("li");
                        li3.innerText=ac[i].acContent;
                        var li4=document.createElement("li");
                        li4.innerText=ac[i].startTime;
                        var li5=document.createElement("li");
                        li5.innerText=ac[i].admin;
                        var li6=document.createElement("li");
                        var acBtn1=document.createElement("button");
                        acBtn1.setAttribute("type","button");
                        acBtn1.className="update btn";
                        acBtn1.innerText="修改";
                        var acBtn2=document.createElement("button");
                        acBtn2.setAttribute("type","button");
                        acBtn2.className="delete btn";
                        acBtn2.innerText="删除";

                        li1.appendChild(acImg);
                        li6.appendChild(acBtn1);
                        li6.appendChild(acBtn2);
                        acUl.appendChild(li1);
                        acUl.appendChild(li2);
                        acUl.appendChild(li3);
                        acUl.appendChild(li4);
                        acUl.appendChild(li5);
                        acUl.appendChild(li6);
                        activity2.appendChild(acUl);
                    }
                }
            });
        },
        totalPages: pageAcNum // 总页数
    });
}
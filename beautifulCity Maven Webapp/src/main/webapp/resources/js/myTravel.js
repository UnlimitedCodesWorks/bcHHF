$(function(){
    $('#fallDown').click(function() {
        $('#navTop').stop(true,false).animate({top:"0px"});
        $(this).hide();
    });
    $('#navTop').mouseout(function() {
        $(this).stop(true,false).animate({top:"-55px"});
        $('#fallDown').show();
    });
    $('#navTop').mouseover(function() {
        $(this).stop(true,false).animate({top:"0px"});
        $('#fallDown').hide();
    });

    var sWidth = $("#slider_name").width();
    var len = $("#slider_name .silder_panel").length;
    var index = 0;
    var picTimer;

    var btn = "<a class='prev'></a><a class='next'></a>";
    $("#slider_name").append(btn);

    $("#slider_name .silder_nav li").css({"opacity":"0.6","filter":"alpha(opacity=60)"}).mouseenter(function() {
        index = $("#slider_name .silder_nav li").index(this);
        showPics(index);
    }).eq(0).trigger("mouseenter");

    $("#slider_name .prev,#slider_name .next").css({"opacity":"0.2","filter":"alpha(opacity=20)"}).hover(function(){
        $(this).stop(true,false).animate({"opacity":"0.6","filter":"alpha(opacity=60)"},300);
    },function() {
        $(this).stop(true,false).animate({"opacity":"0.2","filter":"alpha(opacity=20)"},300);
    });


    // Prev
    $("#slider_name .prev").click(function() {
        index -= 1;
        if(index == -1) {index = len - 1;}
        showPics(index);
    });

    // Next
    $("#slider_name .next").click(function() {
        index += 1;
        if(index == len) {index = 0;}
        showPics(index);
    });

    //
    $("#slider_name .silder_con").css("width",sWidth * (len));

    // mouse
    $("#slider_name").hover(function() {
        clearInterval(picTimer);
    },function() {
        picTimer = setInterval(function() {
            showPics(index);
            index++;
            if(index == len) {index = 0;}
        },3000);
    }).trigger("mouseleave");

    // showPics
    function showPics(index) {
        var nowLeft = -index*sWidth;
        $("#slider_name .silder_con").stop(true,false).animate({"left":nowLeft},300);
        $("#slider_name .silder_nav li").removeClass("current").eq(index).addClass("current");
        $("#slider_name .silder_nav li").stop(true,false).animate({"opacity":"0.5"},300).eq(index).stop(true,false).animate({"opacity":"1"},300);
        $("#slider_name .silder_intro").stop(true,false).animate({"opacity":"0"},300).eq(index).stop(true,false).animate({"opacity":"1"},300);
    }

    var xqTitle;
    $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/setTitle",
        async:false,
         success:function(data,status,jqXHR){
            var itemInfo=document.getElementsByClassName("itemInfo")[0];
            var item=data;
            var head=document.createElement("h3");
            head.className="item-head";
            head.innerHTML=item[0].tripTitle;
            xqTitle=head.innerHTML;
            var price=document.createElement("div");
            price.className="item-price";
            price.innerHTML="<span class=\"fa fa-cny\"></span>"+item[0].tripPrice;
            var service1Div=document.createElement("div");
            service1Div.className="service";
            service1Div.id="service1";
            service1Div.innerHTML="服务保障<span>放心游</span><span>攻略完备</span><span>满意度高</span>";
            var service2Div=document.createElement("div");
            service2Div.className="service";
            service2Div.innerText="旅行时间";
            var go=document.createElement("span");
            var back=document.createElement("span");
            go.className="go-trip";
            back.className="back-trip";
            go.innerHTML=item[0].tripStart;
            back.innerHTML=item[0].tripEnd;
            var service3Div=document.createElement("div");
            service3Div.className="service";
            service3Div.innerText="行程推荐";
            var cw=document.createElement("div");
            cw.className="ceo-words";
            var ceo=document.createElement("div");
            ceo.className="ceo";
            var cm=document.createElement("img");
            cm.src="resources/images/ceo.jpg";
            var words=document.createElement("div");
            words.className="words";
            var h5=document.createElement("h5");
            h5.innerHTML="产品经理推荐";
            var p1=document.createElement("p");
            var p2=document.createElement("p");
            var p3=document.createElement("p");
            p1.innerHTML="★优美的风景曲线铸造该地独特的气息,使人非常愉悦~";
            p2.innerHTML="★四季如一,让该地充满着生物的气息。";
            p3.innerHTML="★无论何时,该乡村总会被外来人群所淹没~";

            ceo.appendChild(cm);
            words.appendChild(h5);
            words.appendChild(p1);
            words.appendChild(p2);
            words.appendChild(p3);
            cw.appendChild(ceo);
            cw.appendChild(words);

            document.getElementsByClassName("special-body")[0].innerText=item[0].specialContent;

            itemInfo.appendChild(head);
            itemInfo.appendChild(price);
            itemInfo.appendChild(service1Div);
            itemInfo.appendChild(service2Div);
            itemInfo.appendChild(go);
            itemInfo.appendChild(back);
            itemInfo.appendChild(service3Div);
            itemInfo.appendChild(cw);
         }
    });


    $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/getSpeTitle",
        data:{'travelTitle':xqTitle},
        success:function(data,status,jqXHR){
            var spe=data;
            for(var i=1;i<=spe.length;i++){
                if(spe[i-1].specialType=="景点"){
                    document.getElementById("panel"+i).src=spe[i-1].specialImg;
                    document.getElementById("dec"+i).src=spe[i-1].specialImg;
                    document.getElementsByClassName("t")[i-1].innerText=spe[i-1].speImgTitle;
                    document.getElementById("c"+i).innerHTML=spe[i-1].speImgContent;
                    document.getElementById("sm"+i).src=spe[i-1].specialImg;
                }
                else{
                    document.getElementsByClassName("hotel-title")[i-5].innerHTML=spe[i-1].speImgTitle;
                    document.getElementsByClassName("hotel-con")[i-5].innerText=spe[i-1].speImgContent;
                    document.getElementById("ho"+i).src=spe[i-1].specialImg;
                }
            }
        }
    });

    $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/setLook",
        data:{'title':xqTitle},
        success:function(data,status,jqXHR){
            var overview=document.getElementsByClassName("overview")[0];
            var look=data;
            var dayAmounts=look[0].tripDay;
            outer:
            for(var i=1;i<=dayAmounts;i++){
                var route=document.createElement("h5");
                route.className="route route_"+i;
                var iId=document.createElement("i");
                iId.className="c_day";
                iId.innerText="D"+i;
                var spanHead=document.createElement("span");
                spanHead.className="traffic";
                if(i==1){
                    spanHead.innerText="交通：出发";
                }
                else{
                    spanHead.innerText="酒店：出发";
                }

                route.appendChild(iId);
                route.appendChild(spanHead);

                inner:
                for(var j=1;j<=look.length;j++){
                    if(look[j-1].day==i){
                        var spots=document.createElement("span");
                        spots.className="v_spots";
                        spots.innerHTML="<i class=\"arrow-big\"></i>"+look[j-1].place;
                        route.appendChild(spots);
                    }
                }
                overview.appendChild(route);
            }
        }
    });


    //以下是地图部分！！！
    var arr=[];

    var map=new AMap.Map('mapTravel',{
        mapStyle: 'amap://styles/6bc0ab51fc148bb0041f941ce84c6005',
        resizeEnable: true
    });

    var polyline=new AMap.Polyline({
        map:map,
        strokeColor:"#1685a9"
    });

    $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/getSpots",
        data:{'tl':xqTitle},
        success:function(data,status,jqXHR){
            var spots=data;
            for(var i=0;i<spots.length;i++){
                addPlace(spots[i].place,spots[i].placeTitle,spots[i].placeContent,spots[i].placeImg);
            }
        }
    });

    // var place="蛇岛";                       //数据库,item.xxx
    // var title="千岛湖蛇岛";                 //数据库,item.xxx
    // var content="千岛湖蛇岛原名五龙岛，岛上有四个蛇池。蛇池内有水池、喷泉、土丘、灌木丛、洞穴、冬眠室等，放养了十几个品种的二三百条蛇，多数是毒蛇，如蕲蛇、蝮蛇、五步蛇、竹叶青、眼镜蛇、美女蛇等。";           //数据库,item.xxx
    // var img="resources/images/index2.jpg";     //数据库,item.xxx
    // var place2="神龙岛";
    // var place3="森林氧吧";
    // var place4="金峰峡谷漂流";

    // addPlace(place);
    // addPlace(place2);
    // addPlace(place3);
    // addPlace(place4);                        //数据局库读取法！！！！！

    //加载每个地点的标记！！
    function addPlace(place,tt,ct,pi){
        var geo;
        map.plugin(['AMap.Geocoder'],function(){
            geo=new AMap.Geocoder({
                radius:1000
            });
            map.addControl(geo);
        });
        geo.getLocation(place,function(status,result){
            if (status === 'complete' && result.info === 'OK'){
                callback(result,tt,ct,pi);
            }
        });
    }

    //得到经纬度,生成标记！！！！
    function callback(data,title,content,img){
        var geocode = data.geocodes;
        for (var i = 0; i < geocode.length; i++){
            addMarker(i, geocode[i],title,content,img);
        }
        map.setFitView();
    }

    //得到标记且生成折线！！！！！！
    function addMarker(i,d,title,content,img){
        var marker = new AMap.Marker({
            map: map,
            position: [ d.location.getLng(),  d.location.getLat()]
        });
        var line=new AMap.LngLat(d.location.getLng(),d.location.getLat());
        arr.push(line);
        polyline.setPath(arr);

        //加信息窗！！！
        var infoWindow=new AMap.InfoWindow({
            isCustom: true,
            content:createInfoWindow(title,content,img),       //item.xxx
            offset: new AMap.Pixel(16, -45)
        });

        AMap.event.addListener(marker,'mouseover',function(){
            infoWindow.open(map,marker.getPosition());
        });
    }

    //加信息窗内容！！！！！！！！
    function createInfoWindow(title,content,img){
        var info=document.createElement("div");
        info.className="information";
        var infoImg=document.createElement("img");
        infoImg.className="infoImg";
        infoImg.src=img;
        var infoTitle=document.createElement("div");
        infoTitle.className="infoTitle";
        infoTitle.innerHTML=title;
        var infoContent=document.createElement("div");
        infoContent.className="infoContent";
        infoContent.innerHTML=content;
        var closex = document.createElement("img");
        closex.className="x";
        closex.src = "resources/images/close.png";
        closex.onclick = closeInfo;

        info.appendChild(closex);
        info.appendChild(infoImg);
        info.appendChild(infoTitle);
        info.appendChild(infoContent);
        return info;
    }

    //关闭信息窗！！！
    function closeInfo() {
        map.clearInfoWindow();
    }
});
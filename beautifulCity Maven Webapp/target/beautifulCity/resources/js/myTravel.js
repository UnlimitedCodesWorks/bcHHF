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

    var place="蛇岛";                       //数据库,item.xxx
    var title="千岛湖蛇岛";                 //数据库,item.xxx
    var content="千岛湖蛇岛原名五龙岛，岛上有四个蛇池。蛇池内有水池、喷泉、土丘、灌木丛、洞穴、冬眠室等，放养了十几个品种的二三百条蛇，多数是毒蛇，如蕲蛇、蝮蛇、五步蛇、竹叶青、眼镜蛇、美女蛇等。";           //数据库,item.xxx
    var img="assets/images/index2.jpg";     //数据库,item.xxx
    var place2="神龙岛";
    var place3="森林氧吧";
    var place4="金峰峡谷漂流";

    addPlace(place);
    addPlace(place2);
    addPlace(place3);
    addPlace(place4);                        //数据局库读取法！！！！！

    //加信息窗！！！
    var infoWindow=new AMap.InfoWindow({
        isCustom: true,
        content:createInfoWindow(title,content,img),       //item.xxx
        offset: new AMap.Pixel(16, -45)
    });

    //加载每个地点的标记！！
    function addPlace(place){
        var geo;
        map.plugin(['AMap.Geocoder'],function(){
            geo=new AMap.Geocoder({
                radius:1000
            });
            map.addControl(geo);
        });
        geo.getLocation(place,function(status,result){
            if (status === 'complete' && result.info === 'OK'){
                callback(result);
            }
        });
    }

    //得到经纬度,生成标记！！！！
    function callback(data){
        var geocode = data.geocodes;
        for (var i = 0; i < geocode.length; i++){
            addMarker(i, geocode[i]);
        }
        map.setFitView();
    }

    //得到标记且生成折线！！！！！！
    function addMarker(i,d){
        var marker = new AMap.Marker({
            map: map,
            position: [ d.location.getLng(),  d.location.getLat()]
        });
        var line=new AMap.LngLat(d.location.getLng(),d.location.getLat());
        arr.push(line);
        polyline.setPath(arr);
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
        closex.src = "assets/images/close.png";
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
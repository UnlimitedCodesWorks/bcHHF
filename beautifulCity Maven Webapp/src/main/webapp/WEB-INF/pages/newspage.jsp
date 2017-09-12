<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">

    <title>新闻详情</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/news_page.css">

  </head>

  <body>
    <div id="hotNews">
        <div class="hot-title">
            <img src="<%=request.getContextPath()%>/resources/images/hot.png">
            <span>热点新闻</span>
        </div>
        <div class="hot-content">
            <ul class="content-ul">
                <li><a class="content-a"></a></li>
                <li><a class="content-a"></a></li>
                <li><a class="content-a"></a></li>
                <li><a class="content-a"></a></li>
                <li><a class="content-a"></a></li>
                <li><a class="content-a"></a></li>
                <li><a class="content-a"></a></li>
                <li><a class="content-a"></a></li>
                <li><a class="content-a"></a></li>
                <li><a class="content-a"></a></li>
            </ul>
        </div>
    </div>
    <div id="news-topline">
        <ul>
            <li><a href="http://localhost:8080/beautifulCity/index">首页</a></li>
            <li><a href="http://localhost:8080/beautifulCity/newshome">新闻</a></li>
            <li><a href="#">论坛</a></li>
        </ul>
    </div>
    <div id="newss-main">
        <div id="newss-main-top">
            <a href="http://localhost:8080/beautifulCity/newshome">新闻中心</a>><span id="newss-main-top-name"></span>
        </div>
        <div id="newss-main-body">
            <div id="newss-main-body-title">
                <div id="newss-main-body-title-name"></div>
                <div id="newss-main-body-title-admin">
                    发布人：<span id="admin-name"></span>发布时间：<span id="push-time"></span>
                </div>
            </div>
            <br>
            <br>
            <div id="newss-main-body-neirong"></div>
            <div class="space"></div>
            <div id="newss-main-body-picture">
                <ul class="pic-ul">
                    <li>
                        <img class="npms" />
                        <p class="npts"></p>
                    </li>
                    <li>
                        <img class="npms" />
                        <p class="npts"></p>
                    </li>
                </ul>
            </div>
            <div class="space"></div>
        </div>
        <div class="space"></div>
    </div>
    <script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
    <script>
        window.onload=function(){
            $.ajax({
                method: "GET",
                url:"http://localhost:8080/beautifulCity/getNewsJosn",
                dataType:"json",
                success:function(data,status,jqXHR){
                    var nws=data;
                    document.getElementById("newss-main-top-name").innerHTML=nws[0].newsName;
                    document.getElementById("newss-main-body-title-name").innerHTML=nws[0].newsName;
                    document.getElementById("admin-name").innerHTML=nws[0].admin;
                    document.getElementById("push-time").innerHTML=nws[0].startTime;
                    document.getElementById("newss-main-body-neirong").innerText=nws[0].newsContent;
                }
            });

            $.ajax({
                method: "GET",
                url:"http://localhost:8080/beautifulCity/getNewsPicture",
                dataType:"json",
                success:function(data,status,jqXHR){
                    var nps=data;
                    var npms=document.getElementsByClassName("npms");
                    var npts=document.getElementsByClassName("npts");
                    for(var i=0;i<nps.length;i++){
                        npms[i].src=nps[i].newsImage;
                        npts[i].innerText=nps[i].newsImgTitle;
                    }
                }
            });

            $.ajax({
                method: "GET",
                url:"http://localhost:8080/beautifulCity/hot",
                dataType:"json",
                success:function(data,status,jqXHR){
                    var hot=data;
                    var contentA=document.getElementsByClassName("content-a");
                    for(var i=0;i<hot.length;i++){
                        contentA[i].innerText=hot[i].newsName;
                        contentA[i].onclick=opennews;
                        contentA[i].href="http://localhost:8080/beautifulCity/newspage";
                        contentA[i].target = "_blank";
                    }
                }
            });

            function opennews(){
                var nT=this.innerText;
                $.ajax({
                    method: "GET",
                    url:"http://localhost:8080/beautifulCity/getNewsTitle",
                    data:{'newsTitle':nT}
                });
            }
        }
    </script>
  </body>
</html>

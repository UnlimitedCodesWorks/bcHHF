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

    <title>活动</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/activity_page.css">
  </head>

  <body>
    <div id="activity-topline">
        <ul>
            <li><a href="http://localhost:8080/beautifulCity/index">首页</a></li>
            <li><a href="http://localhost:8080/beautifulCity/newshome">新闻</a></li>
            <li><a href="#">论坛</a></li>
        </ul>
    </div>
    <div id="activity-commend">
        <div id="activity-commend-title">
            推荐活动
        </div>
        <ul id="activity-commend-main">
            <li>
                <img class="commendImg" />
                <a class="commendTitle"></a>
            </li>
            <li>
                <img class="commendImg" />
                <a class="commendTitle"></a>
            </li>
            <li>
                <img class="commendImg" />
                <a class="commendTitle"></a>
            </li>
            <li>
                <img class="commendImg" />
                <a class="commendTitle"></a>
            </li>
            <li>
                <img class="commendImg" />
                <a class="commendTitle"></a>
            </li>
        </ul>
    </div>

    <div id="activity-main">
        <div id="activity-main-top">
            <a id="activity-back">活动</a>><span id="activity-main-top-name"></span>
        </div>
        <div id="activity-main-body">
            <div id="activity-main-body-title">
                <div id="activity-main-body-title-name"></div>
                <div id="activity-main-body-title-admin">
                    发布人：<span id="admin-name"></span>发布时间：<span id="push-time"></span>
                </div>
            </div>
            <div id="activity-main-body-neirong"></div>
            <div class="space"></div>
            <div id="activity-main-body-picture">
                <ul class="pic-ul">
                    <li>
                        <img class="acImg"></img>
                        <p class="acP"></p>
                    </li>
                    <li>
                        <img class="acImg"></img>
                        <p class="acP"></p>
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
                url:"http://localhost:8080/beautifulCity/acw",
                dataType:"json",
                success:function(data,status,jqXHR){
                    var aws=data;
                    document.getElementById("activity-main-top-name").innerHTML=aws[0].acName;
                    document.getElementById("activity-main-body-title-name").innerHTML=innerHTML=aws[0].acName;
                    document.getElementById("admin-name").innerHTML=aws[0].admin;
                    document.getElementById("push-time").innerHTML=aws[0].startTime;
                    document.getElementById("activity-main-body-neirong").innerHTML=aws[0].acContent;
                }
            });

            $.ajax({
                method: "GET",
                url:"http://localhost:8080/beautifulCity/acp",
                dataType:"json",
                success:function(data,status,jqXHR){
                    var acp=data;
                    for(var i=0;i<acp.length;i++){
                        document.getElementsByClassName("acImg")[i].src=acp[i].acImg;
                        document.getElementsByClassName("acP")[i].innerHTML=acp[i].acImgTitle;
                    }
                }
            });

            $.ajax({
                method: "GET",
                url:"http://localhost:8080/beautifulCity/acr",
                dataType:"json",
                success:function(data,status,jqXHR){
                    var acr=data;
                    for(var i=0;i<acr.length;i++){
                        document.getElementsByClassName("commendImg")[i].src=acr[i].acIcon;
                        document.getElementsByClassName("commendTitle")[i].innerHTML=acr[i].acName;
                        document.getElementsByClassName("commendTitle")[i].onclick=openActivity;
                        document.getElementsByClassName("commendTitle")[i].href="http://localhost:8080/beautifulCity/activity";
                        document.getElementsByClassName("commendTitle")[i].target = "_blank";
                    }
                }
            });

            function openActivity(){
                var rt=this.innerHTML;
                $.ajax({
                    method: "GET",
                    url:"http://localhost:8080/beautifulCity/activityWords",
                    dataType:"json",
                    data:{'atl':rt}
                });
            }
        }
    </script>
  </body>
</html>

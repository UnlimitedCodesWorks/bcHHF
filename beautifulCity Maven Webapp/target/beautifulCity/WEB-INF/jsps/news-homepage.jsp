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
    
    <title>新闻</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/news_homepage.css">

  </head>
  
  <body>
	<div id="news-topline">
        <ul>
            <li><a href="#">首页</a></li>
            <li><a href="#">新闻</a></li>
            <li><a href="#">论坛</a></li>
        </ul>
    </div>
    <div id="news-rollingnews">
        <ul id="news-rollingUL">
            <li><img /></li>
            <li><img /></li>
            <li><img /></li>
            <li><img /></li>
        </ul>
        <div id="rollingnews-title"></div>
    </div>
    <div id="news-main">
        <div id="news-main-title">
            新闻中心
        </div>
        <div id="news-main-body">
            <div id="news-main-body-title">
                <ul>
                    <li>新闻</li>
                    <li></li>
                </ul>
            </div>
            <div id="news-main-body-neirong">
                <ul>
                    <li></li>
                </ul>
                <ul class="news-main-body-ul">
                    <li>
                        <span class="news-main-body-span1">关于千岛湖湖水水质净化的处理</span>
                        <span class="news-main-body-span2">2017-08-11</span>
                    </li>
                </ul>
                <ul class="news-main-body-ul">
                    <li>
                        <span class="news-main-body-span1">关于千岛湖湖水水质净化的处理</span>
                        <span class="news-main-body-span2">2017-08-11</span>
                    </li>
                </ul>
                <ul class="news-main-body-ul">
                    <li>
                        <span class="news-main-body-span1">关于千岛湖湖水水质净化的处理</span>
                        <span class="news-main-body-span2">2017-08-11</span>
                    </li>
                </ul>
                <ul class="news-main-body-ul">
                    <li>
                        <span class="news-main-body-span1">关于千岛湖湖水水质净化的处理</span>
                        <span class="news-main-body-span2">2017-08-11</span>
                    </li>
                </ul>
                <ul class="news-main-body-ul">
                    <li>
                        <span class="news-main-body-span1">关于千岛湖湖水水质净化的处理</span>
                        <span class="news-main-body-span2">2017-08-11</span>
                    </li>
                </ul>
                <ul class="news-main-body-ul">
                    <li>
                        <span class="news-main-body-span1">关于千岛湖湖水水质净化的处理</span>
                        <span class="news-main-body-span2">2017-08-11</span>
                    </li>
                </ul>
                <ul class="news-main-body-ul">
                    <li>
                        <span class="news-main-body-span1">关于千岛湖湖水水质净化的处理</span>
                        <span class="news-main-body-span2">2017-08-11</span>
                    </li>
                </ul>
                <ul class="news-main-body-ul">
                    <li>
                        <span class="news-main-body-span1">关于千岛湖湖水水质净化的处理</span>
                        <span class="news-main-body-span2">2017-08-11</span>
                    </li>
                </ul>
                <ul class="news-main-body-ul">
                    <li>
                        <span class="news-main-body-span1">关于千岛湖湖水水质净化的处理</span>
                        <span class="news-main-body-span2">2017-08-11</span>
                    </li>
                </ul>
                <ul class="news-main-body-ul">
                    <li>
                        <span class="news-main-body-span1">关于千岛湖湖水水质净化的处理</span>
                        <span class="news-main-body-span2">2017-08-11</span>
                    </li>
                </ul>
            </div>
            <div class="prev-next">
                <button type="button" class="prev-btn news-btn">上一页</button>
                <button type="button" class="next-btn news-btn">下一页</button>
            </div>
        </div>
    </div>
    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/news-homepage.js"></script>
  </body>
</html>

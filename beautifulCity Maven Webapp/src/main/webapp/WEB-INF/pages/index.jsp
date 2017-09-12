<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html class="fsvs demo" lang="zh">
  <head>
    <base href="<%=basePath%>">

    <title>首页</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">

    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/myIndex.css">
    <link rel="stylesheet" href="http://cache.amap.com/lbs/static/main1119.css"/>

  </head>

  <body>
  	  <div id="nav">
            <ul>
                <li><a href="http://localhost:8080/beautifulCity/index">首页</a></li>
                <li><a href="http://localhost:8080/beautifulCity/newshome">新闻</a></li>
                <li><a href="#">论坛</a></li>
            </ul>
        </div>
        <div id="fsvs-body">
            <div class="slide">
                <div class="first"></div>
                <h1 id="onePageTitle">美丽乡村分布</h1>
                <div id="find">
                    <div>
                        <img src="<%=request.getContextPath()%>/resources/images/find.png">
                    </div>
                    <div>
                        <input type="text" id="findContent" placeholder="输入乡村名">
                    </div>
                </div>
                <div id="myMap">
                    <div id="resultDIV">
                        <span id="result"></span>
                    </div>
                </div>
            </div>
            <div class="slide">
                <div class="first"></div>
                <div class="news-main">
                    <div class="news-top">
                        <img src="<%=request.getContextPath()%>/resources/images/news.png">
                        <span class="news-title">新闻</span>
                        <a class="news-more" href="http://localhost:8080/beautifulCity/newshome">更多新闻>></a>
                    </div>
                    <div class="news-center">
                        <ul>
                            <li>
                                <div class="center-img">
                                    <img class="news-image" />
                                </div>
                                <div class="center-content">
                                    <a class="center-title"></a>
                                    <h6 class="center-body"></h6>
                                    <h6 class="center-time"></h6>
                                </div>
                            </li>
                            <li>
                                <div class="center-img">
                                    <img class="news-image" />
                                </div>
                                <div class="center-content">
                                    <a class="center-title"></a>
                                    <h6 class="center-body"></h6>
                                    <h6 class="center-time"></h6>
                                </div>
                            </li>
                            <li>
                                <div class="center-img">
                                    <img class="news-image" />
                                </div>
                                <div class="center-content">
                                    <a class="center-title"></a>
                                    <h6 class="center-body"></h6>
                                    <h6 class="center-time"></h6>
                                </div>
                            </li>
                            <li>
                                <div class="center-img">
                                    <img class="news-image" />
                                </div>
                                <div class="center-content">
                                    <a class="center-title"></a>
                                    <h6 class="center-body"></h6>
                                    <h6 class="center-time"></h6>
                                </div>
                            </li>
                            <li>
                                <div class="center-img">
                                    <img class="news-image" />
                                </div>
                                <div class="center-content">
                                    <a class="center-title"></a>
                                    <h6 class="center-body"></h6>
                                    <h6 class="center-time"></h6>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="slide">
                <div class="first"></div>
                <div id="newTrip">
                    <div class="head">
                        <label class="headLabel">
                            <img src="<%=request.getContextPath()%>/resources/images/newTrip.png">
                            <lable class="title">新村旅游</lable>
                        </label>
                    </div>
                    <div id="newContent">
                        <ul id="newInfo">
                            <li class="rowHeight">
                                <ul id="firstInfo" class="noStyle">
                                    <li><img><a class="a-more"></a></li>
                                    <li><img><a class="a-more"></a></li>
                                    <li><img><a class="a-more"></a></li>
                                    <li><img><a class="a-more"></a></li>
                                    <li><img><a class="a-more"></a></li>
                                </ul>
                            </li>
                            <li class="rowHeight">
                                <ul id="secondInfo" class="noStyle">
                                    <li><img><a class="a-more"></a></li>
                                    <li><img><a class="a-more"></a></li>
                                    <li><img><a class="a-more"></a></li>
                                    <li><img><a class="a-more"></a></li>
                                    <li><img><a class="a-more"></a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
                <div id="guess">
                    <div class="head">
                        <label class="headLabel">
                            <img src="<%=request.getContextPath()%>/resources/images/guess.png">
                            <lable class="title">猜你喜欢</lable>
                        </label>
                    </div>
                    <div id="guessContent">
                        <ul id="guessInfo">
                            <li><a class="guessTitle"></a></li>
                            <li><a class="guessTitle"></a></li>
                            <li><a class="guessTitle"></a></li>
                            <li><a class="guessTitle"></a></li>
                            <li><a class="guessTitle"></a></li>
                            <li><a class="guessTitle"></a></li>
                            <li><a class="guessTitle"></a></li>
                            <li><a class="guessTitle"></a></li>
                            <li><a class="guessTitle"></a></li>
                        </ul>
                    </div>
                </div>
                <div id="rank">
                    <div class="head">
                        <label class="headLabel">
                            <img src="<%=request.getContextPath()%>/resources/images/rank.png">
                            <lable class="title">旅行推荐</lable>
                        </label>
                    </div>
                    <div id="rankContent">
                        <ul id="rankInfo">
                            <li><a class="rankTitle"></a></li>
                            <li><a class="rankTitle"></a></li>
                            <li><a class="rankTitle"></a></li>
                            <li><a class="rankTitle"></a></li>
                            <li><a class="rankTitle"></a></li>
                            <li><a class="rankTitle"></a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="slide">
                <div class="first"></div>
                <div class="activity-main">
                    <div class="activity-top">
                        <img src="<%=request.getContextPath()%>/resources/images/activity.png">
                        <span>活动</span>
                    </div>
                    <div class="activity-body">
                        <ul id="bodyUl">
                            <li class="activity-center">
                                <div class="activity-img">
                                    <img class="acImg" />
                                </div>
                                <div class="activity-words">
                                    <a class="activity-title"></a>
                                    <h6 class="activity-content"></h6>
                                    <h6 class="activity-time"></h6>
                                </div>
                            </li>
                            <li class="activity-center">
                                <div class="activity-img">
                                    <img class="acImg" />
                                </div>
                                <div class="activity-words">
                                    <a class="activity-title"></a>
                                    <h6 class="activity-content"></h6>
                                    <h6 class="activity-time"></h6>
                                </div>
                            </li>
                            <li class="activity-center">
                                <div class="activity-img">
                                    <img class="acImg" />
                                </div>
                                <div class="activity-words">
                                    <a class="activity-title"></a>
                                    <h6 class="activity-content"></h6>
                                    <h6 class="activity-time"></h6>
                                </div>
                            </li>
                            <li class="activity-center">
                                <div class="activity-img">
                                    <img class="acImg" />
                                </div>
                                <div class="activity-words">
                                    <a class="activity-title"></a>
                                    <h6 class="activity-content"></h6>
                                    <h6 class="activity-time"></h6>
                                </div>
                            </li>
                            <li class="activity-center">
                                <div class="activity-img">
                                    <img class="acImg" />
                                </div>
                                <div class="activity-words">
                                    <a class="activity-title"></a>
                                    <h6 class="activity-content"></h6>
                                    <h6 class="activity-time"></h6>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
                <div id="datepicker"></div>
            </div>
        </div>
        <script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
        <script src="<%=request.getContextPath()%>/resources/js/verticalScreen.js"></script>
        <script src="<%=request.getContextPath()%>/resources/js/mainPage.js"></script>
        <script src="<%=request.getContextPath()%>/resources/js/myIndex.js"></script>
        <script src="<%=request.getContextPath()%>/resources/js/wordScroll.js"></script>
        <script src="<%=request.getContextPath()%>/resources/js/calendar.js"></script>
        <script src="<%=request.getContextPath()%>/resources/js/calendar-main.js"></script>
        <script src="http://cache.amap.com/lbs/static/es5.min.js"></script>
        <script src="http://webapi.amap.com/maps?v=1.3&key=599a60379379daeb2e772a29c67352a0"></script>
        <script>
            $(function(){
                $("#rankContent").Scroll({ direction: "y" }); //设置为纵向滚动
            });
        </script>
  </body>
</html>

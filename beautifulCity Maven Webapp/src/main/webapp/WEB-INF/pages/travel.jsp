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

    <title>旅游</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">

    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources//css/font-awesome.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources//css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources//css/travel.css">
    <link rel="stylesheet" href="http://cache.amap.com/lbs/static/main1119.css"/>

  </head>

  <body>
    <div id="fallDown">
        <img src="<%=request.getContextPath()%>/resources//images/down.png">
    </div>
    <div id="navTop">
        <ul>
            <li><a href="http://localhost:8080/beautifulCity/index">首页</a></li>
            <li><a href="http://localhost:8080/beautifulCity/newshome">新闻</a></li>
            <li><a href="#">论坛</a></li>
        </ul>
    </div>

    <div class="slider_box" id="slider_name">
        <div class="mask"></div>
        <ul class="silder_con">
            <li class="silder_panel"><img id="panel1" /></li>
            <li class="silder_panel"><img id="panel2" /></li>
            <li class="silder_panel"><img id="panel3" /></li>
            <li class="silder_panel"><img id="panel4" /></li>
        </ul>
        <div class="silder_intro">
            <h3 class="t"></h3>
            <div>
                <p id="c1"></p>
            </div>
        </div>
        <div class="silder_intro">
            <h3 class="t"></h3>
            <div>
                <p id="c2"></p>
            </div>
        </div>
        <div class="silder_intro">
            <h3 class="t"></h3>
            <div>
                <p id="c3"></p>
            </div>
        </div>
        <div class="silder_intro">
            <h3 class="t"></h3>
            <div>
                <p id="c4"></p>
            </div>
        </div>
        <ul class="silder_nav dec">
            <li><img id="dec1" /></li>
            <li><img id="dec2" /></li>
            <li><img id="dec3" /></li>
            <li><img id="dec4" /></li>
        </ul>
    </div>

    <div class="itemInfo"></div>

    <div class="container">
        <nav id="navbar-example" class="navbar navbar-default navbar-static" role="navigation">
            <div class="navbar-header">
                <button class="navbar-toggle" type="button" data-toggle="collapse"
                        data-target=".bs-js-navbar-scrollspy">
                    <span class="sr-only">切换导航</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand">旅行须知</a>
            </div>
            <div class="collapse navbar-collapse bs-js-navbar-scrollspy">
                <ul class="nav navbar-nav">
                    <li><a href="travel#special">行程特色</a></li>
                    <li><a href="travel#summary">行程概要</a></li>
                    <li><a href="travel#notice">出行须知</a></li>
                    <li><a href="travel#evaluate">用户点评</a></li>
                </ul>
            </div>
        </nav>
        <div data-spy="scroll" data-target="#navbar-example" data-offset="0">
            <h4 id="special" class="sign">旅行特色<i class="icon icon-1"></i></h4>
            <div class="special-content">
                <p class="special-head">行程包含</p>
                <p class="special-body"></p>
                <p class="special-head">特色地点</p>
                <p class="special-img">
                    <img id="sm1">
                    <img id="sm2">
                    <img id="sm3">
                    <img id="sm4">
                </p>
                <p class="special-head">特色酒店</p>
                <p class="hotel-img">
                    <div class="hotel-row">
                        <div class="hotel-title-con">
                            <p class="hotel-title"></p>
                            <p class="hotel-con"></p>
                        </div>
                        <div class="h-image">
                            <img id="ho5" />
                        </div>
                    </div>
                    <div class="hotel-row">
                        <div class="h-image">
                            <img id="ho6" />
                        </div>
                        <div class="hotel-title-con">
                            <p class="hotel-title"></p>
                            <p class="hotel-con"></p>
                        </div>
                    </div>
                    <div class="hotel-row">
                        <div class="hotel-title-con">
                            <p class="hotel-title"></p>
                            <p class="hotel-con"></p>
                        </div>
                        <div class="h-image">
                            <img id="ho7" />
                        </div>
                    </div>
                </p>
            </div>
            <h4 id="summary" class="sign">行程概要<i class="icon icon-2"></i></h4>
            <div id="mapTravel"></div>
            <div class="overview">
                <h3 class="viewHead">行程概览：</h3>
            </div>
            <h4 id="notice" class="sign">出行须知<i class="icon icon-3"></i></h4>
            <div class="notice-body">
                <div class="notice-full">
                    <p class="notice-head">出行指南及法规</p>
                    <ol class="notice-content">
                        <li>为了您人身、财产的安全，请您避免在公开场合暴露贵重物品及大量现金。上街时需时刻看管好首饰、相机等随身物品。</li>
                        <li>游泳、漂流、潜水、滑雪、溜冰、戏雪等活动项目，均存在危险。参与前请根据自身条件，并充分参考当地相关部门及其它专业机构的相关公告和建议后量力而行。</li>
                        <li>乘坐国内航班的旅客，居民身份证过期不能继续使用。若有效期满的，可以凭临时居民身份证或公安机关出具的贴有本人近期免冠证件照、并加盖户籍专用章、注明有效期的《申领居民身份证回执》作为有效乘机身份证件替代使用。同时中华人民共和国护照可以作为有效乘机身份证件，办理国内航班购票、值机、安检手续；旅客乘坐国内航班，办理购票、值机、安检手续时，应当使用同一个有效乘机身份证件。中国大陆地区居民使用往来港澳通行证、往来台湾通行证乘坐国内航班的旅客，必须同时提供居民身份证或者民用机场公安机关签发的《乘坐民航飞机临时身份证明》才可办理登机手续。 特别提醒：凡是乘机的16周岁以下中国大陆地区居民（包含婴儿），务必出示包括出生证明、户口薄或户口所在地公安机关出具的身份证明（16周岁以下的人需在户籍所在地派出所出具身份证明，机场派出所无法开具临时证明）才可办理登机手续。 具体实施细则以机场相关部门指导意见为准。</li>
                        <li>为确保锂电池的安全运输，避免发生不安全事件，我们友情提醒您，民航局将对旅客携带锂电池乘机进行严格检查。详情请参考 民航局关于旅客行李中携带“锂电池、充电宝”乘机规定的公告。</li>
                    </ol>
                </div>
                <div class="notice-full">
                    <p class="notice-head">旅途中的注意事项</p>
                    <ol class="notice-content">
                        <li>不要在街上长时间接打电话，确实需要时请进入路边的超市、商场、商铺等安全的地方，不要在靠车窗位置接打电话、玩弄手机、放置包裹等。</li>
                        <li>徒步行走时要遵守交通法规，在远离快车道的路基内侧或靠右行走，挎包方式以右肩和斜跨，包要放在身前。从以往发生的摩托车抢劫来看几乎都发生马路边上或自行车道中间。</li>
                        <li>避免在火车站或汽车站随意向人问路，如需问询请询问工作人员，避免被居心叵测的人误导和利用。</li>
                        <li>避免在火车站或汽车站购买东西，避免在火车站或汽车站打公用电话，车站大部分都是掺假货物而且价格昂贵，有时因询价不买而使自己不能脱身。</li>
                        <li>入住旅店、宾馆后要知晓所居住楼层，房间号码，熟知火灾逃生的消防通道，妥善保管自己的物品，反锁房门，不要轻信服务电话的优惠服务和上门服务。</li>
                        <li>上车后行走时要时刻保持警惕，防止包裹被小偷割包，落座后不要将装有钱物的衣服挂在车上的衣帽钩上，中途下车购买物品时要注意周边人，防止钱物被盗。</li>
                        <li>不要将手机挂在胸前，不给一些不法分子创造条件，走路要走行人道的内侧，不要靠马路太近，更不要走到机动车道上，这样容易招骑车歹徒袭击</li>
                    </ol>
                </div>
            </div>
            <h4 id="evaluate" class="sign">用户点评<i class="icon icon-4"></i></h4>
            <div class="evaluate-body"></div>
        </div>
    </div>
    <script src="<%=request.getContextPath()%>/resources//js/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources//js/bootstrap.js"></script>
    <script src="<%=request.getContextPath()%>/resources//js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources//js/myTravel.js"></script>
    <script src="http://cache.amap.com/lbs/static/es5.min.js"></script>
    <script src="http://webapi.amap.com/maps?v=1.3&key=599a60379379daeb2e772a29c67352a0"></script>
  </body>
</html>

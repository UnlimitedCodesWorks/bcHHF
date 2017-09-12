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

    <title>美丽乡村后台管理系统</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/villageAdmin.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css">

  </head>

  <body>
    <div class="admin-top">
        <img src="<%=request.getContextPath()%>/resources/images/logo.png">
        <span>美丽乡村后台管理系统</span>
    </div>
    <div class="middle">
        <div class="ml">
            <ul id="mlUl">
                <li>乡村管理</li>
                <li>介绍管理</li>
                <li>旅游管理</li>
                <li>新闻管理</li>
                <li>活动管理</li>
            </ul>
        </div>
        <div class="mr">
        	<div id="v-guan">
                <div class="find">
                    <img src="<%=request.getContextPath()%>/resources/images/ss.png">
                    <input type="text" name="" placeholder="乡村名">
                    <button type="button" class="button">搜索</button>
                </div>
                <button type="button" class="add">+ 添加乡村</button>
                <div class="village">
                    <ul class="v-head">
                        <li>乡村LOGO</li>
                        <li>乡村名称</li>
                        <li>乡村简介</li>
                        <li>管理操作</li>
                    </ul>
                </div>
                <div class="zh-page zh-align-center" id="page1">
                    <ul></ul>
                </div>
            </div>
            <div id="i-guan">
                <ul id="infoItem" class="nav nav-tabs">
                    <li class="dropdown active">
                        <a id="myTabDrop1" class="dropdown-toggle" data-toggle="dropdown">美景管理<b class="caret"></b></a>
                        <ul class="dropdown-menu" role="menu" aria-labelledby="myTabDrop1">
                            <li><a href="villageAdmin#viewWords" tabindex="-1" data-toggle="tab">文字管理</a></li>
                            <li><a href="villageAdmin#viewPictures" tabindex="-1" data-toggle="tab">上传管理</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a id="myTabDrop2" class="dropdown-toggle" data-toggle="dropdown">文化管理<b class="caret"></b></a>
                        <ul class="dropdown-menu" role="menu" aria-labelledby="myTabDrop2">
                            <li><a href="villageAdmin#cultureWords" tabindex="-1" data-toggle="tab">文字管理</a></li>
                            <li><a href="villageAdmin#culturePictures" tabindex="-1" data-toggle="tab">上传管理</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a id="myTabDrop3" class="dropdown-toggle" data-toggle="dropdown">特产管理<b class="caret"></b></a>
                        <ul class="dropdown-menu" role="menu" aria-labelledby="myTabDrop3">
                            <li><a href="villageAdmin#specialWords" tabindex="-1" data-toggle="tab">文字管理</a></li>
                            <li><a href="villageAdmin#specialPictures" tabindex="-1" data-toggle="tab">上传管理</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a id="myTabDrop4" class="dropdown-toggle" data-toggle="dropdown">旅游管理<b class="caret"></b></a>
                        <ul class="dropdown-menu" role="menu" aria-labelledby="myTabDrop4">
                            <li><a href="villageAdmin#tripWords" tabindex="-1" data-toggle="tab">文字管理</a></li>
                            <li><a href="villageAdmin#tripPictures" tabindex="-1" data-toggle="tab">上传管理</a></li>
                        </ul>
                    </li>
                </ul>
                <div id="typeInfo" class="tab-content">
                    <div class="tab-pane fade in active" id="viewWords">
                        <form action="" method="post">
                            <table class="i-info">
                                <tr>
                                    <td>乡村名称：</td>
                                    <td><input type="text" name=""></td>
                                </tr>
                                <tr>
                                    <td>介绍标题：</td>
                                    <td><input type="text" name=""></td>
                                </tr>
                                <tr>
                                    <td>介绍内容：</td>
                                    <td><textarea rows="4" cols="30" name=""></textarea></td>
                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <input type="submit" value="提交"/>
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </div>
                    <div class="tab-pane fade" id="viewPictures">
                        <form action="" method="post" enctype="multipart/form-data">
                            <h3>美景介绍图片上传</h3>
                            <input type="file" name="">
                            <input type="submit" value="上传"/>
                        </form>
                    </div>
                    <div class="tab-pane fade" id="cultureWords">
                        <form action="" method="post">
                            <table class="i-info">
                                <tr>
                                    <td>乡村名称：</td>
                                    <td><input type="text" name=""></td>
                                </tr>
                                <tr>
                                    <td>介绍标题：</td>
                                    <td><input type="text" name=""></td>
                                </tr>
                                <tr>
                                    <td>介绍内容：</td>
                                    <td><textarea rows="4" cols="30" name=""></textarea></td>
                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <input type="submit" value="提交"/>
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </div>
                    <div class="tab-pane fade" id="culturePictures">
                        <form action="" method="post" enctype="multipart/form-data">
                            <h3>文化介绍图片上传</h3>
                            <input type="file" name="">
                            <input type="submit" value="上传"/>
                        </form>
                    </div>
                    <div class="tab-pane fade" id="specialWords">
                        <form action="" method="post">
                            <table class="i-info">
                                <tr>
                                    <td>乡村名称：</td>
                                    <td><input type="text" name=""></td>
                                </tr>
                                <tr>
                                    <td>介绍标题：</td>
                                    <td><input type="text" name=""></td>
                                </tr>
                                <tr>
                                    <td>介绍内容：</td>
                                    <td><textarea rows="4" cols="30" name=""></textarea></td>
                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <input type="submit" value="提交"/>
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </div>
                    <div class="tab-pane fade" id="specialPictures">
                        <form action="" method="post" enctype="multipart/form-data">
                            <h3>文化介绍图片上传</h3>
                            <input type="file" name="">
                            <input type="submit" value="上传"/>
                        </form>
                    </div>
                    <div class="tab-pane fade" id="tripWords">
                        <form action="" method="post">
                            <table class="i-info">
                                <tr>
                                    <td>乡村名称：</td>
                                    <td><input type="text" name=""></td>
                                </tr>
                                <tr>
                                    <td>介绍标题：</td>
                                    <td><input type="text" name=""></td>
                                </tr>
                                <tr>
                                    <td>介绍内容：</td>
                                    <td><textarea rows="4" cols="30" name=""></textarea></td>
                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <input type="submit" value="提交"/>
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </div>
                    <div class="tab-pane fade" id="tripPictures">
                        <form action="" method="post" enctype="multipart/form-data">
                            <h3>文化介绍图片上传</h3>
                            <input type="file" name="">
                            <input type="submit" value="上传"/>
                        </form>
                    </div>
                </div>
            </div>
            <div id="t-guan">
            </div>
            <div id="n-guan">
                <ul class="nav nav-tabs">
                    <li class="active"><a href="villageAdmin#nLook" data-toggle="tab">新闻管理</a></li>
                    <li><a href="villageAdmin#nItem" data-toggle="tab">新闻上传</a></li>
                    <li><a href="villageAdmin#nImg" data-toggle="tab">图片上传</a></li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane fade in active" id="nLook">
                        <div class="find">
                            <img src="<%=request.getContextPath()%>/resources/images/ss.png">
                            <input type="text" name="" placeholder="新闻名称">
                            <button type="button" class="button">搜索</button>
                        </div>
                        <div class="news-activity">
                            <ul class="n-a-head">
                                <li>新闻LOGO</li>
                                <li>新闻标题</li>
                                <li>新闻内容</li>
                                <li>发布时间</li>
                                <li>发布方名</li>
                                <li>管理操作</li>
                            </ul>
                        </div>
                        <div class="zh-page zh-align-center" id="page2">
                            <ul></ul>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="nItem">
                        <form action="" method="post" enctype="multipart/form-data">
                            <table class="i-info">
                                <tr>
                                    <td>新闻名称：</td>
                                    <td><input type="text" name=""></td>
                                </tr>
                                <tr>
                                    <td>新闻内容：</td>
                                    <td><textarea rows="4" cols="30" name=""></textarea></td>
                                </tr>
                                <tr>
                                    <td>发布时间：</td>
                                    <td><input type="text" name=""></td>
                                </tr>
                                <tr>
                                    <td>发布方名：</td>
                                    <td><input type="text" name=""></td>
                                </tr>
                                <tr>
                                    <td>新闻图标：</td>
                                    <td><input type="file" name=""></td>
                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <input type="submit" value="提交"/>
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </div>
                    <div class="tab-pane fade" id="nImg">
                        <form action="" method="post" enctype="multipart/form-data">
                            <h3>新闻图片上传</h3>
                            <input type="file" name="">
                            <input type="submit" value="上传"/>
                        </form>
                    </div>
                </div>
            </div>
            <div id="a-guan">
                <ul class="nav nav-tabs">
                    <li class="active"><a href="villageAdmin#aLook" data-toggle="tab">活动管理</a></li>
                    <li><a href="villageAdmin#aItem" data-toggle="tab">活动上传</a></li>
                    <li><a href="villageAdmin#aImg" data-toggle="tab">图片上传</a></li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane fade in active" id="aLook">
                        <div class="find">
                            <img src="<%=request.getContextPath()%>/resources/images/ss.png">
                            <input type="text" name="" placeholder="活动名称">
                            <button type="button" class="button">搜索</button>
                        </div>
                        <div class="news-activity">
                            <ul class="n-a-head">
                                <li>活动LOGO</li>
                                <li>活动标题</li>
                                <li>活动内容</li>
                                <li>发布时间</li>
                                <li>发布方名</li>
                                <li>管理操作</li>
                            </ul>
                        </div>
                        <div class="zh-page zh-align-center" id="page3">
                            <ul></ul>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="aItem">
                        <form action="" method="post" enctype="multipart/form-data">
                            <table class="i-info">
                                <tr>
                                    <td>活动名称：</td>
                                    <td><input type="text" name=""></td>
                                </tr>
                                <tr>
                                    <td>活动内容：</td>
                                    <td><textarea rows="4" cols="30" name=""></textarea></td>
                                </tr>
                                <tr>
                                    <td>发布时间：</td>
                                    <td><input type="text" name=""></td>
                                </tr>
                                <tr>
                                    <td>发布方名：</td>
                                    <td><input type="text" name=""></td>
                                </tr>
                                <tr>
                                    <td>活动图标：</td>
                                    <td><input type="file" name=""></td>
                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <input type="submit" value="提交"/>
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </div>
                    <div class="tab-pane fade" id="aImg">
                        <form action="" method="post" enctype="multipart/form-data">
                            <h3>活动图片上传</h3>
                            <input type="file" name="">
                            <input type="submit" value="上传"/>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/page.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/myVillageAdmin.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
  </body>
</html>

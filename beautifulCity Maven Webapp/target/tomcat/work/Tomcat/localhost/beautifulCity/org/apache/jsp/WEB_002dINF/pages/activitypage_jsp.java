/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-09-05 05:20:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class activitypage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("    <title>活动</title>\r\n");
      out.write("\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/activity_page.css\">\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <div id=\"activity-topline\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"http://localhost:8080/beautifulCity/index\">首页</a></li>\r\n");
      out.write("            <li><a href=\"http://localhost:8080/beautifulCity/newshome\">新闻</a></li>\r\n");
      out.write("            <li><a href=\"#\">论坛</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"activity-commend\">\r\n");
      out.write("        <div id=\"activity-commend-title\">\r\n");
      out.write("            推荐活动\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul id=\"activity-commend-main\">\r\n");
      out.write("            <li>\r\n");
      out.write("                <img class=\"commendImg\" />\r\n");
      out.write("                <a class=\"commendTitle\"></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <img class=\"commendImg\" />\r\n");
      out.write("                <a class=\"commendTitle\"></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <img class=\"commendImg\" />\r\n");
      out.write("                <a class=\"commendTitle\"></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <img class=\"commendImg\" />\r\n");
      out.write("                <a class=\"commendTitle\"></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <img class=\"commendImg\" />\r\n");
      out.write("                <a class=\"commendTitle\"></a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"activity-main\">\r\n");
      out.write("        <div id=\"activity-main-top\">\r\n");
      out.write("            <a id=\"activity-back\">活动</a>><span id=\"activity-main-top-name\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"activity-main-body\">\r\n");
      out.write("            <div id=\"activity-main-body-title\">\r\n");
      out.write("                <div id=\"activity-main-body-title-name\"></div>\r\n");
      out.write("                <div id=\"activity-main-body-title-admin\">\r\n");
      out.write("                    发布人：<span id=\"admin-name\"></span>发布时间：<span id=\"push-time\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"activity-main-body-neirong\"></div>\r\n");
      out.write("            <div class=\"space\"></div>\r\n");
      out.write("            <div id=\"activity-main-body-picture\">\r\n");
      out.write("                <ul class=\"pic-ul\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <img class=\"acImg\"></img>\r\n");
      out.write("                        <p class=\"acP\"></p>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <img class=\"acImg\"></img>\r\n");
      out.write("                        <p class=\"acP\"></p>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"space\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"space\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        window.onload=function(){\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                method: \"GET\",\r\n");
      out.write("                url:\"http://localhost:8080/beautifulCity/acw\",\r\n");
      out.write("                dataType:\"json\",\r\n");
      out.write("                success:function(data,status,jqXHR){\r\n");
      out.write("                    var aws=data;\r\n");
      out.write("                    document.getElementById(\"activity-main-top-name\").innerHTML=aws[0].acName;\r\n");
      out.write("                    document.getElementById(\"activity-main-body-title-name\").innerHTML=innerHTML=aws[0].acName;\r\n");
      out.write("                    document.getElementById(\"admin-name\").innerHTML=aws[0].admin;\r\n");
      out.write("                    document.getElementById(\"push-time\").innerHTML=aws[0].startTime;\r\n");
      out.write("                    document.getElementById(\"activity-main-body-neirong\").innerHTML=aws[0].acContent;\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                method: \"GET\",\r\n");
      out.write("                url:\"http://localhost:8080/beautifulCity/acp\",\r\n");
      out.write("                dataType:\"json\",\r\n");
      out.write("                success:function(data,status,jqXHR){\r\n");
      out.write("                    var acp=data;\r\n");
      out.write("                    for(var i=0;i<acp.length;i++){\r\n");
      out.write("                        document.getElementsByClassName(\"acImg\")[i].src=acp[i].acImg;\r\n");
      out.write("                        document.getElementsByClassName(\"acP\")[i].innerHTML=acp[i].acImgTitle;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                method: \"GET\",\r\n");
      out.write("                url:\"http://localhost:8080/beautifulCity/acr\",\r\n");
      out.write("                dataType:\"json\",\r\n");
      out.write("                success:function(data,status,jqXHR){\r\n");
      out.write("                    var acr=data;\r\n");
      out.write("                    for(var i=0;i<acr.length;i++){\r\n");
      out.write("                        document.getElementsByClassName(\"commendImg\")[i].src=acr[i].acIcon;\r\n");
      out.write("                        document.getElementsByClassName(\"commendTitle\")[i].innerHTML=acr[i].acName;\r\n");
      out.write("                        document.getElementsByClassName(\"commendTitle\")[i].onclick=openActivity;\r\n");
      out.write("                        document.getElementsByClassName(\"commendTitle\")[i].href=\"http://localhost:8080/beautifulCity/activity\";\r\n");
      out.write("                        document.getElementsByClassName(\"commendTitle\")[i].target = \"_blank\";\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            function openActivity(){\r\n");
      out.write("                var rt=this.innerHTML;\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    method: \"GET\",\r\n");
      out.write("                    url:\"http://localhost:8080/beautifulCity/activityWords\",\r\n");
      out.write("                    dataType:\"json\",\r\n");
      out.write("                    data:{'atl':rt}\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
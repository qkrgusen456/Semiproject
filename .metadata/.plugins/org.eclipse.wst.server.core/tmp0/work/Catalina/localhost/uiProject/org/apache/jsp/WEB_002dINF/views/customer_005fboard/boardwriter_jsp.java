/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.34
 * Generated at: 2020-06-01 09:26:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.customer_005fboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boardwriter_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/customer_board/../include/footer.jsp", Long.valueOf(1590935123427L));
    _jspx_dependants.put("/WEB-INF/views/customer_board/../include/header_menu.jsp", Long.valueOf(1591002295064L));
    _jspx_dependants.put("/WEB-INF/views/customer_board/../include/header_index.jsp", Long.valueOf(1590932179513L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1588293609789L));
    _jspx_dependants.put("jar:file:/C:/ikosmo64/webapp/projectworkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/uiProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("  \t\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"EUC-KR\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("        <title>Grayscale - Start Bootstrap Theme</title>\r\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\" />\r\n");
      out.write("        <!-- Font Awesome icons (free version)-->\r\n");
      out.write("        <script src=\"https://use.fontawesome.com/releases/v5.12.1/js/all.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <!-- Google fonts-->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Varela+Round\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("        <link href=\"resources/css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"resources/css/customer_board/boardwriter.css\">\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("    <body id=\"page-top\">\r\n");
      out.write("       \r\n");
      out.write("          <nav class=\"navbar navbar-expand-lg navbar-light fixed-top\" id=\"mainNav2\" >\r\n");
      out.write("         <div class=\"container .col-md-12\">\r\n");
      out.write("                <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">메인메뉴테스트</a><button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">Menu<i class=\"fas fa-bars\"></i></button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("                 <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                        <li class=\"nav-item2\"><a class=\"nav-link2 js-scroll-trigger\" href=\"#about\">강온유님 환영합니다.</a></li>\r\n");
      out.write("                      \r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"navbar-nav ml-auto2\">\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"semi.Project?page=estate&code=2\">매물 등록</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" onclick=\"location = 'semi.Project?page=community&code=1'\">커뮤니티</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"semi.Project?page=customer&code=1\">고객센터</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"semi.Project?page=commercial&subcode=98\">상가</a></li>\r\n");
      out.write("                            \r\n");
      out.write("                    </ul>\r\n");
      out.write("                      <ul class=\"navbar-nav ml-auto2\">\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"#about\">내정보</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"#projects\">로그아웃</a></li>\r\n");
      out.write("                    \r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("            </nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<form method=\"get\" action=\"write_action.php\">\r\n");
      out.write("\t\t<table\r\n");
      out.write("\t\t\tstyle=\"padding-top: 50px; align: center; width: 700px; border: 0; cellpadding: 2;\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=20 align=center bgcolor=#ccc><font color=white>\r\n");
      out.write("\t\t\t\t\t\t문의내용</font></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td bgcolor=white>\r\n");
      out.write("\t\t\t\t\t<table class=\"table2\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>문의 종류</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><select class=\"form-control\" id=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>배고파요</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>집에 보내주세요</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>월급 언제나옴?</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>바다 가고 싶다</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>11111111111111111111111111111111111111</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>작성자</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=text name=name size=20></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>문의내용</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=text name=title size=60></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>내용</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><textarea name=content cols=85 rows=15></textarea></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>비밀번호</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=password name=pw size=10 maxlength=10></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<center>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"제출하기\">\r\n");
      out.write("\t\t\t\t\t</center>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("  <!-- Footer-->\r\n");
      out.write("        <footer class=\"footer bg-black small text-center text-white-50\"><div class=\"container\">Copyright ⓒ   Your Website 2020</div></footer>\r\n");
      out.write("        <!-- Bootstrap core JS-->\r\n");
      out.write("      \r\n");
      out.write("        <script\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <!-- Third party plugin JS-->\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js\"></script>\r\n");
      out.write("        <!-- Core theme JS-->\r\n");
      out.write("        <script src=\"resources/js/scripts.js\"></script>\r\n");
      out.write("        <script src=\"resources/js/text.js\"></script>\r\n");
      out.write("         <script>\r\n");
      out.write("         $(function() {\r\n");
      out.write("        \t \r\n");
      out.write("        \t    $(\".typer\").typed({\r\n");
      out.write("         \t\t    strings: [\" C조 Project\", \" Test용 문구\", \" 조장 : 박현두\", \" 대박임\"],\r\n");
      out.write("         \t\t    typeSpeed: 500,\r\n");
      out.write("         \t\t    backDelay: 1500,\r\n");
      out.write("         \t\t    showCursor: false\r\n");
      out.write("         \t\t});\r\n");
      out.write("        \t    $('#filter_close').click(function() {\n");
      out.write("        \t    \t$('.filter-page').slideUp(1000).addClass('invisible').removeClass('visible');\r\n");
      out.write("        \t    \tclassName='invisible';\r\n");
      out.write("        \t    \tinvisible='invisible';\r\n");
      out.write("        \t    \tvisible='visible';\r\n");
      out.write("        \t    \t        \n");
      out.write("        \t    })\r\n");
      out.write("        \t    \r\n");
      out.write("        \t    $('.card').click(function() {\n");
      out.write("        \t    \t\tvar num=$(this).index();\r\n");
      out.write("        \t    \t\tconsole.log(num)\n");
      out.write("        \t    });\r\n");
      out.write("        \t    var invisible='invisible';\r\n");
      out.write("        \t    var visible='visible';\r\n");
      out.write("        \t    var className='invisible';\r\n");
      out.write("        \t   $('.filter-div').children('.btn').click(function() {\r\n");
      out.write("        \t\t  \r\n");
      out.write("           \t\t \r\n");
      out.write("        \t\t   \t$('.filter-page').removeClass(invisible);\r\n");
      out.write("       \t   \t\t\t$('.filter-page').addClass(visible);\r\n");
      out.write("        \t\t \tif(className === 'visible'){\r\n");
      out.write("        \t\t \t      \r\n");
      out.write("        \t\t \t\t$('.filter-page').slideUp(1000);\r\n");
      out.write("        \t\t \t\t\r\n");
      out.write("        \t\t \t}else {\r\n");
      out.write("        \t\t \t\t\r\n");
      out.write("        \t\t \t\t$('.filter-page').slideDown(1000);\r\n");
      out.write("        \t\t \t\t\r\n");
      out.write("        \t\t \t}\n");
      out.write("        \t\t \t\t\r\n");
      out.write("            \t   \t\tclassName=visible;\r\n");
      out.write("            \t   \t\tvisible=invisible;\r\n");
      out.write("            \t   \t\tinvisible=className;\n");
      out.write("        \t\t \t\r\n");
      out.write("        \t\t \t\n");
      out.write("        \t\t \t\n");
      out.write("        \t   });\r\n");
      out.write("        \t    \r\n");
      out.write("        \t    \r\n");
      out.write("\t\t});\r\n");
      out.write("         \r\n");
      out.write("     \r\n");
      out.write("                    </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

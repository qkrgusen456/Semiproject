/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.34
 * Generated at: 2020-06-01 03:27:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.auction;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class auction_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/auction/../include/footer.jsp", Long.valueOf(1590935123427L));
    _jspx_dependants.put("/WEB-INF/views/auction/../include/header_index.jsp", Long.valueOf(1590932179513L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1588293609789L));
    _jspx_dependants.put("jar:file:/C:/ikosmo64/webapp/projectworkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/uiProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/auction/../include/header_menu.jsp", Long.valueOf(1590938721116L));
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

      out.write("\r\n");
      out.write("\r\n");
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
      out.write("<link rel=\"stylesheet\" href=\"resources/css/auction/main/bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/auction/HuskyEZCreator.js\" charset=\"EUC-KR\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/auction/auction_add.js\"></script>\r\n");
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
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"#projects\">커뮤니티</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"#signup\">고객센터</a></li>\r\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"semi.Project?page=commercial&subcode=98\">상가</a></li>\r\n");
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
      out.write("<!--<script type=\"text/javascript\" src=\"/_AXJ/jquery/jquery.min.js\"></script>-->\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div style=\"width: 1500px;margin: 80px auto;\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"#\">부동산경매</a>\r\n");
      out.write("\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\tdata-target=\"#navbarColor01\" aria-controls=\"navbarColor01\"\r\n");
      out.write("\t\t\t\taria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbarColor01\">\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">물건검색 </a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">판매관리</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">구매관리</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\" href=\"#\">부동산등록</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">경매정보</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<form method=\"post\" action=\"\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t<div id=\"body\" class=\"form-group\">\r\n");
      out.write("\t\t\t\t<h2>부동산 등록</h2>\r\n");
      out.write("\t\t\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th><label for=\"category\">물건용도</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><select id=\"category\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\">--선택--</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">아파트</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">주택/빌라</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"3\">상업/업무</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"4\">공장/창고</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"5\">토지</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"6\">기타</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th><label for=\"subject\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"color: blue; margin-right: 3px;\">*</span>물건제목</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"text\" id=\"subject\" class=\"form-control\" style=\"width: 600px;\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th><label for=\"sPrice\">시작가</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"number\" id=\"sPrice\" class=\"form-control\" style=\"width: 300px;\"/><a href=\"#none\" class=\"btn-q\" data-toggle=\"modal\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-target=\"#myModal2\" id=\"p_modal1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"text-decoration: none; margin-left: 10px;\">500만원 이상의 물건</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th><label for=\"danwe\">입찰단위</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><select id=\"danwe\" class=\"form-control\" style=\"width: 200px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">선택하세요</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>300만원</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>500만원</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>800만원</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>1000만원</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th><label for=\"ipenddate\">입찰만료일</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"date\" id=\"ipenddate\" class=\"form-control\" style=\"width: 200px;\"/>&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"time\" id=\"ipendtime\" class=\"form-control\" style=\"width: 200px;\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th><label for=\"gunmul\">건물면적/토지면적</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"text\" id=\"gunmul\" class=\"form-control\" style=\"width: 200px;\"/>&nbsp;/&nbsp;<input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" id=\"tozi\" class=\"form-control\" style=\"width: 200px;\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th rowspan=\"2\"><label for=\"zipcode\">주소</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"text\" id=\"zipcode\" class=\"form-control\" readonly=\"readonly\" style=\"width: 120px;\"/>&nbsp;<button type=\"button\" class=\"btn btn-primary btn-sm\" onclick=\"jusopop()\">우편번호검색</button></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"text\" id=\"addr1\" class=\"form-control\" readonly=\"readonly\" style=\"width: 500px;\"/>&nbsp;<input type=\"text\" id=\"addr2\" class=\"form-control\" style=\"width: 400px;\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th><label for=\"addprice\">물품설명</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><textarea name=\"ir1\" id=\"ir1\" rows=\"20\" cols=\"100\">111</textarea></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th><label for=\"addprice\">이미지등록1</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"file\" class=\"form-control-file\" id=\"img1\" aria-describedby=\"fileHelp1\">\r\n");
      out.write("                                    <small id=\"fileHelp1\" class=\"form-text text-muted\">기본이 되는 메인 이미지를 등록 해주세요 사이즈는 620x430입니다</small></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th><label for=\"addprice\">이미지등록2</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"file\" class=\"form-control-file\" id=\"img2\" aria-describedby=\"fileHelp2\">\r\n");
      out.write("                                    <small id=\"fileHelp2\" class=\"form-text text-muted\">부가적인 이미지 입니다 사이즈는 320x180입니다</small></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th><label for=\"addprice\">이미지등록3</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"file\" class=\"form-control-file\" id=\"img3\" aria-describedby=\"fileHelp3\">\r\n");
      out.write("                                    <small id=\"fileHelp3\" class=\"form-text text-muted\">기본이 되는 메인 이미지를 등록 해주세요 사이즈는 320x180입니다</small></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th><label for=\"addprice\">이미지등록4</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"file\" class=\"form-control-file\" id=\"img4\" aria-describedby=\"fileHelp4\">\r\n");
      out.write("                                    <small id=\"fileHelp4\" class=\"form-text text-muted\">기본이 되는 메인 이미지를 등록 해주세요 사이즈는 320x180입니다</small></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th colspan=\"2\"><button type=\"submit\" class=\"btn btn-primary btn-lg\" id=\"runin\">물건 등록 하기</button></th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- modal 2 -->\r\n");
      out.write("\t<div id=\"myModal2\" class=\"modal fade\" role=\"dialog\">\r\n");
      out.write("\t\t<div id=\"modal-dialog\">\r\n");
      out.write("\t\t\t<!-- Modal content-->\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header modal2\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"></button>\r\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\">온라인 거래 물품 불가 물품</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t<div class=\"tableDefault fs13\">\r\n");
      out.write("\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t<col />\r\n");
      out.write("\t\t\t\t\t\t\t\t<col />\r\n");
      out.write("\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>주류/담배</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>내용물이 있는 물품</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>음란물</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>모자이크 없이 지나친 노출이 있는 이미지</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>멸종위기동물</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>상아, 박제 등 몇종위기종의 가공품</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>위작, 모조품</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>상표권을 침해하는 물품</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>군용품 및 대외비</h>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>반출 및 유출 금지 대상인 군용품과 대외비</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>그외 도검, 화약류, 도난품 등</h>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>거래 부적절한 물품일 경우 경매 중지처리될 수 있습니다.</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"footer\" style=\"clear: both;\">footer.jsp here</div>\r\n");
      out.write("\t\r\n");
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

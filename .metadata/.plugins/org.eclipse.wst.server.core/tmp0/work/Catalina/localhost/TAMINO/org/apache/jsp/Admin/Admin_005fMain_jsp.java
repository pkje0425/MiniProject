/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.42
 * Generated at: 2020-03-20 10:55:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.StoreQnADto;
import dto.OrderListDto;
import java.util.ArrayList;
import java.util.List;

public final class Admin_005fMain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("dto.StoreQnADto");
    _jspx_imports_classes.add("dto.OrderListDto");
    _jspx_imports_classes.add("java.util.ArrayList");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");

List<OrderListDto> TodayOrderList = new ArrayList<>();
List<StoreQnADto> TodayQnAList = new ArrayList<>();
TodayOrderList = (List<OrderListDto>)request.getAttribute("TodayOrderList");
TodayQnAList = (List<StoreQnADto>)request.getAttribute("TodayQnAList"); 

System.out.println("TodayOrderList.size():"+TodayOrderList.size()+", TodayQnAList.size():"+TodayQnAList.size());

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=DM+Serif+Text|Roboto+Condensed&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body{\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tmin-height:100%;\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\tfont-family: 'Roboto Condensed', sans-serif;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("/* .backgroundImg{\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("}\r\n");
      out.write(" */\r\n");
      out.write(" .bodyDiv{\r\n");
      out.write(" \twidth: 70%;\r\n");
      out.write(" \theight: 100%;\r\n");
      out.write(" \tmargin: 0 auto;\r\n");
      out.write(" \tleft: 15%;\r\n");
      out.write(" \ttext-align: center;\r\n");
      out.write(" \tmargin-top: 100px;\r\n");
      out.write(" \tmargin-bottom: 100px;\r\n");
      out.write(" }\r\n");
      out.write(" .bodyDiv div{\r\n");
      out.write(" \twidth: 100%;\r\n");
      out.write(" \theight: 50%;\r\n");
      out.write(" \t\r\n");
      out.write(" \tdisplay: inline-block;\r\n");
      out.write(" \tfloat: left;\r\n");
      out.write(" \tmargin: 0 auto;\r\n");
      out.write(" \t/* padding-bottom: 50px; */\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write("table {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    border-top: 1px solid #444444;\r\n");
      out.write("    border-collapse: collapse;\r\n");
      out.write("}\r\n");
      out.write("th, td {\r\n");
      out.write("    border-bottom: 1px solid #444444;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("}\r\n");
      out.write("tr.detail:hover { \r\n");
      out.write("\tbackground-color: lightyellow; \r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("} \r\n");
      out.write("tr.detail2:hover { \r\n");
      out.write("\tbackground-color: lightyellow; \r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("tr.moreview:hover{\r\n");
      out.write("\t\tbackground-color: lightyellow; \r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("} \r\n");
      out.write("tr.moreview2:hover{\r\n");
      out.write("\tbackground-color: lightyellow; \r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".title{\r\n");
      out.write("\tbackground-color: #9EACB3;\r\n");
      out.write("}\r\n");
      out.write("#deleteBtn,#writeBtn{\r\n");
      out.write("\twidth:100px;\r\n");
      out.write("\theight:30px;\r\n");
      out.write("\tfont-size:1em;\r\n");
      out.write("\tbackground-color: #2B3A40;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write(".sideBar{\r\n");
      out.write("\tbackground-color: rgba(0,0,0,0.5);\r\n");
      out.write("}\r\n");
      out.write(".sideBar a{\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\tfont-size: 30px;\t\r\n");
      out.write("}\r\n");
      out.write(".sideMenu a{\r\n");
      out.write("\tfont-size: 40px;\r\n");
      out.write("}\r\n");
      out.write(".sideMenu a:hover{\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #EA9A56;\r\n");
      out.write("}\r\n");
      out.write(".menubar a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tfont-size: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menubar a:hover {\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #EA9A56;\r\n");
      out.write("}\r\n");
      out.write(".sideMenu ul{\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("}\r\n");
      out.write(".sideMenu ul ul{\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("}\r\n");
      out.write(".sideMenu ul li:hover ul{\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("}\r\n");
      out.write(".inani{\r\n");
      out.write("\t-webkit-animation:slide-in-left 0.6s 0s 1 ease-in forwards;\r\n");
      out.write("\tanimation:slide-in-left 0.6s 0s 1 ease-in forwards;\r\n");
      out.write("}\r\n");
      out.write(".outani{\r\n");
      out.write("\t-webkit-animation:slide-out-left 0.6s 0s 1 ease-in forwards;\r\n");
      out.write("\tanimation:slide-out-left 0.6s 0s 1 ease-in forwards;\r\n");
      out.write("}\r\n");
      out.write("@-webkit-keyframes slide-in-left{0%{-webkit-transform:translateX(-500px);transform:translateX(-500px);opacity:0}100%{-webkit-transform:translateX(0);transform:translateX(0);opacity:1}}@keyframes slide-in-left{0%{-webkit-transform:translateX(-500px);transform:translateX(-500px);opacity:0}100%{-webkit-transform:translateX(0);transform:translateX(0);opacity:1}}\r\n");
      out.write("@-webkit-keyframes slide-out-left{0%{-webkit-transform:translateX(0);transform:translateX(0);opacity:1}100%{-webkit-transform:translateX(-500px);transform:translateX(-500px);opacity:0}}@keyframes slide-out-left{0%{-webkit-transform:translateX(0);transform:translateX(0);opacity:1}100%{-webkit-transform:translateX(-500px);transform:translateX(-500px);opacity:0}}\r\n");
      out.write(".spinner-master * {transition:all 0.3s;-webkit-transition:all 0.3s;box-sizing:border-box;}\r\n");
      out.write("\r\n");
      out.write(".spinner-master {position:relative;margin-top:15px ;height:40px;width:40px;}\r\n");
      out.write("\r\n");
      out.write(".spinner-master input[type=checkbox] {display:none;}\r\n");
      out.write(".spinner-master label {cursor:pointer;position:absolute;z-index:99;height:100%;width:100%;top:10px;left:0;}\r\n");
      out.write("\r\n");
      out.write(".spinner-master .spinner {position:absolute;height:5px;width:100%;background-color:#000;}\r\n");
      out.write("\r\n");
      out.write(".spinner-master .diagonal.part-1 {position:relative;float:left;}\r\n");
      out.write(".spinner-master .horizontal {position:relative;float:left;margin-top:6px;}\r\n");
      out.write(".spinner-master .diagonal.part-2 {position:relative;float:left;margin-top:6px;}\r\n");
      out.write("\r\n");
      out.write(".spinner-master input[type=checkbox]:checked ~ .spinner-spin > .horizontal {opacity: 0;}\r\n");
      out.write(".spinner-master input[type=checkbox]:checked ~ .spinner-spin > .diagonal.part-1 {transform:rotate(405deg);-webkit-transform:rotate(405deg);margin-top:10px;}\r\n");
      out.write(".spinner-master input[type=checkbox]:checked ~ .spinner-spin > .diagonal.part-2 {transform:rotate(-405deg);-webkit-transform:rotate(-405deg);margin-top:-16px;}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- <div class=\"backgroundImg\">\r\n");
      out.write("\t<img alt=\"\" src=\"/Tamino/image/Admin_Main.png\" style=\"width: 100%; height: 100%;\">\r\n");
      out.write("</div> -->\r\n");
      out.write("<div class=\"bodyDiv\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- 오늘의 주문내역 -->\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<col width=\"7.5%\"><col width=\"10%\"><col width=\"10%\">\r\n");
      out.write("\t\t\t<col width=\"42.5%\"><col width=\"15%\"><col width=\"5%\"><col width=\"10%\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th colspan=\"7\">오늘의 주문내역</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t<th>주문번호</th>\r\n");
      out.write("\t\t\t\t<th>주문자</th>\r\n");
      out.write("\t\t\t\t<th>전화번호</th>\r\n");
      out.write("\t\t\t\t<th>주소</th>\r\n");
      out.write("\t\t\t\t<th>상품명</th>\r\n");
      out.write("\t\t\t\t<th>수량</th>\r\n");
      out.write("\t\t\t\t<th>총가격</th>\r\n");
      out.write("\t\t\t</tr>\r\n");

	 if(TodayOrderList==null || TodayOrderList.size()==0){
		 
      out.write("\r\n");
      out.write("\t\t <tr>\r\n");
      out.write("\t\t \t<th colspan=\"7\" rowspan=\"8\">구매내역이 없습니다.</th>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t\t ");

	 }
	 else{
		 for(int i=0; i<TodayOrderList.size(); i++){
			 if(i<7){
			 
      out.write("\r\n");
      out.write("\t\t\t <tr class=\"detail\" seq=\"");
      out.print(TodayOrderList.get(i).getOderlist_seq());
      out.write("\">\r\n");
      out.write("\t\t\t \t<td>");
      out.print(TodayOrderList.get(i).getOderlist_seq() );
      out.write("</td>\r\n");
      out.write("\t\t\t \t<td>");
      out.print(TodayOrderList.get(i).getOrder_email() );
      out.write("</td>\r\n");
      out.write("\t\t\t \t<td>");
      out.print(TodayOrderList.get(i).getOrder_phonenumber() );
      out.write("</td>\r\n");
      out.write("\t\t\t \t<td>");
      out.print(TodayOrderList.get(i).getOrder_address() );
      out.write("</td>\r\n");
      out.write("\t\t\t \t<td>");
      out.print(TodayOrderList.get(i).getProduct_name() );
      out.write("</td>\r\n");
      out.write("\t\t\t \t<td>");
      out.print(TodayOrderList.get(i).getProduct_count());
      out.write("</td>\r\n");
      out.write("\t\t\t \t<td>");
      out.print(TodayOrderList.get(i).getProduct_price() );
      out.write("</td>\r\n");
      out.write("\t\t\t </tr>\r\n");
      out.write("\t\t\t ");

			 }
			 else if(i==7){
				 
      out.write("\r\n");
      out.write("\t\t\t\t <tr class=\"moreview\">\r\n");
      out.write("\t\t\t\t \t<th colspan=\"7\" style=\"border: none;\">\r\n");
      out.write("\t\t\t\t \t\t<h3>...</h3>더보기\r\n");
      out.write("\t\t\t\t \t</th>\r\n");
      out.write("\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t ");

			 }
		 }
	 }

      out.write(" \r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 오늘의 Q&A 게시글 -->\r\n");
      out.write("\t<div style=\"margin-top: 3rem;\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<col width=\"7.5%\"><col width=\"12.5%\">\r\n");
      out.write("\t\t\t<col width=\"10%\"><col width=\"15%\"><col width=\"50%\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th colspan=\"5\">오늘의 Q&A게시글</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t<th>주문번호</th>\r\n");
      out.write("\t\t\t\t<th>작성자</th>\r\n");
      out.write("\t\t\t\t<th>분류</th>\r\n");
      out.write("\t\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t\t<th>내용</th>\r\n");
      out.write("\t\t\t</tr>\r\n");

	 if(TodayQnAList==null || TodayQnAList.size()==0){
		 
      out.write("\r\n");
      out.write("\t\t <tr>\r\n");
      out.write("\t\t \t<th colspan=\"5\" rowspan=\"8\">게시글이 없습니다.</th>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t\t ");

	 }
	 else{
		 for(int i=0; i<TodayQnAList.size(); i++){
			 if(i<7){
			 
      out.write("\r\n");
      out.write("\t\t\t <tr class=\"detail2\" seq=\"");
      out.print(TodayQnAList.get(i).getQna_seq());
      out.write("\">\r\n");
      out.write("\t\t\t \t<td>");
      out.print(TodayQnAList.get(i).getQna_product_seq() );
      out.write("</td>\r\n");
      out.write("\t\t\t \t<td>");
      out.print(TodayQnAList.get(i).getQna_email() );
      out.write("</td>\r\n");
      out.write("\t\t\t \t<td>");
      out.print(TodayQnAList.get(i).getQna_category() );
      out.write("</td>\r\n");
      out.write("\t\t\t \t<td>");
      out.print(TodayQnAList.get(i).getQna_title() );
      out.write("</td>\r\n");
      out.write("\t\t\t \t<td>");
      out.print(TodayQnAList.get(i).getQna_content());
      out.write("</td>\r\n");
      out.write("\t\t\t </tr>\r\n");
      out.write("\t\t\t ");

			 }
			 else if(i==7){
				 
      out.write("\r\n");
      out.write("\t\t\t\t <tr class=\"moreview2\">\r\n");
      out.write("\t\t\t\t \t<th colspan=\"5\" style=\"border: none;\">\r\n");
      out.write("\t\t\t\t \t\t<h3>...</h3>더보기\r\n");
      out.write("\t\t\t\t \t</th>\r\n");
      out.write("\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t ");

			 }
		 }
	 }

      out.write(" \t\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Side Menu Bar -->\r\n");
      out.write("\t<div class=\"sideBar\" style=\"width: 0%; height:100%; top:0%; /* border: 1px solid black; */ position: absolute; margin: 0;\">\r\n");
      out.write("\t\t<div class=\"sideMenu\" style=\"width: 60%; position: inherit; top: 33%; left: 12%; visibility:hidden;\"  align=\"center\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<h1><a href=\"/TAMINO/AdminCtrl?command=Main_Page\">Main</a></h1>\r\n");
      out.write("\t\t\t\t<h1><a href=\"/TAMINO/AdminCtrl?command=ProductList&page=0\">Product</a></h1>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><h3><a href=\"/TAMINO/AdminCtrl?command=order_list&page=0\">OrderList</a></h3></li>\r\n");
      out.write("\t\t\t\t\t<li><h3><a href=\"/TAMINO/AdminCtrl?command=QnAList\">Q&A</a></h3></li>\r\n");
      out.write("\t\t\t\t\t<li><h3><a href=\"/TAMINO/AdminCtrl?command=Statistics\">Statistics</a></h3></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li><h1><a href=\"/TAMINO/AdminCtrl?command=Member_list&page=0\">Member</a></h1></li>\r\n");
      out.write("\t\t\t<li><h1><a href=\"/TAMINO/AdminCtrl?command=AdminSchedule\">Schedule</a></h1></li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<h1><a href=\"#\" class=\"News\">News</a></h1> \r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><h3><a href=\"/TAMINO/AdminCtrl?command=AdminPhoto\">Photo</a></h3></li>\r\n");
      out.write("\t\t\t\t\t<li><h3><a href=\"/TAMINO/AdminCtrl?command=Adminvideo\">Video</a></h3></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"width: 10%; height: 7%; position: inherit; /* border: 1px solid black; */ left: 100%; top: 46.5%;\">\r\n");
      out.write("\t\t\t<div class=\"spinner-master\">\r\n");
      out.write("\t\t\t  <input type=\"checkbox\" id=\"spinner-form\" />\r\n");
      out.write("\t\t\t  <label for=\"spinner-form\" class=\"spinner-spin\">\r\n");
      out.write("\t\t\t    <div class=\"spinner diagonal part-1\"></div>\r\n");
      out.write("\t\t\t    <div class=\"spinner horizontal\"></div>\r\n");
      out.write("\t\t\t    <div class=\"spinner diagonal part-2\"></div>\r\n");
      out.write("\t\t\t  </label>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("\tvar i = 0;\r\n");
      out.write("\t$(\"#spinner-form\").on(\"click\",function(){\r\n");
      out.write("\t\ti++;\r\n");
      out.write("\t\tif(i%2==1){\r\n");
      out.write("\t\t\tsetTimeout(function() {\r\n");
      out.write("\t\t\t\t/* $(\".sideBar\").removeClass('inani'); */\r\n");
      out.write("\t\t\t\t$(\".sideBar\").addClass(\"inani\");\r\n");
      out.write("\t\t\t\t$(\".sideBar\").css(\"width\",\"13%\");\r\n");
      out.write("\t\t\t\t$(\".sideMenu\").css(\"visibility\",\"visible\");\r\n");
      out.write("\t\t\t}, 300)\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\telse{\r\n");
      out.write("\t\t\t\t$(\".sideBar\").removeClass('inani');\r\n");
      out.write("\t\t\t\t$(\".sideBar\").addClass(\"outani\");\r\n");
      out.write("\t\t\t\tsetTimeout(function() {\r\n");
      out.write("\t\t\t\t\t$(\".sideBar\").removeClass('outani');\r\n");
      out.write("\t\t\t\t\t$(\".sideMenu\").css(\"visibility\",\"hidden\");\r\n");
      out.write("\t\t\t\t\t$(\".sideBar\").css(\"width\",\"0%\");\r\n");
      out.write("\t\t\t\t}, 600)\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".detail\").on(\"click\",function(){\r\n");
      out.write("\t\t/* alert(\"클릭됨\"); */\r\n");
      out.write("\t\tvar seq = $(this).attr(\"seq\");\r\n");
      out.write("\t\tlocation.href=\"/TAMINO/AdminCtrl?command=Order_Detail&seq=\"+seq;\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".detail2\").on(\"click\",function(){\r\n");
      out.write("\t\tvar seq = $(this).attr(\"seq\");\r\n");
      out.write("\t\tlocation.href=\"/TAMINO/AdminCtrl?command=QnADetail&seq=\"+seq;\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".moreview\").on(\"click\",function(){\r\n");
      out.write("\t\tlocation.href=\"/TAMINO/AdminCtrl?command=order_list&page=0\"\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".moreview2\").on(\"click\",function(){\r\n");
      out.write("\t\tlocation.href=\"/TAMINO/AdminCtrl?command=QnAList\"\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

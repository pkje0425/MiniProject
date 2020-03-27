/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.42
 * Generated at: 2020-03-19 12:48:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.ProductDto;
import dto.NewsDto;
import java.util.ArrayList;
import dto.ScheduleDto;
import java.util.List;
import dto.MemberDto;

public final class Main_005fPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("dto.ProductDto");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("dto.NewsDto");
    _jspx_imports_classes.add("dto.MemberDto");
    _jspx_imports_classes.add("dto.ScheduleDto");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Object ologin = session.getAttribute("login");
	MemberDto mdto = null;
	mdto = (MemberDto)ologin;
	
	List<ScheduleDto> sList = new ArrayList<>();
	List<NewsDto> nList = new ArrayList<>();
	List<ProductDto> pList = new ArrayList<>();
	
	sList = (List<ScheduleDto>)request.getAttribute("scheduleList");
	nList = (List<NewsDto>)request.getAttribute("newslist");
	pList = (List<ProductDto>)request.getAttribute("productlist");
	
	System.out.println("sList.size():"+sList.size()+", nList.size():"+nList.size()+", pList.size():"+pList.size());
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=DM+Serif+Text|Roboto+Condensed&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/TAMINO/Main/Navibar.css?after\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body{\r\n");
      out.write("\t/* background-image : url('/TAMINO/image/TAMINO_amir.jpg');\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\tbackground-size: cover; */\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("\ttop:0;\r\n");
      out.write("\tleft:0;\r\n");
      out.write("\twidth: 100%; \r\n");
      out.write("\tfont-family: 'Roboto Condensed', sans-serif;\r\n");
      out.write("\t/*  font-family: 'Cutive Mono', monospace;  */\r\n");
      out.write("}\r\n");
      out.write(".backgroundImg{\r\n");
      out.write("\ttop:0;\r\n");
      out.write("\tleft:0;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tposition:fixed;\r\n");
      out.write("\tz-index: -1000;\r\n");
      out.write("}\r\n");
      out.write(".sideBar{\r\n");
      out.write("\tbackground-color: rgba(0, 0, 0, 0.3);\r\n");
      out.write("}\r\n");
      out.write(".sideBar a{\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tfont-size: 30px;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write(".menubar a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tfont-size: 25px;\r\n");
      out.write("}\r\n");
      out.write(".loginbar a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tfont-size: 25px;\r\n");
      out.write("}\r\n");
      out.write("a:hover {\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #EA9A56;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("button{\r\n");
      out.write("\tborder: 5px solid black;\r\n");
      out.write("}\r\n");
      out.write("button:hover{\r\n");
      out.write("\tbackground-color: black;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".iconBox{\r\n");
      out.write("\topacity: 0.5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".iconBox:hover {\r\n");
      out.write("\topacity: 1; \r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- background img -->\r\n");
      out.write("<div class=\"backgroundImg\">\r\n");
      out.write("\t<img alt=\"\" src=\"/TAMINO/image/Tamino_Main.png\" style=\"width: 100%; height: 100%;\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- header -->\r\n");
      out.write("<div class=\"header\" style=\"background-color: rgba(255,255,255,0.5)\">\r\n");
      out.write("\t\t<div class=\"header_container\">\r\n");
      out.write("\t\t\t<div class=\"header_content\">\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t<a><img src=\"/TAMINO/image/logo.png\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"navbar\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/TAMINO/newscontrol?command=list\">NEWS</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/TAMINO/ScheduleCtrl?command=schedule\">SCHEDULE</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/TAMINO/StoreCtrl?command=StoreMain\">STORE</a>\r\n");
      out.write("\t\t\t\t\t\t");

							if(mdto != null){
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/TAMINO/MemberCtrl?command=logout\">LOGOUT</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

							}
							else{
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/TAMINO/MemberCtrl?command=login\">LOGIN</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
								
							}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- body -->\r\n");
      out.write("\t<div style=\"width: 50%; height: 60%; left:25%; top:20%; position: absolute;\" align=\"center\">\r\n");
      out.write("\t\t<img alt=\"\" src=\"/TAMINO/image/Tamino_LikeAt.jpg\" style=\"width: 100%; height: 100%;\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"width: 50%; left: 25%; top: 80%; position: absolute; background-color: rgba(255,255,255,0.5)\" align=\"center\">\r\n");
      out.write("\t\t<h2>Live at Ancienne Belgique</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"width: 100%; top:100%;  position: absolute;\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- Listen -->\r\n");
      out.write("\t\t<div style=\"width: 100%; height: 350px; padding-top:6%; background-color: rgba(255,255,255,0.5)\" align=\"center\">\r\n");
      out.write("\t\t\t<button type=\"button\" style=\"width: 300px; height: 100px;\" onclick=\"location.href='/TAMINO/Main/Main_Listen.jsp'\"><h1>LISTEN</h1></button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Sign Up -->\r\n");
      out.write("\t\t<div style=\"width: 100%; height: 350px; padding-top:1%; background-color: rgba(255,255,255,0.6); color: rgba(0,0,0,0.6)\" align=\"center\">\r\n");
      out.write("\t\t\t<h1 style=\"font-size: 50px;\">WE WANT YOU TO HAVE IT ALL</h1>\r\n");
      out.write("\t\t\t<h3>Join the mailing list to receive the latest music news, tour dates, and pre-sale</h3><h3>information.</h3>\r\n");
      out.write("\t\t\t<button type=\"button\" style=\"width: 150px; height: 60px;\" onclick=\"location.href='/TAMINO/MemberCtrl?command=login'\"><h3>SIGN UP</h3></button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Tour Dates -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"width: 100%; height: 1400px; padding-top:5%; background-color: rgba(255,255,255,0.7); color: rgba(0,0,0,0.7)\" align=\"center\">\r\n");
      out.write("\t\t\t<h1 style=\"font-size: 50px;\">UPCOMING SCHEDULE DATES</h1>\r\n");
      out.write("\t\t\t");


					if(sList.size()==0 || sList==null){
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div style=\"width: 70%; height:100%; border-bottom:1px solid black; margin-top: 15%;\" align=\"center\" >\r\n");
      out.write("\t\t\t\t\t\t\t<h1>등록된 일정이</h1>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<h1>존재하지 않습니다.</h1>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t");

					}
					else{
						for(int i=0; i<sList.size(); i++){
							if(i==3){
								break;
							}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div style=\"width: 70%; height:20%; border-bottom:1px solid black; margin-top: 10px\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width: 20%;  display: inline-block; float: left;\" >\r\n");
      out.write("\t\t\t\t\t\t\t<h1>");
      out.print(sList.get(i).getSchedule_date() );
      out.write("</h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width: 60%; display: inline-block; float: left\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1>");
      out.print(sList.get(i).getSchedule_place() );
      out.write("</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<h2>");
      out.print(sList.get(i).getSchedule_title() );
      out.write("</h2>\r\n");
      out.write("\t\t\t\t\t\t\t");

								if(sList.get(i).getSchedule_content().length()>250){
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>");
      out.print(sList.get(i).getSchedule_content().substring(0,250) );
      out.write("</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>");
      out.print(sList.get(i).getSchedule_content().substring(250, sList.get(i).getSchedule_content().length()) );
      out.write("</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 
								}
								else{
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>");
      out.print(sList.get(i).getSchedule_content() );
      out.write("</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

								}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width: 20%;   display: inline-block; float: left\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" style=\"margin-top:21.440px; width: 150px; height: 75px;\" onclick=\"window.open('");
      out.print(sList.get(i).getTicketLink());
      out.write("')\"><h3>TICKETS</h3></button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t");

						}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" style=\"margin-top:5%; width: 300px; height: 100px;\" onclick=\"location.href='/TAMINO/ScheduleCtrl?command=schedule'\"><h1>VIEW MORE</h1></button>\r\n");
      out.write("\t\t\t\t\t\t");

					}
				
			
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t</div> \r\n");
      out.write("\t\t<!-- LATEST NEWS -->\r\n");
      out.write("\t\t<div style=\"width: 100%; height: 1200px; padding-top:4%; background-color: rgba(255,255,255,0.8); color: rgba(0,0,0,0.8)\" align=\"center\">\r\n");
      out.write("\t\t\t<h1 style=\"font-size: 50px;\">LATEST NEWS</h1>\r\n");
      out.write("\t\t\t");

					if(nList.size()==0 || nList==null){
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div style=\"width: 70%; height:100%; border-bottom:1px solid black; margin-top: 15%;\" align=\"center\" >\r\n");
      out.write("\t\t\t\t\t\t\t<h1>등록된 뉴스가</h1>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<h1>존재하지 않습니다.</h1>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t");

					}
					else{
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div style=\"width: 70%; height:60%;  margin-top: 6%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t");

						for(int i=0; i<nList.size(); i++){
							if(i==3){
								break;
							}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width: 30%; height:100%; display: inline-block; float: left;   margin: 0px 1% 0px 1%\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"width: 100%; height: 45%;\"align=\"center\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"\" src=\"/TAMINO/upload/");
      out.print(nList.get(i).getFilename());
      out.write("\" style=\"width: 100%;height: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"width: 100%; max-height: 20%; \" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>");
      out.print(nList.get(i).getTitle() );
      out.write("</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"width: 100%; max-height: 30%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									if(nList.get(i).getContent().length()>600){
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      out.print(nList.get(i).getContent().substring(0, 597) );
      out.write("...\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									}
									else{
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      out.print(nList.get(i).getContent() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

									}
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"width: 100%; height: 5%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>");
      out.print(nList.get(i).getNews_date().substring(0,10) );
      out.write("</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t");

						}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" style=\"margin-top:1%; width: 300px; height: 100px;\" onclick=\"location.href='/TAMINO/newscontrol?command=list'\"><h1>VIEW MORE</h1></button>\r\n");
      out.write("\t\t\t\t\t\t");

					}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- Store -->\r\n");
      out.write("\t\t<div style=\"width: 100%; height: 1000px; padding-top:2%; background-color: rgba(255,255,255,0.9); color: rgba(0,0,0,0.9)\" align=\"center\">\r\n");
      out.write("\t\t\t<h1 style=\"font-size: 50px;\">STORE</h1>\r\n");
      out.write("\t\t\t");

				if(pList.size()==0 || pList==null){
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<div style=\"width: 70%; height:100%; border-bottom:1px solid black; margin-top: 15%;\" align=\"center\" >\r\n");
      out.write("\t\t\t\t\t\t<h1>등록된 상품이</h1>\t\t\r\n");
      out.write("\t\t\t\t\t\t<h1>존재하지 않습니다.</h1>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t");

				}
				else{
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<div style=\"width: 70%; height:40%;  margin-top: 4%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t");

						for(int i=0; i<pList.size();i++){
							if(i==4){
								break;
							}
							else{
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"width: 22%; height:100%; display: inline-block; float: left;   margin: 0px 1% 0px 1%\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<img alt=\"\" src=\"/TAMINO/product/");
      out.print(pList.get(i).getProductImage().split(",")[0] );
      out.write("\" style=\"width: 100%;height: 100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

							}
							
						}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"width: 70%; max-height: 5%;\" align=\"center\"><h1>Get great products now!</h1></div>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" style=\"margin-top:3.5%; width: 300px; height: 100px;\" onclick=\"location.href='/TAMINO/StoreCtrl?command=StoreMain'\"><h1>SHOP NOW</h1></button>\r\n");
      out.write("\t\t\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- footer -->\r\n");
      out.write("\t\t<div style=\"width: 100%; height: 400px; padding-top:2%; background-color: black; color: white\" align=\"center\">\r\n");
      out.write("\t\t\t<h1 style=\"font-size: 50px;\">TAMINO</h1>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"iconDiv\" style=\"width: 15%; height:10%;  margin-top: 3%; margin-bottom: 3%;\" align=\"center\">\r\n");
      out.write("\t\t\t\t<a style=\"margin-left: 15px; margin-right: 15px;\" href=\"http://instagram.com/TAMINOamir\" target=\"_blank\"><img src=\"/TAMINO/image/instagrammain.png\"  class=\"iconBox\" style=\"width: 40px; height: 35px;\"></a>\r\n");
      out.write("\t\t\t\t<a style=\"margin-left: 0px; margin-right: 15px; \" href=\"https://www.facebook.com/taminoamir/?ref=br_rs\" target=\"_blank\"><img src=\"/TAMINO/image/facebookmain.png\"  class=\"iconBox\" style=\"width: 40px; height: 35px;\"></a>\r\n");
      out.write("\t\t\t\t<a style=\"margin-left: 0px; margin-right: 15px; \" href=\"https://twitter.com/taminoamir\" target=\"_blank\"><img src=\"/TAMINO/image/twittermain.png\"  class=\"iconBox\" style=\"width: 40px; height: 35px;\"></a>\r\n");
      out.write("\t\t\t\t<a style=\"margin-left: 0px; margin-right: 15px; \" href=\"https://www.youtube.com/channel/UCzoO5qFoT-7w7o7f1QqhOpA\" target=\"_blank\"><img src=\"/TAMINO/image/youtubemain.png\"  class=\"iconBox\" style=\"width: 40px; height: 35px;\"></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h3>© 2019 Tamino. All Rights Reserved.</h3>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("\tvar i = 0;\r\n");
      out.write("\t$(\"#spinner-form\").on(\"click\",function(){\r\n");
      out.write("\t\ti++;\r\n");
      out.write("\t\tif(i%2==1){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tsetTimeout(function() {\r\n");
      out.write("\t\t\t\t/* $(\".sideBar\").removeClass('inani'); */\r\n");
      out.write("\t\t\t\t$(\".sideBar\").addClass(\"inani\");\r\n");
      out.write("\t\t\t\t$(\".sideBar\").css(\"width\",\"18%\");\r\n");
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
      out.write("\t\t\t}\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
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

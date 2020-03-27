/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.42
 * Generated at: 2020-03-19 12:50:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Store;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.MemberDto;
import java.util.ArrayList;
import dto.OrderListDto;
import java.util.Arrays;
import util.UtilityClass;
import dto.ProductDto;
import java.util.List;

public final class Store_005fDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.Arrays");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("util.UtilityClass");
    _jspx_imports_classes.add("dto.MemberDto");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

MemberDto logindto = (MemberDto)session.getAttribute("login");

ProductDto dto = (ProductDto)request.getAttribute("detail");
String fileName[] = dto.getProductImage().split(",");
System.out.println("디테일 jsp : " + Arrays.toString(fileName));


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Noto+Sans+KR|Roboto|Roboto+Mono|Viga&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/TAMINO/Store/css/Product_Detail.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/TAMINO/Store/css/MyPageOverlay.css\">\r\n");
      out.write("<style type=\"text/css\"></style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	String currId = "guest";
	if( request.getSession().getAttribute("login") != null ){
		MemberDto loginDto = (MemberDto)request.getSession().getAttribute("login");
		currId = loginDto.getEmail();
	}


      out.write("\r\n");
      out.write("<input type=\"hidden\" value=\"");
      out.print(currId );
      out.write("\" id=\"currId\"> \r\n");
      out.write("<div class=\"super_container\">\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<div class=\"header_container\">\r\n");
      out.write("\t\t\t<div class=\"header_content\">\r\n");
      out.write("\t\t\t\t<div class=\"logindiv\">\r\n");
      out.write("\t\t\t\t\t\t<a id=\"cart\"><img src=\"/TAMINO/image/cart.png\" width=\"20px\" height=\"20px\"></a>\r\n");
      out.write("\t\t\t\t\t\t<a id=\"login\" href=\"/TAMINO/MemberCtrl?command=login\">LOGIN</a>\r\n");
      out.write("\t\t\t\t\t\t<a id=\"mypage\" onclick=\"openNav()\">MY PAGE</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/TAMINO/StoreCtrl?command=StoreMain\"><img src=\"/TAMINO/image/storelogo.png\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"navbar\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/TAMINO/StoreCtrl?command=ProductList&category=all\">ALL</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/TAMINO/StoreCtrl?command=ProductList&category=clothing\">CLOTHIING</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/TAMINO/StoreCtrl?command=ProductList&category=accsesory\">ACCESORIES</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/TAMINO/StoreCtrl?command=ProductList&category=vinyl\">VINYL</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/TAMINO/StoreCtrl?command=ProductList&category=etc\">ETC</a>\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"detailbox\">\r\n");
      out.write("\t\t<div class=\"product-wrapper\"> <!-- 슬라이드 쇼 전체 다이브 -->\r\n");
      out.write("\t\t<!-- Slideshow Container -->\r\n");
      out.write("\t\t\t<div class=\"slideshow-container\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t");
 for(int i = 0; i < fileName.length; i++){
					if(!fileName[i].equals(" ")){
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"slides fade\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"/TAMINO/product/");
      out.print(fileName[i].trim() );
      out.write("\" width=\"100%\" height=\"100%\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");

					}
				}
				 
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<a class=\"prev\" onclick=\"plusSlides(-1)\">&#10094;</a>\r\n");
      out.write("\t\t\t\t<a class=\"next\" onclick=\"plusSlides(1)\">&#10095;</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t");
 for(int i = 0; i < fileName.length; i++){
					if(!fileName[i].equals(" ")){
      out.write("\r\n");
      out.write("\t\t\t\t\t<span class=\"dot\" onclick=\"currentSlide(");
      out.print(i + 1 );
      out.write(")\"></span>\r\n");
      out.write("\t\t\t\t");

					}
				}
				 
      out.write("\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<form id=\"detailfrm\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"command\" value=\"addCart\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"product_seq\" value=\"");
      out.print(dto.getSeq() );
      out.write("\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"product_code\" value=\"");
      out.print(dto.getCode() );
      out.write("\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"product_name\" value=\"");
      out.print(dto.getProductName() );
      out.write("\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"product_price\" value=\"");
      out.print(dto.getPrice() );
      out.write("\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"product_image\" value=\"");
      out.print(dto.getProductImage() );
      out.write("\">\r\n");
      out.write("\t\t<div class=\"product-detail\">\r\n");
      out.write("\t\t\t<!-- <div id=\"product_title\">Flames Hoodie</div> -->\r\n");
      out.write("\t\t\t<h2>");
      out.print(dto.getProductName() );
      out.write("</h2>\r\n");
      out.write("\t\t\t<h4>");
      out.print(UtilityClass.PriceConvert(dto.getPrice()) );
      out.write("won</h4> <br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
if(dto.getCode().equals("의류")){
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"sizeselect\" style=\"margin-bottom: 10px;\">\r\n");
      out.write("\t\t\t\t<span style=\"font-size: 9pt\">SIZE</span>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<select name=\"product_size\" style=\"height: 30px; width: 100px;\">\r\n");
      out.write("\t\t\t\t\t<option value=\"S\">S</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"M\">M</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"L\">L</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t");

			}
			
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"quantitydiv\" style=\"margin-bottom: 20px;\">\r\n");
      out.write("\t\t\t<span style=\"font-size: 9pt\">QUANTITY</span>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<!-- <input type=\"number\" min=\"1\" max=\"50\" style=\"height: 30px; width: 100px;\"><br> -->\r\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"quantity\" name=\"product_count\" onKeyup=\"this.value=this.value.replace(/[^0-9]/g,'');\" value=1>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<button type=\"button\" id=\"minusBtn\" class=\"plusminusbtn\">-</button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" id=\"plusBtn\" class=\"plusminusbtn\">+</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\t\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"moreinfo\">more information</button>\r\n");
      out.write("\t\t\t\t<div class=\"info\">\r\n");
      out.write("\t\t\t\t\t<p>");
      out.print(dto.getProductExplain() );
      out.write("</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<button type=\"button\"  id=\"addcart\" class=\"cartBtn\">ADD TO CART</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"qnadiv\" align=\"center\">\r\n");
      out.write("\t<iframe class=\"qnaiframe\" src=\"/TAMINO/StoreCtrl?command=QnAList&product_seq=");
      out.print(dto.getSeq() );
      out.write("\" style=\"height: 500px;\"></iframe>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"myNav\" class=\"overlay\">\r\n");
      out.write("<a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\r\n");
      out.write("\t<div class=\"overlay-content\">\r\n");
      out.write("\t\t<p>MY PAGE</p>\r\n");
      out.write("    \t<a href=\"/TAMINO/MemberCtrl?command=myInfo&email=");
      out.print(currId );
      out.write("\">회원정보 수정</a>\r\n");
      out.write("    \t<a href=\"/TAMINO/MemberCtrl?command=MyOrderList\">주문내역</a>\r\n");
      out.write("  \t</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t<a href=\"http://instagram.com/taminoamir\" target=\"_blank\"><img src=\"/TAMINO/image/instagram.png\" width=\"30px\" height=\"30px\"></a>\r\n");
      out.write("\t<a href=\"https://twitter.com/taminoamir\" target=\"_blank\"><img src=\"/TAMINO/image/twitter.png\" width=\"30px\" height=\"30px\"></a>\r\n");
      out.write("\t<a href=\"https://www.facebook.com/taminoamir/?ref=br_rs\" target=\"_blank\"><img src=\"/TAMINO/image/facebook.png\" width=\"30px\" height=\"30px\"></a>\r\n");
      out.write("\t<a href=\"https://www.youtube.com/channel/UCzoO5qFoT-7w7o7f1QqhOpA\" target=\"_blank\"><img src=\"/TAMINO/image/youtube.png\" width=\"30px\" height=\"30px\"></a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("$(function () {\r\n");
      out.write("\tif($(\"#currId\").val() != \"guest\"){\r\n");
      out.write("\t\t$(\"#login\").text(\"LOGOUT\");\r\n");
      out.write("\t\t$(\"#login\").attr(\"href\", \"/TAMINO/MemberCtrl?command=logout\");\r\n");
      out.write("\t\t$(\"#mypage\").css(\"display\", \"block\");\r\n");
      out.write("\t}\r\n");
      out.write("\t$(\"#cart\").click(function() {\r\n");
      out.write("\t\tif($(\"#currId\").val() == \"guest\"){/* 로그인 하지 않은 경우 */\r\n");
      out.write("\t\t\talert(\"장바구니는 로그인 후 이용 가능합니다.\");\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#cart\").attr(\"href\", \"/TAMINO/StoreCtrl?command=goCart\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".plusminusbtn\").click(function() {\r\n");
      out.write("\t\tvar quantity = parseInt($(\"#quantity\").val());\r\n");
      out.write("\r\n");
      out.write("\t\tif($(this).text() == \"-\"){\r\n");
      out.write("\t\t\t$(\"#quantity\").val(quantity - 1);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(parseInt($(\"#quantity\").val()) <= 0){\r\n");
      out.write("\t\t\t\talert(\"최소 수량은 1개 입니다\");\r\n");
      out.write("\t\t\t\t$(\"#quantity\").val(1);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}else if($(this).text() == \"+\"){\r\n");
      out.write("\t\t\t$(\"#quantity\").val(quantity + 1);\r\n");
      out.write("\t\t\tif(parseInt($(\"#quantity\").val()) > 10){\r\n");
      out.write("\t\t\t\talert(\"1인 당 최대 10개 까지 구매 가능합니다\");\r\n");
      out.write("\t\t\t\t$(\"#quantity\").val(10);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#quantity\").focusout(function() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(parseInt($(\"#quantity\").val()) <= 0){\r\n");
      out.write("\t\t\talert(\"최소 수량은 1개 입니다\");\r\n");
      out.write("\t\t\t$(\"#quantity\").val(1);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t}else if(parseInt($(\"#quantity\").val()) > 10){\r\n");
      out.write("\t\t\talert(\"1인 당 최대 10개 까지 구매 가능합니다\");\r\n");
      out.write("\t\t\t$(\"#quantity\").val(10);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#addcart\").click(function () {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif($(\"#currId\").val() == \"guest\"){/* 로그인 하지 않은 경우 */\r\n");
      out.write("\t\t\talert(\"장바구니는 로그인 후 이용 가능합니다.\");\r\n");
      out.write("\t\t\tlocation.href = \"/TAMINO/MemberCtrl?command=login\";\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar formData = $(\"#detailfrm\").serialize();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype: 'post',\r\n");
      out.write("\t\t\t\turl: '/TAMINO/StoreCtrl?command=addCart',\r\n");
      out.write("\t\t\t\tdata: formData, \r\n");
      out.write("\t\t\t\tdatatype : 'json',\r\n");
      out.write("\t\t\t\tsuccess: function () {\r\n");
      out.write("\t\t\t\t\tvar result = confirm(\"장바구니 추가 완료. 확인하시겠습니까?\");\r\n");
      out.write("\t\t\t\t\tif(result){\r\n");
      out.write("\t\t\t\t\t\tlocation.href = \"/TAMINO/StoreCtrl?command=goCart\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror: function () {\r\n");
      out.write("\t\t\t\t\talert(\"에러\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("var slideIndex = 1;\r\n");
      out.write("showSlides(slideIndex);\r\n");
      out.write("\r\n");
      out.write("function plusSlides(n){\r\n");
      out.write("\tshowSlides(slideIndex += n);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function currentSlide(n){\r\n");
      out.write("\tshowSlides(slideIndex = n);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function showSlides(n){\r\n");
      out.write("\tvar i;\r\n");
      out.write("\tvar slides = document.getElementsByClassName(\"slides\");\r\n");
      out.write("\tvar dots = document.getElementsByClassName(\"dot\");\r\n");
      out.write("\t\r\n");
      out.write("\tif(n > slides.length){\r\n");
      out.write("\t\tslideIndex = 1;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(n < 1){\r\n");
      out.write("\t\tslideIndex = slides.length;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfor(i = 0; i < slides.length; i++){\r\n");
      out.write("\t\tslides[i].style.display = \"none\";\r\n");
      out.write("\t}\r\n");
      out.write("\tfor(i = 0; i < dots.length; i++){\r\n");
      out.write("\t\tdots[i].className = dots[i].className.replace(\" active\", \"\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tslides[slideIndex-1].style.display = \"block\";\r\n");
      out.write("\tdots[slideIndex-1].className += \" active\";\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function openNav() {\r\n");
      out.write("  document.getElementById(\"myNav\").style.width = \"100%\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function closeNav() {\r\n");
      out.write("  document.getElementById(\"myNav\").style.width = \"0%\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"/TAMINO/Store/scrollevent.js\"></script>\r\n");
      out.write("<script src=\"/TAMINO/Store/accordion.js\"></script>\r\n");
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

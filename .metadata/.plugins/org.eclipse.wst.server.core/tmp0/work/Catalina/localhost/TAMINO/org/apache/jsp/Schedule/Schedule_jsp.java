/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.42
 * Generated at: 2020-03-19 12:22:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Schedule;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.MemberDto;
import dto.ScheduleDto;
import java.util.List;

public final class Schedule_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


public String convertMonth(String month){
	String change = "";
	if(month.equals("01")){
		change = "JAN";
	}if(month.equals("02")){
		change = "FEB";
	}if(month.equals("03")){
		change = "MAR";
	}if(month.equals("04")){
		change = "APR";
	}if(month.equals("05")){
		change = "MAY";
	}if(month.equals("06")){
		change = "JUN";
	}if(month.equals("07")){
		change = "JUL";
	}if(month.equals("08")){
		change = "AUG";
	}if(month.equals("09")){
		change = "SEP";
	}if(month.equals("10")){
		change = "OCT";
	}if(month.equals("11")){
		change = "NOV";
	}if(month.equals("12")){
		change = "DEC";
	}
	return change;
}


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
    _jspx_imports_classes.add("dto.MemberDto");
    _jspx_imports_classes.add("dto.ScheduleDto");
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
      out.write('\r');
      out.write('\n');

Object ologin = session.getAttribute("login");
MemberDto mdto = null;
mdto = (MemberDto)ologin;
List<ScheduleDto> list = (List<ScheduleDto>)request.getAttribute("scheduleList");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=4cffb49827e0daa41ea284ad8c5c6748&libraries=services\"></script>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Rasa+DM+Serif+Text|Roboto+Condensed&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Libre+Baskerville|Merriweather|Rasa&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/TAMINO/News/Navibar.css?after\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".modal{\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\tz-index: 1;\r\n");
      out.write("\tbackground-color: rgb(0,0,0,0);\r\n");
      out.write("\tpadding-top: 10%;\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\toverflow: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".modal_content{\r\n");
      out.write("\t background-color: rgb(255,255,255,0.8);\r\n");
      out.write("\t  margin: auto;\r\n");
      out.write("\t  padding: 40px;\r\n");
      out.write("\t  border: 1px solid #888;\r\n");
      out.write("\t  width: 60%;\r\n");
      out.write("\t  height: 600px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".close{\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\tsize: 20px 20px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("\tbackground: url(\"./image/background.png\") no-repeat center center fixed;\r\n");
      out.write("\t-webkit-background-size: cover;\r\n");
      out.write("\t-moz-background-size: cover;\r\n");
      out.write("\t-o-background-size: cover;\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("span{\r\n");
      out.write("\tmargin-bottom: 20px;\r\n");
      out.write("\tfont-family: 'Roboto Condensed', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div#schedulespans{\r\n");
      out.write("\tmargin-left: 10px;\r\n");
      out.write("\tmargin-bottom: 1.5rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("span#date_span{\r\n");
      out.write("\tfont-family: 'Roboto Condensed', sans-serif;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tmargin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("span#time_span{\r\n");
      out.write("\tfont-family: 'Roboto Condensed', sans-serif;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("span#content_span{\r\n");
      out.write("\tline-height: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ticketBtn{\r\n");
      out.write("\tbackground-color: black;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tfont-size: 15px;\r\n");
      out.write("\tborder: 0px;\r\n");
      out.write("\tpadding: 10px 10px;\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tfont-style: italic;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table{\r\n");
      out.write("\t/* font-family: Sitka Text; */\r\n");
      out.write("\tfont-family: 'Libre Baskerville', serif;\r\n");
      out.write("\tcolor: #c7c0bb; \r\n");
      out.write("\twidth: 60%; \r\n");
      out.write("\tfont-size: 15pt;\r\n");
      out.write("\tborder-collapse: collapse;\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tmargin-top: 600px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table tr{\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\tborder-bottom: 1px solid black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table th{\r\n");
      out.write("\tpadding-left: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table td{\r\n");
      out.write("\tfont-style: italic;\r\n");
      out.write("\tpadding: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:hover{\r\n");
      out.write("\tbackground-color: rgb(0,0,0,0.5);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".click_title{\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- header -->\r\n");
      out.write("<div class=\"header\" style=\"background-color: rgba(255,255,255,0.5)\">\r\n");
      out.write("\t\t<div class=\"header_container\">\r\n");
      out.write("\t\t\t<div class=\"header_content\">\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/TAMINO/AdminCtrl?command=Main_Page\"><img src=\"/TAMINO/image/logo.png\"></a>\r\n");
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
      out.write("<div align=\"center\">\r\n");
      out.write("<table  >\r\n");
      out.write("\t");
for(int i=0; i<list.size(); i++){
		ScheduleDto dto = list.get(i);
		String year = dto.getSchedule_date().substring(0, 4);
		String month = dto.getSchedule_date().substring(4, 6);
		String day = dto.getSchedule_date().substring(6, 8);
		String hour = dto.getSchedule_time().substring(0, 2);
		String minute = dto.getSchedule_time().substring(2, 4);
		
		//System.out.println("year: " + year + " month: " + month + " day: " + day);
	
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th align=\"left\">");
      out.print(year );
      out.write(' ');
      out.print(convertMonth(month) );
      out.write(' ');
      out.print(day );
      out.write("</th>\r\n");
      out.write("\t\t\t<td class=\"click_title\" seq=");
      out.print(dto.getSeq() );
      out.write(" addr=\"");
      out.print(dto.getSchedule_place() );
      out.write("\" title=\"");
      out.print(dto.getSchedule_title() );
      out.write("\" \r\n");
      out.write("\t\t\t\tcontent=\"");
      out.print(dto.getSchedule_content() );
      out.write("\"date=\"");
      out.print(year );
      out.write('.');
      out.print(month );
      out.write('.');
      out.print(day );
      out.write("\" time=\"");
      out.print(hour );
      out.write(':');
      out.print(minute );
      out.write("\"\r\n");
      out.write("\t\t\t\tposter=\"");
      out.print(dto.getSchedule_poster() );
      out.write("\">\r\n");
      out.write("\t\t\t\t");
      out.print(dto.getSchedule_title() );
      out.write("&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<img alt=\"\" src=\"./image/pin.png\" width=\"20px\" height=\"20px\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t<button class=\"ticketBtn\" onclick=\"window.open('");
      out.print(dto.getTicketLink() );
      out.write("')\">T I C K E T</button>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t");
	
	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"modal_layer1\" class=\"modal\">\r\n");
      out.write("\t<div id=\"modal_layer2\" class=\"modal_content\">\r\n");
      out.write("\t\t\t<div id=\"schedulespans\">\r\n");
      out.write("\t\t\t<span class=\"close\" id=\"close_span\"><img src=\"./image/close.png\" width=\"20px\" height=\"20px\"></span>\r\n");
      out.write("\t\t\t<span id=\"title_span\" style=\"font-size: 25pt\"></span>\r\n");
      out.write("\t\t\t&nbsp;&nbsp;<span id=\"date_span\"></span>&nbsp;&nbsp;<span>/</span>&nbsp;\r\n");
      out.write("\t\t\t<span id=\"time_span\"></span><br>\r\n");
      out.write("\t\t\t<span id=\"content_span\"></span><br>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"float: left; margin-left:10px; margin-right: 20px\">\r\n");
      out.write("\t\t\t\t<img id=\"poster_img\" width=\"300px\" height=\"420px\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"map\" style=\"width:700px;height:420px;\" style=\"float: left;\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function () {\r\n");
      out.write("\r\n");
      out.write("\t$(\".click_title\").click(function () {\r\n");
      out.write("\t\t//alert(\"클릭\");\r\n");
      out.write("\t\t//alert($(this).attr(\"addr\"));\r\n");
      out.write("\t\t$(\"#modal_layer1\").css(\"display\", \"block\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#poster_img\").attr(\"src\", \"./poster/\" + $(this).attr(\"poster\"));\r\n");
      out.write("\t\t$(\"#title_span\").text($(this).attr(\"title\"));\r\n");
      out.write("\t\t$(\"#date_span\").text($(this).attr(\"date\"));\r\n");
      out.write("\t\t$(\"#time_span\").text($(this).attr(\"time\"));\r\n");
      out.write("\t\t$(\"#content_span\").text($(this).attr(\"content\"));\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar geocoder = new kakao.maps.services.Geocoder();\r\n");
      out.write("\r\n");
      out.write("\t\tvar callback = function(result, status) {\r\n");
      out.write("\t\t    if (status === kakao.maps.services.Status.OK) {\r\n");
      out.write("\t\t        console.log(result);\r\n");
      out.write("\t\t        \t        \r\n");
      out.write("\t\t        var coords = new daum.maps.LatLng(result[0].y, result[0].x);\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        var mapContainer = document.getElementById('map');\r\n");
      out.write("\t\t\t\tvar mapOption = {\r\n");
      out.write("\t\t\t\t\tcenter: new daum.maps.LatLng(result[0].y, result[0].x),\r\n");
      out.write("\t\t\t\t\tlevel: 3\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar map = new kakao.maps.Map(mapContainer, mapOption); \r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar imageSrc = './image/marker.png', // 마커이미지의 주소입니다    \r\n");
      out.write("\t\t\t\timageSize = new kakao.maps.Size(50, 53), // 마커이미지의 크기입니다\r\n");
      out.write("\t\t\t\timageOption = {offset: new kakao.maps.Point(20, 60)}; // 마커이미지의 옵션입니다. 마커의 좌표와 일치시킬 이미지 안에서의 좌표를 설정합니다.\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// 마커의 이미지정보를 가지고 있는 마커이미지를 생성합니다\r\n");
      out.write("\t\t\t\tvar markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize, imageOption),\r\n");
      out.write("\t\t\t\t    markerPosition = coords // 마커가 표시될 위치입니다\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// 마커를 생성합니다\r\n");
      out.write("\t\t\t\tvar marker = new kakao.maps.Marker({\r\n");
      out.write("\t\t\t\t    position: markerPosition, \r\n");
      out.write("\t\t\t\t    image: markerImage // 마커이미지 설정 \r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// 마커가 지도 위에 표시되도록 설정합니다\r\n");
      out.write("\t\t\t\tmarker.setMap(map);   \r\n");
      out.write("\r\n");
      out.write("\t\t\t\tmap.relayout();\r\n");
      out.write("\t\t\t\tmap.setCenter(coords);\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\tgeocoder.addressSearch($(this).attr(\"addr\"), callback);\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#close_span\").click(function () {\r\n");
      out.write("\t\t$(\"#modal_layer1\").css(\"display\", \"none\");\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
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

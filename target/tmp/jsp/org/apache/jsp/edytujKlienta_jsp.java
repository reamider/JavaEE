package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import main.java.com.smatyjas.domain.Klient;

public final class edytujKlienta_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<title>Edytuj Klienta</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<style rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\tbody{\r\n");
      out.write("\t\tbackground-color: #000000;\r\n");
      out.write("\t\tbackground: url('http://zapodaj.net/images/d1bbac5508d59.jpg'); \r\n");
      out.write("\t\tbackground-position: center top; no-repeat;\r\n");
      out.write("\t}\r\n");
      out.write("\t.przedrostki{ \r\n");
      out.write("\t\tmargin-top: 5cm; \r\n");
      out.write("\t\tmargin-left: 15cm; \r\n");
      out.write("\t\tfont-size: 24px;\r\n");
      out.write("\t\tcolor: white;\r\n");
      out.write("\t}\r\n");
      out.write("\t.zapisz{ \r\n");
      out.write("\t\tmargin-left:100px; \r\n");
      out.write("\t\tmargin-top: 20px;\r\n");
      out.write("\t}\r\n");
      out.write("\ta{ \r\n");
      out.write("\t\tcolor:green; \r\n");
      out.write("\t\tfont-size:24px; \r\n");
      out.write("\t\tfont-weight:bold; \r\n");
      out.write("\t\tmargin-left: 120px;\r\n");
      out.write("\t\tmargin-right:auto;\r\n");
      out.write("\t\tmargin-top: 1cm;\r\n");
      out.write("\t}\r\n");
      out.write("    h1{\r\n");
      out.write("    \tcolor: green; \r\n");
      out.write("    \tfont-size: 40px; \r\n");
      out.write("    \tfont-style: italic;\r\n");
      out.write("        font-family: \"Times-New-Roman\"; \r\n");
      out.write("        margin-top: -11cm;\r\n");
      out.write("\t\tmargin-left: 16cm;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      main.java.com.smatyjas.domain.Klient klient = null;
      synchronized (session) {
        klient = (main.java.com.smatyjas.domain.Klient) _jspx_page_context.getAttribute("klient", PageContext.SESSION_SCOPE);
        if (klient == null){
          klient = new main.java.com.smatyjas.domain.Klient();
          _jspx_page_context.setAttribute("klient", klient, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("klient"), request);
      out.write("\r\n");
      out.write("\t");
      main.java.com.smatyjas.service.KlientManager klientmanager = null;
      synchronized (application) {
        klientmanager = (main.java.com.smatyjas.service.KlientManager) _jspx_page_context.getAttribute("klientmanager", PageContext.APPLICATION_SCOPE);
        if (klientmanager == null){
          klientmanager = new main.java.com.smatyjas.service.KlientManager();
          _jspx_page_context.setAttribute("klientmanager", klientmanager, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t");

        String ID = request.getParameter("update");
     	int numertelefonu = 0;
    	String  imie = "",  nazwisko = "";
        for (Klient k : klientmanager.pobierzKlientow()){
          if (k.getId_klient() == Integer.parseInt(ID)){
      		imie = k.getImie();
       		nazwisko = k.getNazwisko();
        	numertelefonu = k.getNumertelefonu();
        	break;
        	}
        }
		
      out.write("\r\n");
      out.write("   \t\t<div class = 'przedrostki'>\r\n");
      out.write("\t\t<form action='updateKlient'><input type='hidden' name='id' value='\" + ID + \"' />\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td colspan='2'><b>ID Klienta:</b>&nbsp; &nbsp;  \" + ID + \"</td></tr>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<tr><td><b>Imie: </b> &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;   &nbsp; &nbsp; </td><td><input type='text' name='imie' pattern='[A-Za-z]*' title='Imie powinno składać się tylko z liter' value='\" + imie + \"' /></td></tr>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<tr><td><b>Nazwisko:</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td><td><input type='text' name='nazwisko' pattern='[A-Za-z]*' title='Nazwisko powinno składać sie tylko z liter' value='\" + nazwisko + \"' /></td></tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<td><b>Numer telefonu:</b></td><td><input type='text' name='numertelefonu'  pattern='[0-9]*' title='Numer telefonu powinien składać się tylko z liczb' value='\" + numertelefonu + \"' /></td></tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<br><td colspan='2'><div class='zapisz'><input type='submit' value='ZAPISZ'></div></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<a href=\"index.jsp\"><h3><center><font color=\"green\">Powrót do strony głównej</a></h3></center>\r\n");
      out.write("\t<h1>Edytuj Klienta</h1>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

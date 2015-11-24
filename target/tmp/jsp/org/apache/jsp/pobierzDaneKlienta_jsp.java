package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pobierzDaneKlienta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Dodaj Klienta</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<style rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("body{\r\n");
      out.write("\tbackground-color: #000000; \r\n");
      out.write("\tbackground: url('http://www.tapeta-czarne-linie-tlo.na-telefon.org/tapety/czarne-linie-tlo.jpeg'); \r\n");
      out.write("\tbackground-position: center top; no-repeat;\r\n");
      out.write("}\r\n");
      out.write(".contentbox{\r\n");
      out.write("\tmargin-top: auto;\r\n");
      out.write("    margin-left: 455px;\r\n");
      out.write("    width: auto;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    background-color: #000000;\r\n");
      out.write("    overflow: auto; //przewijanie kursora\r\n");
      out.write("    font-family: Times-New-Roman;   \r\n");
      out.write("    font-size: 24px; \r\n");
      out.write("}\r\n");
      out.write("    .pole {color:green;  font-weight: lighter; }\r\n");
      out.write("\t.potwierdz { text-align: center;}\r\n");
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
      out.write("\t<div class=\"contentbox\">\r\n");
      out.write("\t<form action=\"dodajKlienta.jsp\">\r\n");
      out.write("\t<table class=\"operationtable\">\r\n");
      out.write("\t\t<tr class='tableheader'>\r\n");
      out.write("\t\t\t<td class colspan='2'><h1><font color=\"green\"><h2>Dodaj Klienta</font></h2></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class = pole> Imie:</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"imie\" pattern=\"[A-Za-z]*\" title=\"Imie powinno składać się wyłącznie z liter\" value=\"\" /></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class = pole>Nazwisko:</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"nazwisko\" pattern=\"[A-Za-z]*\" title=\"Nazwisko powinno składać się wyłącznie z liter\" value=\"\" /></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class = pole>Numer telefonu:</td>\r\n");
      out.write("\t\t\t<td ><input type=\"text\" name=\"numertelefonu\" pattern=\"[0-9]*\" title=\"Numer telefonu powinien składać się wyłącznie z cyfr\" value=\"\" /></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class = potwierdz colspan=\"2\"><input type=\"submit\" value=\" DODAJ KLIENTA\" align=\"right\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br>\r\n");
      out.write("    <center><a href=\"index.jsp\"><h3><font color=\"green\">Strona główna</h3></center>\r\n");
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

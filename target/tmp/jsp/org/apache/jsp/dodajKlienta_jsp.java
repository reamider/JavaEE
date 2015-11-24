package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dodajKlienta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\tbody{\r\n");
      out.write("\t\tbackground-color: #000000;\r\n");
      out.write("\t}\r\n");
      out.write("\ttable{\r\n");
      out.write("\t\tborder-collapse: collapse;\r\n");
      out.write("\t\twidth: 300px; \r\n");
      out.write("\t    margin-top: auto;\r\n");
      out.write("     \tmargin-left: 530px;\r\n");
      out.write("    }\r\n");
      out.write("\ttd{\r\n");
      out.write("\t\tborder: 2px solid green;\r\n");
      out.write("\t\tcolor: green;\r\n");
      out.write("\t\tpadding: 5px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.ramka{\r\n");
      out.write("    \tfont-weight: bold;\r\n");
      out.write("    \tbackground-color: black;\r\n");
      out.write("    \tmargin-left: 455px;\r\n");
      out.write("    }\r\n");
      out.write(" </style>\r\n");
      out.write(" \r\n");
      out.write(" <body>\r\n");
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

		klientmanager.dodajKlienta(klient);
	
      out.write("\r\n");
      out.write("\t<div class=\"dodaj\">\r\n");
      out.write("\t<h1><center><font color=\"green\">Dodano następującego Klienta:</font></center></h1>\r\n");
      out.write("<table>\r\n");
      out.write("\t<tr class = \"ramka\">\r\n");
      out.write("\t\t<td>Imie:</td>\r\n");
      out.write("\t\t<td>Nazwisko:</td>\r\n");
      out.write("\t\t<td>Numer telefonu:</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((main.java.com.smatyjas.domain.Klient)_jspx_page_context.findAttribute("klient")).getImie())));
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((main.java.com.smatyjas.domain.Klient)_jspx_page_context.findAttribute("klient")).getNazwisko())));
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((main.java.com.smatyjas.domain.Klient)_jspx_page_context.findAttribute("klient")).getNumertelefonu())));
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("\t<a href=\"http://localhost:8080/KinoEE/\"><h3><center><font color=\"green\">Powrót do strony głównej</a></h3></center>\r\n");
      out.write("\t<a href=\"pobierzDaneKlienta.jsp\"><h3><center><font color=\"green\">Dodaj następnego Klienta</a></h3></center>\r\n");
      out.write("\t<a href=\"pokazKlientow.jsp\"><h3><center><font color=\"green\">Pokaż wszystkich klientów</a></h3></center>\r\n");
      out.write("</div>\r\n");
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

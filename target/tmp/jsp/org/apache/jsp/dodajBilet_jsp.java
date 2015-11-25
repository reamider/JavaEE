package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dodajBilet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Dodaj Bilet</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<style rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\tbody{\r\n");
      out.write("\t\tbackground-color: #000000;\r\n");
      out.write("\t\tbackground: url('http://zapodaj.net/images/d1bbac5508d59.jpg'); \r\n");
      out.write("\t\tbackground-position: center top; no-repeat;\r\n");
      out.write("\t}\r\n");
      out.write("\ttable{\r\n");
      out.write("\t\tborder-collapse: collapse;\r\n");
      out.write("\t\twidth: 300px; \r\n");
      out.write("\t    margin-top: auto;\r\n");
      out.write("     \tmargin-left: 530px;\r\n");
      out.write("    }\r\n");
      out.write("\ttd{\r\n");
      out.write("\t\tborder: 2px solid green;\r\n");
      out.write("\t\tcolor: white;\r\n");
      out.write("\t\tpadding: 5px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.ramka{\r\n");
      out.write("    \tfont-weight: bold;\r\n");
      out.write("    \tmargin-left: 455px;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write(" \r\n");
      out.write("<body>\r\n");
      out.write("\t");
      main.java.com.smatyjas.domain.Bilet bilet = null;
      synchronized (session) {
        bilet = (main.java.com.smatyjas.domain.Bilet) _jspx_page_context.getAttribute("bilet", PageContext.SESSION_SCOPE);
        if (bilet == null){
          bilet = new main.java.com.smatyjas.domain.Bilet();
          _jspx_page_context.setAttribute("bilet", bilet, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("bilet"), request);
      out.write("\r\n");
      out.write("\t");
      main.java.com.smatyjas.service.BiletManager biletmanager = null;
      synchronized (application) {
        biletmanager = (main.java.com.smatyjas.service.BiletManager) _jspx_page_context.getAttribute("biletmanager", PageContext.APPLICATION_SCOPE);
        if (biletmanager == null){
          biletmanager = new main.java.com.smatyjas.service.BiletManager();
          _jspx_page_context.setAttribute("biletmanager", biletmanager, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t");

		biletmanager.dodajBilet(bilet);
	
      out.write("\r\n");
      out.write("\t<div class=\"dodaj\">\r\n");
      out.write("\t<h1><center><font color=\"green\">Dodano następujący Bilet:</font></center></h1>\r\n");
      out.write("<table>\r\n");
      out.write("\t<tr class = \"ramka\">\r\n");
      out.write("\t\t<td>Rodzaj:</td>\r\n");
      out.write("\t\t<td>Cena:</td>\r\n");
      out.write("\t\t<td>Opis:</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((main.java.com.smatyjas.domain.Bilet)_jspx_page_context.findAttribute("bilet")).getRodzaj())));
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((main.java.com.smatyjas.domain.Bilet)_jspx_page_context.findAttribute("bilet")).getCena())));
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((main.java.com.smatyjas.domain.Bilet)_jspx_page_context.findAttribute("bilet")).getOpis())));
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("\t<a href=\"index.jsp\"><h3><center><font color=\"green\">Powrót do strony głównej</a></h3></center>\r\n");
      out.write("\t<a href=\"pobierzDaneBiletu.jsp\"><h3><center><font color=\"green\">Dodaj następny Bilet</a></h3></center>\r\n");
      out.write("\t<a href=\"pokazBilety.jsp\"><h3><center><font color=\"green\">Pokaż wszystkie bilety</a></h3></center>\r\n");
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

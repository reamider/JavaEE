package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Kino</title>\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<style rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\tbody{\n");
      out.write("\t\tbackground-color: #000000;\n");
      out.write("\t\tbackground: url('http://zapodaj.net/images/d1bbac5508d59.jpg'); \n");
      out.write("\t\tbackground-position: center top; no-repeat;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("<body bgcolor=\"black\">\n");
      out.write("<h1><font color=\"white\"><center>WITAMY W KINIE</center></font></h1>\n");
      out.write("<div class=\"body-content\">\n");
      out.write("<div class=\"row\">\n");
      out.write("<center>\n");
      out.write("\t<a href=\"pobierzDaneKlienta.jsp\"><h3><center><font color=\"orange\">Dodaj Klienta</a></h3></center>\n");
      out.write("\t<a href=\"pokazKlientow.jsp\"><h3><center><font color=\"orange\">Pokaż wszystkich klientów</a></h3></center>\n");
      out.write("\t<a href=\"pobierzDaneBiletu.jsp\"><h3><center><font color=\"orange\">Dodaj Bilet</a></h3></center>\n");
      out.write("\t<a href=\"pokazBilety.jsp\"><h3><center><font color=\"orange\">Pokaż wszystkie bilety</a></h3></center>\n");
      out.write("\t</center>\n");
      out.write("\t<br>\n");
      out.write("\t<center><img src=\"http://www.kino.bdk.net.pl/bdk.net.pl/KINO_BRZOZOW_files/kino%202.jpg\" alt=\"Witamy w Kinie ! width=\"480\" height=\"480\"\" /></center>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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

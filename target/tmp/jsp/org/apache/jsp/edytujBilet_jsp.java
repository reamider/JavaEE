package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import main.java.com.smatyjas.domain.Bilet;

public final class edytujBilet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Edytuj Bilet</title>\r\n");
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

        String ID = request.getParameter("update");
     	int cena = 0;
    	String  rodzaj = "",  opis = "";
        for (Bilet b : biletmanager.pobierzBilety()){
          if (b.getId_bilet() == Integer.parseInt(ID)){
      		rodzaj = b.getRodzaj();
       		cena = b.getCena();
        	opis = b.getOpis();
        	break;
        	}
        }
   		out.println("<div class = 'przedrostki'><form action='updateBilet'><input type='hidden' name='id' value='" + ID +
		   "' /><tr><td colspan='2'><b>ID Biletu:</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;  &nbsp;&nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp;  " + ID +
		   "</td></tr><br><tr><td><b>Rodzaj: </b> &nbsp; &nbsp; &nbsp;   &nbsp; &nbsp; </td><td><input type='text' name='rodzaj' pattern='[A-Za-z]*' title='Rodzaj powinien składać się tylko z liter' value='" + rodzaj +
		   "' /></td></tr><br><tr><td><b>Cena:</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td><td><input type='text' name='cena' pattern='[0-9]*' title='Cena powinna składać się tylko z liczb całkowitych' value='" + cena +
		   "' /></td></tr><tr><br><td><b>Opis:</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td><td><input type='text' name='opis' value='" + opis + 
		   "' /></td></tr><tr><br><td colspan='2'><div class='zapisz'><input type='submit' value='ZAPISZ'></div></td></tr></form></div>");
		
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<a href=\"index.jsp\"><h3><center><font color=\"green\">Powrót do strony głównej</a></h3></center>\r\n");
      out.write("\t<h1>Edytuj Bilet</h1>\r\n");
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

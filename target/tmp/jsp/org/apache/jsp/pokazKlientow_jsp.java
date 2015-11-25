package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import main.java.com.smatyjas.domain.Klient;

public final class pokazKlientow_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("  \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<title>Wszyscy Klienci</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<style rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\tbody{\r\n");
      out.write("\t\tbackground-color: #000000;\r\n");
      out.write("\t\tbackground: url('http://zapodaj.net/images/d1bbac5508d59.jpg'); \r\n");
      out.write("\t\tbackground-position: center top; no-repeat;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\ta{ \r\n");
      out.write("\t\tcolor: green; \r\n");
      out.write("\t\tfont-weight: bold; \r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t}\r\n");
      out.write(" \ttd{\r\n");
      out.write(" \t\ttext-align : center;\r\n");
      out.write(" \t\tcolor: white;\r\n");
      out.write(" \t}\r\n");
      out.write(" \tth{\r\n");
      out.write(" \t\tcolor: orange;\r\n");
      out.write(" \t}\r\n");
      out.write("    p{\r\n");
      out.write("    \tmargin-left: 12cm;\r\n");
      out.write("    \tcolor: green;\r\n");
      out.write("    }\r\n");
      out.write("    table{\r\n");
      out.write("    \tmargin-left: 140px;\r\n");
      out.write("    }           \r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
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
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t<table style=\"width:80% \" border=\"1\";>\r\n");
      out.write("    \t<tr>\r\n");
      out.write("    \t\t<th>ID Klienta:</th>\r\n");
      out.write("        \t<th>Imie:</th>\r\n");
      out.write("        \t<th>Nazwisko:</th>\r\n");
      out.write("        \t<th>Numer telefonu:</th>\r\n");
      out.write("\t\t\t<th>DZIAŁANIA:</th>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("    \t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<a href=\"index.jsp\"><h3><center><font color=\"green\">Powrót do strony głównej</a></h3></center>\r\n");
      out.write("\t<a href=\"pobierzDaneKlienta.jsp\"><h3><center><font color=\"green\">Dodaj Klienta</a></h3></center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("    \t");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("klient");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${klientmanager.pobierzKlientow()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    \t<tr>\r\n");
          out.write("    \t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${klient.id_klient}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("    \t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${klient.imie}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${klient.nazwisko}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${klient.numertelefonu}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("            <td>\r\n");
          out.write("            \t<form action=\"deleteKlient\">\r\n");
          out.write("      \t\t\t\t<input type='hidden' name='delete' value= ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${klient.id_klient}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" />  \r\n");
          out.write("      \t\t\t\t<input type='submit' value=\"USUŃ\" />   \r\n");
          out.write("      \t\t\t</form> \r\n");
          out.write("      \t\t\t<form action=\"edytujKlienta.jsp\">\r\n");
          out.write("      \t\t\t\t<input type='hidden' name='update'  value= ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${klient.id_klient}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" />\r\n");
          out.write("      \t\t\t\t<input type='submit' value=\"EDYTUJ\" />\r\n");
          out.write("       \t\t\t</form>\r\n");
          out.write("      \t\t</td>     \r\n");
          out.write("      \t</tr>\r\n");
          out.write("\t</div>\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}

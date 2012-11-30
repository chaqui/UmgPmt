package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class busqueda_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link href='http://fonts.googleapis.com/css?family=Sanchez' rel='stylesheet' type='text/css'/>\n");
      out.write("   <link rel=\"stylesheet\" type=\"text/css\"  href=\"/resources/css/cssPrincipal.css\">\n");
      out.write("        <title>Busqueda</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"menu\">\n");
      out.write("            <a href=\"index.xhtml\">Inicio</a>\n");
      out.write("            <a href=\"busqueda.jsp\">Buscar</a>\n");
      out.write("            <a href=\"admin/administrador.xhtml\">administrar</a>\n");
      out.write("            <a href=\"quienessomos.xhtml\">Creadores</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"contenedor\">\n");
      out.write("            <div id=\"titulo\">\n");
      out.write("                <h1>PMT</h1>\n");
      out.write("                <div id=\"pmt\">Policia Municipal de Transito</div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"contenido\">\n");
      out.write("                <p>\n");
      out.write("            Aca puede ingresar los datos de la placa para ver si tiene alguna remision\n");
      out.write("        </p>\n");
      out.write("        <form name=\"form1\" method=\"POST\" action=\"buscar\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <b>Datos de la placa</b>\n");
      out.write("                    </td>\n");
      out.write("                    <td><input tyoe=\"textbox\" name=\"tipo\" size=\"1\" value=\"\"></td>\n");
      out.write("                    <td><input tyoe=\"textbox\" name=\"numero\" size=\"7\" value=\"\"></td>\n");
      out.write("                    \n");
      out.write("               \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <input type=\"SUBMIT\" value=\"enviar\">\n");
      out.write("                \n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("            <div id=\"pie\">\n");
      out.write("                umg <br/>\n");
      out.write("                Universidad Mariano Galvez\n");
      out.write("                Ingenieria en Sistemas\n");
      out.write("                Programación Avanzada\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

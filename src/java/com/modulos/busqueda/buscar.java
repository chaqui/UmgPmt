/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulos.busqueda;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.modulos.busqueda.Busqueda;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author chaqui
 */
@WebServlet(name = "buscar", urlPatterns = {"/buscar"})
public class buscar extends HttpServlet {
    @PersistenceContext(unitName = "PmtUmgPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Busqueda buscar = new Busqueda();
        PrintWriter out = response.getWriter();
        List lista= buscar.findByNoPlaca(request.getParameter("numero"));
        if (lista==null) {
                        out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet buscar</title>");
            out.println(" <link rel=\"stylesheet\" type=\"text/css\"  href=\"/resources/css/cssPrincipal.css\">");
            out.println(" <link href='http://fonts.googleapis.com/css?family=Sanchez' rel='stylesheet' type='text/css'/>");
            out.println("</head>");
            out.println("<body>");
            out.println(" <div id=\"menu\">\n" +
"            <a href=\"index.xhtml\">Inicio</a>\n" +
"            <a href=\"busqueda.jsp\">Buscar</a>\n" +
"            <a href=\"admin/administrador.xhtml\">administrar</a>\n" +
"            <a href=\"quienessomos.xhtml\">Creadores</a>\n" +
"        </div>\n" +
"        <div id=\"contenedor\">\n" +
"            <div id=\"titulo\">\n" +
"                <h1>PMT</h1>\n" +
"                <div id=\"pmt\">Policia Municipal de Transito</div>\n" +
"            </div>\n" +
"            <div id=\"contenido\">");
            out.println("<h1>Servlet buscar at " +"no se encontro ninguno" + "</h1>");
            out.println(" </div>\n" +
"            <div id=\"pie\">\n" +
"                umg <br/>\n" +
"                Universidad Mariano Galvez\n" +
"                Ingenieria en Sistemas\n" +
"                Programación Avanzada\n" +
"            </div>\n" +
"        </div>");
            out.println("</body>");
            out.println("</html>");
        }

        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet buscar</title>");
            out.println(" <link rel=\"stylesheet\" type=\"text/css\"  href=\"/resources/css/cssPrincipal.css\">");
            out.println(" <link href='http://fonts.googleapis.com/css?family=Sanchez' rel='stylesheet' type='text/css'/>");
            out.println("</head>");
            out.println("<body>");
            out.println(" <div id=\"menu\">\n" +
"            <a href=\"index.xhtml\">Inicio</a>\n" +
"            <a href=\"busqueda.jsp\">Buscar</a>\n" +
"            <a href=\"admin/administrador.xhtml\">administrar</a>\n" +
"            <a href=\"quienessomos.xhtml\">Creadores</a>\n" +
"        </div>\n" +
"        <div id=\"contenedor\">\n" +
"            <div id=\"titulo\">\n" +
"                <h1>PMT</h1>\n" +
"                <div id=\"pmt\">Policia Municipal de Transito</div>\n" +
"            </div>\n" +
"            <div id=\"contenido\">");
          out.println("<p>valor encontrado</p>");
            out.println(" </div>\n" +
"            <div id=\"pie\">\n" +
"                umg <br/>\n" +
"                Universidad Mariano Galvez\n" +
"                Ingenieria en Sistemas\n" +
"                Programación Avanzada\n" +
"            </div>\n" +
"        </div>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet buscar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet buscar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


}

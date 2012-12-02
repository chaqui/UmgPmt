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
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.modulos.busqueda.BusquedaPorMySql;
/**
 *
 * @author chaqui
 */
@WebServlet(name = "buscar", urlPatterns = {"/buscar"})
public class buscar extends HttpServlet {
    private String tipo;
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
        LinkedList lista = new LinkedList();
        PrintWriter out = response.getWriter();
        try{
             BusquedaPorMySql busquedaSql = new BusquedaPorMySql();
          
        String numero =(String) request.getParameter("numero");
        tipo = (String) request.getParameter("tipo");
        System.out.println(numero);
        String query="SELECT * FROM Remision WHERE NoPlaca = \""+numero+"\"";
        System.out.println(query);
        
        try{
           lista = busquedaSql.consulta(query);
          
        }
        catch(Exception e)
        {
            System.out.println("error en la consulta");
             lista=null;
        }
        }
        catch(Exception e)
                {
                    System.out.println("error al crear ael objeto");
                }
     
        try {
        if (lista==null) {
                        out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet buscar</title>");
            out.println(" <link rel=\"stylesheet\" type=\"text/css\"  href=\"resources/css/cssPrincipal.css\">");
            out.println(" <link href='http://fonts.googleapis.com/css?family=Sanchez' rel='stylesheet' type='text/css'/>");
            out.println("</head>");
            out.println("<body style=\"    background: greenyellow; font-size: 16px; padding: 0; font-family: 'Sanchez', serif;\">");
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
            out.println("<h1> " +"no se tiene multas" + "</h1>");
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

        else{
            int q= lista.size()/25;
            System.out.println(q);
       
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet buscar</title>");
            out.println(" <link rel=\"stylesheet\" type=\"text/css\"  href=\"resources/css/cssPrincipal.css\">");
            out.println(" <script type=\"text/JavaScript\" src=\"http://code.jquery.com/jquery-1.8.3.min.js\"></script>");
            out.println("<script type=\"text/JavaScript\">");
            out.print("	$(document).on('ready',function()\n" +
"		{ $(\"#impreso\").click(fuction(e){\n" +
"                   $(\"#menu\").css(\"opacity\",\"0%\");\n" +
"                   $(\"#body\").css(\"background-color\",\"#ffffff\");\n" +
"                   window.print();\n" +
"                });\n" +
"                });\n" +
"");
            out.println("</script>");
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
            
          out.print("<table>");
          double total=0;
          int m=0;
          boolean b=false,c=true;
            for (int i = 0; i < q; i++) {
                int r= 25*i;
                if ((tipo.compareTo(lista.get(r+1).toString()))==0) {
                    System.out.println("ifs");
                    m=m+1;
                    if (c) {
                        out.print("<tr>");
                        out.print("<td>");
                        out.print("nombre:");
                        out.print("</td>");
                        out.print("<td>");
                        out.print(lista.get(r+7)+" "+lista.get(r+8));
                        out.print("</td>");
                        
                        c=false;
                    }
                    out.print("<tr>");
                    out.print("<td> multa "+String.valueOf(m) +"</td>");
                    out.print("</tr>");
                    out.print("<tr>");
                    System.out.println(lista.get(r+16)+"hola");
                    if (lista.get(r+17)!=null) {
                        out.println("<td> "+String.valueOf(lista.get(r+17)) +"</td>");
                        out.println("<td>"+String.valueOf(lista.get(r+16)) +"</td>");
                        total=total+Double.valueOf(lista.get(r+16).toString());
                    }
                    out.println("</tr>");
                    out.print("<tr>");
                    if (lista.get(r+18)!=null) {
                        out.println("<td> "+String.valueOf(lista.get(r+18)) +"</td>");
                        out.println("<td>"+String.valueOf(lista.get(r+19)) +"</td>");
                        total=total+Double.valueOf(lista.get(r+19).toString());
                    }
                    out.println("</tr>");
                     out.print("<tr>");
                    if (lista.get(r+20)!=null) {
                        out.println("<td> "+String.valueOf(lista.get(r+20)) +"</td>");
                        out.println("<td>"+String.valueOf(lista.get(r+21)) +"/td>");
                        total=total+Double.valueOf(lista.get(r+21).toString());
                    }
                    out.println("</tr>");
                    b=true;
                }
                else{
                    out.println("<tr><td>No tiene multas</td></tr>");
                }
            }
            if (b) {
                 out.print("<tr>");
                        out.println("<td> total:</td>");
                        out.println("<td>"+String.valueOf(total) +"</td>");
                        out.println("</tr>");
            }                   
            out.print("</table>");
            out.println("<input type=\"submit\"  id=\"impreso\"value=\"imprimir\">");
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

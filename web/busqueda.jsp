<%-- 
    Document   : busqueda
    Created on : 30/11/2012, 02:17:00 AM
    Author     : chaqui
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <link rel="stylesheet" type="text/css"  href="resources/css/cssPrincipal.css">
        <title>Busqueda</title>
    </head>
    <body>
        <div id="menu">
            <a href="index.xhtml">Inicio</a>
            <a href="busqueda.jsp">Buscar</a>
            <a href="admin/administrador.xhtml">administrar</a>
            <a href="quienessomos.xhtml">Creadores</a>
        </div>
        <div id="contenedor">
            <div id="titulo">
                <h1>PMT</h1>
                <div id="pmt">Policia Municipal de Transito</div>
            </div>
            <div id="contenido">
                <p>
            Aca puede ingresar los datos de la placa para ver si tiene alguna remision
        </p>
        <form name="form1" method="POST" action="buscar">
            <table>
                <tr>
                    <td>
                        <b>Datos de la placa</b>
                    </td>
                    <td><input tyoe="textbox" name="tipo" size="1" value=""></td>
                    <td><input tyoe="textbox" name="numero" size="7" value=""></td>
                    
               
                </tr>
            </table>
            <input type="SUBMIT" value="enviar">
                
        </form>
        </div>
            <div id="pie">
                umg <br/>
                Universidad Mariano Galvez
                Ingenieria en Sistemas
                Programación Avanzada
            </div>
        </div>

    </body>
</html>

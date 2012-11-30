<%-- 
    Document   : login
    Created on : 27/11/2012, 08:18:18 PM
    Author     : chaqui
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css"  href="/resources/css/cssPrincipal.css">
         <link href='http://fonts.googleapis.com/css?family=Sanchez' rel='stylesheet' type='text/css'/>
        <link type="text/css" rel="stylesheet" 
		  href="/JavaServerFaces/faces/javax.faces.resource/css/cssPrincipal.css?ln=css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <div id="menu">
            <a href="index.xhtml">Inicio</a>
            <a href="busqueda.xhtml">Buscar</a>
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
                    ingresa tu usuario y contraseña de Administrador:
                </p>
                <form method="POST" action="j_security_check">
                    <table cellpadding="0" cellspacing="0"border="0">
                        <tr>
                            <td align="right">Nombre Usuario: </td>
                            <td>
                                <input type="text" name="j_username">
                            </td>
                        </tr>
                        <tr>
                            <td align="right">Contraseña: </td>
                            <td>
                                <input type="password" name="j_password">
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>
                                <input type="submit" value="login">
                            </td>
                        </tr>
                    </table>
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

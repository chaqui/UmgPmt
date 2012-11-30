/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulos.busqueda;
import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion.Static;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author chaqui
 */
public class BusquedaPorMySql {
    private String CONTROLADOR="com.mysql.jdbc.Driver";
    private String bd ="jdbc:mysql://localhost:3306/PMT";
    Connection conexion = null; // maneja la conexión
    Statement instruccion = null; // instrucción de consulta
    ResultSet conjuntoResultados = null;
    public BusquedaPorMySql() throws ClassNotFoundException
    {
        Class.forName(CONTROLADOR);
        try {
        conexion = DriverManager.getConnection(bd,"root", "disgrafchaqui");
        instruccion = conexion.createStatement();
        }
        catch(Exception e)
                {
                    System.out.println("erro en la conexion");
                }
    }
    public LinkedList consulta(String query)
    {
        LinkedList listar= new LinkedList();
        try
        {
          conjuntoResultados = instruccion.executeQuery(query); 
          System.out.println("se ejecuto la consulta");
          ResultSetMetaData metaDatos= conjuntoResultados.getMetaData();
          int nColumnas = metaDatos.getColumnCount();
             System.out.println(String.valueOf(nColumnas));
            while(conjuntoResultados.next()){
                for (int i = 1; i < nColumnas; i++) {
                    System.out.printf( "%-8s\t", conjuntoResultados.getObject( i ) );
System.out.println(String.valueOf(i));
                    listar.add(conjuntoResultados.getObject( i ));
                }
            }
          
        }
        catch(Exception e)
                {
                    System.out.println("error en el query "+e.toString());
                        listar = null; 
                }
        finally
        {
            try{
            conjuntoResultados.close();
            instruccion.close();
            conexion.close();           
            }
            catch(Exception e)
            {
                System.out.println("problemas con el cierre");
            }
            finally
            {
            return listar;
            }
        }
   
    }
}

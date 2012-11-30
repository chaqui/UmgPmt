/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulos.busqueda;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
/**
 *
 * @author chaqui
 */
public class Busqueda {
     EntityManager em;
   
    protected EntityManager getEntityManager(){
    return em;
    }
    public List findByNoPlaca (String noplaca)
    {
       try
       {
        String consulta="Remision.findByNoPlaca";
        Query query = em.createNamedQuery(consulta);
    query.setParameter("noPlaca", noplaca);
    List resultList = query.getResultList();
    return resultList;
       }
       catch(Exception e)
       {
           return null;
       }
    }
}

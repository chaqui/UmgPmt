/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controladores.beans;

import com.modulos.persistencia.Remision;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author chaqui
 */
@Stateless
public class RemisionFacade extends AbstractFacade<Remision> {
    @PersistenceContext(unitName = "PmtUmgPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RemisionFacade() {
        super(Remision.class);
    }
    
}

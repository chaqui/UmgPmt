/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulos.busqueda;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.metamodel.Metamodel;
/**
 *
 * @author chaqui
 */
public class Busqueda {
    
    public EntityManager em= new EntityManager() {

        @Override
        public void persist(Object arg0) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public <T> T merge(T arg0) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void remove(Object arg0) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public <T> T find(Class<T> arg0, Object arg1) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public <T> T find(Class<T> arg0, Object arg1, Map<String, Object> arg2) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public <T> T find(Class<T> arg0, Object arg1, LockModeType arg2) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public <T> T find(Class<T> arg0, Object arg1, LockModeType arg2, Map<String, Object> arg3) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public <T> T getReference(Class<T> arg0, Object arg1) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void flush() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void setFlushMode(FlushModeType arg0) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public FlushModeType getFlushMode() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void lock(Object arg0, LockModeType arg1) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void lock(Object arg0, LockModeType arg1, Map<String, Object> arg2) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void refresh(Object arg0) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void refresh(Object arg0, Map<String, Object> arg1) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void refresh(Object arg0, LockModeType arg1) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void refresh(Object arg0, LockModeType arg1, Map<String, Object> arg2) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void clear() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void detach(Object arg0) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public boolean contains(Object entity) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public LockModeType getLockMode(Object arg0) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void setProperty(String arg0, Object arg1) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Map<String, Object> getProperties() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Query createQuery(String arg0) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public <T> TypedQuery<T> createQuery(CriteriaQuery<T> arg0) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public <T> TypedQuery<T> createQuery(String arg0, Class<T> arg1) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Query createNamedQuery(String name) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public <T> TypedQuery<T> createNamedQuery(String arg0, Class<T> arg1) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Query createNativeQuery(String arg0) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Query createNativeQuery(String arg0, Class arg1) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Query createNativeQuery(String arg0, String arg1) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void joinTransaction() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public <T> T unwrap(Class<T> arg0) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Object getDelegate() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void close() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public boolean isOpen() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public EntityTransaction getTransaction() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public EntityManagerFactory getEntityManagerFactory() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public CriteriaBuilder getCriteriaBuilder() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public Metamodel getMetamodel() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    };
    protected EntityManager getEntityManager(){
    return em;
    }
    public List findByNoPlaca (String noplaca)
    {
        
        String consulta="Remision.findByNoPlaca";
        System.out.println(consulta);
        System.out.println(em.toString());
        Query query = em.createNamedQuery(consulta);
    query.setParameter("noPlaca", noplaca);
    List resultList = query.getResultList();
    return resultList;
    
    }
}

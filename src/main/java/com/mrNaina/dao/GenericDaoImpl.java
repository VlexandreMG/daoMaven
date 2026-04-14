package com.mrNaina.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GenericDaoImpl<T> implements GenericDao<T> {
    
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("myAppPU");

    protected EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    @Override
    public void save(T entity) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entity); // C'est ici que Hibernate génère l'INSERT
            em.getTransaction().commit();
            System.out.println("Saving entity: " + entity);
        } catch (Exception e) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }


}
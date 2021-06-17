package com.weine.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbConnection {
    private final EntityManager entityManager;

    public DbConnection() {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("persistenceUnit");
        entityManager = managerFactory.createEntityManager();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}

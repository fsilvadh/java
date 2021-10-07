package br.com.minhaempresa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

    private static EntityManagerFactory entityManagerFactory = null;
    private static EntityManager entityManager = null;

    public static EntityManager getConexao() {
        if (entityManagerFactory == null)
            entityManagerFactory = Persistence.createEntityManagerFactory("sistema-financeiro");

        if (entityManager == null)
            entityManager = entityManagerFactory.createEntityManager();

        return entityManager;
    }

}

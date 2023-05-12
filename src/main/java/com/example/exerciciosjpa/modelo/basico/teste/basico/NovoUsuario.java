package com.example.exerciciosjpa.modelo.basico.teste.basico;

import com.example.exerciciosjpa.modelo.basico.Usuario;
import jakarta.enterprise.inject.New;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.event.spi.SaveOrUpdateEvent;

public class NovoUsuario {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Leo", "leo@lanche.com.br");
        //novoUsuario.setId(1L);
        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.getTransaction().commit();

        System.out.println("O Id gerado foi:" + novoUsuario.getId());



        em.close();
        emf.close();



    }
}

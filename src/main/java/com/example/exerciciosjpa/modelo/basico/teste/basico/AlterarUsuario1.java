package com.example.exerciciosjpa.modelo.basico.teste.basico;

import com.example.exerciciosjpa.modelo.basico.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AlterarUsuario1 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class,1L);
        usuario.setNome("Julia");
        usuario.setEmail("Julia@lanches.com.br");

        em.merge(usuario);

        System.out.println(usuario.getEmail());

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}

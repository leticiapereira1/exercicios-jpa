package com.example.exerciciosjpa.modelo.basico.teste.basico;

import com.example.exerciciosjpa.modelo.basico.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AlterarUsuario3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class,3L);
        em.detach(usuario);
        usuario.setNome("Pedro Leite");

        em.merge(usuario);

        em.getTransaction().commit();

        System.out.println(usuario.getNome());


        em.close();
        emf.close();
    }
}

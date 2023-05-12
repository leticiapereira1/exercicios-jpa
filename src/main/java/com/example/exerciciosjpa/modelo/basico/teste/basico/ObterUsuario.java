package com.example.exerciciosjpa.modelo.basico.teste.basico;

import com.example.exerciciosjpa.modelo.basico.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ObterUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class, 2L);
        System.out.println(usuario.getNome());
        em.close();
        emf.close();
    }
}

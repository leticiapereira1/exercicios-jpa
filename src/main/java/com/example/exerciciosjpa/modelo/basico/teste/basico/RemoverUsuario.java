package com.example.exerciciosjpa.modelo.basico.teste.basico;

import com.example.exerciciosjpa.modelo.basico.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RemoverUsuario {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();
        //consulta na base
        Usuario usuario =em.find(Usuario.class,3L);

        //registro de exclusão da base

        if(usuario != null){
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();
        }


        System.out.println("Foi deletado o registro ID: " + usuario.getId());



        em.close();
        emf.close();
    }
}

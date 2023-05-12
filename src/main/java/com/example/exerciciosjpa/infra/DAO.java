package com.example.exerciciosjpa.infra;

import com.example.exerciciosjpa.modelo.umpraum.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class DAO <E> {

    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        } catch (Exception e) {

        }
    }

    public DAO(Class <E>classe){
        this.classe = classe;
        em = emf.createEntityManager();
    }

    public DAO (){
        this.classe = classe;
        em = emf.createEntityManager();
    }

    //abrir a transacao

    public DAO<E> abrirT (){
        em.getTransaction().begin();
        return this;
    }
//fechar conexao
    public DAO<E> fecharT (){
        em.getTransaction().commit();
        return this;
    }
//incluir

    public DAO<E> incluir (E entidade){
        em.persist(entidade);
        return this;
    }

//incluir todas as transações de forma integral atomica

    public DAO<E> incluirAtomico (E entidade){
        return this.abrirT().incluir(entidade).fecharT();
    }

    public E obterPorId(Object id){
       return em.find(classe, id);
    }

    public List<E> obterTodos(){
        return this.obterTodos(10,0);
   }

    public List<E> obterTodos(int qtde, int deslocamento){
        if(classe == null){
            throw new UnsupportedOperationException("Classe nula.");

        }

        String jpql = "Select e from" + classe.getName() + "e";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setMaxResults(qtde);
        query.setFirstResult(deslocamento);
        return query.getResultList();
    }

    public List<E> consultar (String nomeConsulta, Object...params){
        TypedQuery<E> query = em.createNamedQuery(nomeConsulta,classe);
        for (int i = 0; i < params.length; i+=2) {
            query.setParameter(params[i].toString(), params[i + 1]);
        }
        return query.getResultList();
    }

    public E consultarUm (String nomeConsulta, Object...params){

        List<E> lista = consultar(nomeConsulta, params);
        return lista.isEmpty() ? null : lista.get(0);
        }



    public void fechar (){
        em.close();
    }



}

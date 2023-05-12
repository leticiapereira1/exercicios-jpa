package com.example.exerciciosjpa.modelo.umpraum;

import com.example.exerciciosjpa.infra.DAO;
import com.example.exerciciosjpa.modelo.basico.Produto;
//import com.example.exerciciosjpa.infra.Entidade;

public class NovoClienteAssento1 {

    public static void main(String[] args) {

       Assento assento = new Assento("16A");
       Cliente cliente = new Cliente("Carlos", assento);

       DAO<Object> dao = new DAO<Object>();

       dao.abrirT()
               .incluir(assento)
               .incluir(cliente)
               .fecharT()
               .fechar();


    }
}

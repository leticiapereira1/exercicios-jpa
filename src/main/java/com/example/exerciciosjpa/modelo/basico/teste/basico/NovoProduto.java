package com.example.exerciciosjpa.modelo.basico.teste.basico;

import com.example.exerciciosjpa.infra.DAO;
import com.example.exerciciosjpa.modelo.basico.Produto;

public class NovoProduto {
    public static void main(String[] args) {

        Produto produto = new Produto("Monitor", 2999.89);

        DAO<Produto> dao = new DAO<>(Produto.class);
        dao.incluirAtomico(produto).fechar();

        System.out.println("Id do Produto: " + produto.getId());



    }
}

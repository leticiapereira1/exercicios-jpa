package com.example.exerciciosjpa.infra;

import com.example.exerciciosjpa.modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto> {

    public ProdutoDAO (){
        super(Produto.class);
    }

}

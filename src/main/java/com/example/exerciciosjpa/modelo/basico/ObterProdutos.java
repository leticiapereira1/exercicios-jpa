package com.example.exerciciosjpa.modelo.basico;

import com.example.exerciciosjpa.infra.ProdutoDAO;

import java.util.List;

public class ObterProdutos {
    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();

        for(Produto produto: produtos) {
            System.out.println("ID: " + produto.getId() + "Nome: " + produto.getNome());

        }

        double precoTotal = produtos
                .stream()
                .map(p -> p.getPreco())
                .reduce(0.0, (t, p) -> t + p);
        System.out.println("O valor total é R$" + precoTotal);

        dao.fechar();

    }
}

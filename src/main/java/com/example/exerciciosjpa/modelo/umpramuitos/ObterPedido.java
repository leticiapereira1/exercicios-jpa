package com.example.exerciciosjpa.modelo.umpramuitos;

import com.example.exerciciosjpa.infra.DAO;

public class ObterPedido {
    public static void main(String[] args) {

        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorId(3L);

        for (ItemPedido item: pedido.getItens()){
            System.out.println("A quantidade de itens é: " + item.getQuantidade());
            System.out.println("O nome do item é: " + item.getProduto().getNome());
        }
        dao.fechar();
    }
}

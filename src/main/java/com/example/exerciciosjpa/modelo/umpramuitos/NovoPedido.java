package com.example.exerciciosjpa.modelo.umpramuitos;

import com.example.exerciciosjpa.infra.DAO;

import com.example.exerciciosjpa.modelo.basico.Produto;
import com.example.exerciciosjpa.modelo.umpramuitos.ItemPedido;
import com.example.exerciciosjpa.modelo.umpramuitos.Pedido;

public class NovoPedido {
    public static void main(String[] args) {

        DAO<Object> dao = new DAO<>();

        Pedido pedido = new Pedido();
        Produto produto = new Produto("Torradeira", 399.56);
        ItemPedido itemPedido = new ItemPedido(pedido,produto,1);

        dao.abrirT();
        dao.incluir(produto);
        dao.incluir(pedido);
        dao.incluir(itemPedido);
        dao.fecharT();
        dao.fechar();


    }
}

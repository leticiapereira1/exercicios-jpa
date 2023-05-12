package com.example.exerciciosjpa.modelo.umpraum;

import com.example.exerciciosjpa.infra.DAO;

public class ObterClienteAssento {
    public static void main(String[] args) {

        DAO<Cliente> daoCliente = new DAO<>(Cliente.class);

        Cliente cliente = daoCliente.obterPorId(1L);
        System.out.println("O nome do assento é: " + cliente.getAssento().getNome());
        System.out.println("O nome do responsável pelo assento é: " + cliente.getAssento().getCliente().getNome());

        daoCliente.fechar();

        DAO<Assento> daoAssento = new DAO<>(Assento.class);
        Assento assento = daoAssento.obterPorId(1L);

        System.out.println("Obtendo por assento: " + assento.getCliente().getNome());

    }
}

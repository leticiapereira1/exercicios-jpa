package com.example.exerciciosjpa.modelo.umpraum;

import com.example.exerciciosjpa.infra.DAO;

public class NovoClienteAssento2 {
    public static void main(String[] args) {

        Assento assento = new Assento("6D");

        Cliente cliente = new Cliente("Robson", assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);
        dao.incluirAtomico(cliente);





    }
}

package com.example.exerciciosjpa.modelo.muitospramuitos;

import com.example.exerciciosjpa.infra.DAO;

public class NovoTioSobrinho {
    public static void main(String[] args) {

        Tio tia1 = new Tio("Maria");
        Tio tio2 = new Tio("Joao");

        Sobrinho sobrinho1 = new Sobrinho("Junior");
        Sobrinho sobrinha2 = new Sobrinho("Ana");

        tia1.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tia1);

        tia1.getSobrinhos().add(sobrinha2);
        sobrinha2.getTios().add(tia1);

        tio2.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tio2);

        tio2.getSobrinhos().add(sobrinha2);
        sobrinha2.getTios().add(tio2);

        DAO<Object> dao = new DAO<>();
        dao
                .abrirT()
                .incluir(tia1)
                .incluir(tio2)
                .incluir(sobrinho1)
                .incluir(sobrinha2)
                .fecharT()
                .fechar();
    }
}

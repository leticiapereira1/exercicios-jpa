package com.example.exerciciosjpa.modelo.muitospramuitos;

import com.example.exerciciosjpa.infra.DAO;

public class NovoFilmeAtor {
    public static void main(String[] args) {

        Filme filmeA = new Filme("A Ilha do medo", 7.1);
        Filme filmeB = new Filme("Eu sou a Lenda", 9.9);

        Ator atorA = new Ator("Harrison Ford");
        Ator atrizB = new Ator("Carrie Fisher");

        filmeA.adicionarAtor(atorA);
        filmeA.adicionarAtor(atrizB);

        filmeB.adicionarAtor(atorA);

        DAO<Filme> dao = new DAO<Filme>();
        dao.incluirAtomico(filmeA);
    }
}

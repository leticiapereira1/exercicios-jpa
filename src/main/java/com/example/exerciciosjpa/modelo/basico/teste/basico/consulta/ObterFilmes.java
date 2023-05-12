package com.example.exerciciosjpa.modelo.basico.teste.basico.consulta;

import com.example.exerciciosjpa.infra.DAO;
import com.example.exerciciosjpa.modelo.muitospramuitos.Ator;
import com.example.exerciciosjpa.modelo.muitospramuitos.Filme;

import java.util.List;


public class ObterFilmes {

    public static void main(String[] args) {
        DAO<Filme> dao = new DAO<>(Filme.class);
        List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 8.5);
        System.out.println(filmes.size());

        for(Filme filme: filmes){
            System.out.println(filme.getNome() + " => " + filme.getNota());

            for (Ator ator: filme.getAtores()){
                System.out.println(ator.getNome());
            }
        }
    }

}

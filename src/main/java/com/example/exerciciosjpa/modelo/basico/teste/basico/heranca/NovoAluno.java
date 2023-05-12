package com.example.exerciciosjpa.modelo.basico.teste.basico.heranca;

import com.example.exerciciosjpa.infra.DAO;
import com.example.exerciciosjpa.modelo.heranca.Aluno;
import com.example.exerciciosjpa.modelo.heranca.AlunoBolsista;

public class NovoAluno {
    public static void main(String[] args) {

        DAO<Aluno> alunoDAO = new DAO<>();

        Aluno aluno1 = new Aluno(123L, "João");
        AlunoBolsista aluno2 = new AlunoBolsista(345L, "Maria", 1000.00);


        alunoDAO.incluirAtomico(aluno1);
        alunoDAO.incluirAtomico(aluno2);

        alunoDAO.fechar();


    }
}

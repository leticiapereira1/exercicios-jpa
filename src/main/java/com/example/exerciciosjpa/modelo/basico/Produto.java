package com.example.exerciciosjpa.modelo.basico;

import com.example.exerciciosjpa.infra.Entidade;
import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public class Produto implements Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "prod_nome", nullable = false)
    private String nome;

    @JoinColumn(name = "prod_preco", nullable = false) //precision = tamanho do campo, scale = quantas casas decimais depois do ponto flutante
    private Double preco;



    public Produto() {

    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


}

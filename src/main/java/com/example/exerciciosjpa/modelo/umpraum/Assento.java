package com.example.exerciciosjpa.modelo.umpraum;

import com.example.exerciciosjpa.infra.Entidade;
import jakarta.persistence.*;

@Entity
@Table(name = "assentos")
public class Assento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(mappedBy = "assento")// apenas indicando que é uma relaçao bidimensional mapeaia de 1 para 1
    private Cliente cliente;

    public Assento(){

    }

    public Assento(String nome) {
        this.nome = nome;
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


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

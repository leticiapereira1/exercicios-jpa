package com.example.exerciciosjpa.modelo.umpramuitos;

import jakarta.persistence.*;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.Date;
import java.util.List;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date data;

    @OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY)// OneToMany- um pedido com muitos itens de pedido// ..toMany - FetchType.LAZY - esse valor é default)
    private List<ItemPedido> itens;

    public Pedido (){
        this(new Date());
    }

    public Pedido(Date data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}

package br.pro.ramon.dcs.models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Produto {

    private Integer id;
    private String nome;
    private double preco;

    protected Produto() {
    }

    public Produto(Integer id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @XmlAttribute
    public Integer getId() {
        return id;
    }

    @XmlElement
    public String getNome() {
        return nome;
    }

    @XmlElement
    public double getPreco() {
        return preco;
    }

}

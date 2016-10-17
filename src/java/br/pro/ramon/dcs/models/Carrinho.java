package br.pro.ramon.dcs.models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Carrinho {

    private List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<Produto>();
    }

    public boolean add(Produto e) {
        return produtos.add(e);
    }

    @XmlElement
    public List<Produto> getProdutos() {
        return produtos;
    }

    @XmlElement
    public double getTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }

}

package br.pro.ramon.dcs.rest;

import br.pro.ramon.dcs.models.Carrinho;
import br.pro.ramon.dcs.models.Produto;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/carrinho")
public class CarrinhoResource {

    @GET
    @Path("/vazio.xml")
    @Produces(MediaType.APPLICATION_XML)
    public Carrinho getCarrinhoVazioXml() {
        Carrinho c = new Carrinho();
        return c;
    }

    @GET
    @Path("/vazio.json")
    @Produces(MediaType.APPLICATION_JSON)
    public Carrinho getCarrinhoVazioJson() {
        Carrinho c = new Carrinho();
        return c;
    }

    @GET
    @Path("/xml")
    @Produces(MediaType.APPLICATION_XML)
    public Carrinho getCarrinhoXml() {
        Carrinho c = new Carrinho();
        c.add(new Produto(1, "Maçã", 2.7));
        c.add(new Produto(2, "Pêra", 3.5));
        c.add(new Produto(3, "Banana", 6.7));
        c.add(new Produto(4, "Uva", 5.5));
        c.add(new Produto(5, "Abacaxi", 10));
        c.add(new Produto(6, "Limão", 2.5));
        return c;
    }

    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Carrinho getCarrinhoJson() {
        Carrinho c = new Carrinho();
        c.add(new Produto(1, "Maçã", 2.7));
        c.add(new Produto(2, "Pera", 3.5));
        c.add(new Produto(3, "Banana", 6.7));
        c.add(new Produto(4, "Uva", 5.5));
        c.add(new Produto(5, "Abacaxi", 10));
        c.add(new Produto(6, "Limão", 2.5));
        return c;
    }

}

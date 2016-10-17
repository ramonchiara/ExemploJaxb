package br.pro.ramon.dcs.rest;

import br.pro.ramon.dcs.models.Calculadora;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/calculadora")
public class CalculadoraResource {

    @GET
    @Path("/xml")
    @Produces(MediaType.APPLICATION_XML)
    public Calculadora calculaXml(@QueryParam("n1") double n1, @QueryParam("n2") double n2, @QueryParam("op") String op) {
        return new Calculadora(n1, n2, op);
    }

    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Calculadora calculaJson(@QueryParam("n1") double n1, @QueryParam("n2") double n2, @QueryParam("op") String op) {
        return new Calculadora(n1, n2, op);
    }

}

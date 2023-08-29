package br.fag.services;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

@Path("/multiplicacao")
public class Multiplicacao {
    @GET
    public Response operacao(@QueryParam("primeiroValor")float primeiroValor, @QueryParam("segundoValor") float segundoValor){
        float resultado = primeiroValor * segundoValor;
        return Response.ok("O resultado da multiplicação é: " + resultado).build();
    }
}

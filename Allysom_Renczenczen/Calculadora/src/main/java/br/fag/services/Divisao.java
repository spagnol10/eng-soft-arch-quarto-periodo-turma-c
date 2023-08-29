package br.fag;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

@Path("/divisao")
public class Divisao {
    @GET
    public Response operacao(@QueryParam("primeiroValor")int primeiroValor, @QueryParam("segundoValor") int segundoValor){
        if(segundoValor <= 0){
            return Response.status(Response.Status.BAD_REQUEST).entity("O segundo valor não pode ser zero ou negativo").build();
        }
        int resultado = primeiroValor / segundoValor;
        return Response.ok("O resultado da divisão é: " + resultado).build();
    }
}

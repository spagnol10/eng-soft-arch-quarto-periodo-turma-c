package br.fag.Controllers;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;
@Path("/calculate")
public class CaculatorResource {
    @GET
    public Response calculate(@QueryParam("fisrt") float first, @QueryParam("second") float second, @QueryParam("operator") String operator){
        float result;
        switch (operator) {
            case "+" -> result = first + second;
            case "-" -> result = first - second;
            case "*" -> result = first * second;
            case "/" -> {
                if (second == 0) {
                    return Response.status(Response.Status.BAD_REQUEST).entity("Cannot divide by zero").build();
                }
                result = first / second;
            }
            default -> {
                return Response.status(Response.Status.BAD_REQUEST).entity("Invalid operator").build();
            }
        }
        return Response.ok(String.valueOf(result)).build();
    }
}


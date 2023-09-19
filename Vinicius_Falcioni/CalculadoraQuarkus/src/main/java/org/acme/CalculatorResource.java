package org.acme;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/calculate")
public class CalculatorResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public OperationResult performCalculation(OperationRequest request) {
        double result = 0;
        String message = "";

        switch (request.getOperation()) {
            case "add":
                result = request.getNumber1() + request.getNumber2();
                break;
            case "subtract":
                result = request.getNumber1() - request.getNumber2();
                break;
            case "multiply":
                result = request.getNumber1() * request.getNumber2();
                break;
            case "divide":
                if (request.getNumber2() == 0) {
                    message = "Divisão por zero não é permitida.";
                    return new OperationResult(result, message);
                }
                result = request.getNumber1() / request.getNumber2();
                break;
            default:
                message = "Operação não suportada.";
                return new OperationResult(result, message);
        }

        return new OperationResult(result, message);
    }
}

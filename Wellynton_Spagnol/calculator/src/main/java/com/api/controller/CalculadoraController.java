package com.api.controller;

import com.api.model.EnumUserOption;
import com.api.service.CalculadoraService;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.stream.Collectors;

@Consumes(MediaType.TEXT_HTML)
@Produces(MediaType.TEXT_HTML)
@Path("/")
public class CalculadoraController {

    @Inject
    Template index;

    @Inject
    Template calculadora;

    @GET
    public TemplateInstance get() {
        List<EnumUserOption> arithmeticOperations = List.of(EnumUserOption.values())
                .stream()
                .map(e -> e.getOption())
                .collect(Collectors.toList());

        return index.data("name", "Wellyton Spagnol", "arithmeticOperations", arithmeticOperations);
    }

    @POST
    @Consumes("application/x-www-form-urlencoded")
    public TemplateInstance post(@FormParam("primeiroValor") Float primeiro, @FormParam("segundoValor") Float segundo, @FormParam("selectCalculadora") Integer operation) {

        CalculadoraService service = new CalculadoraService();

        Float result = service.calculate(primeiro, segundo, operation);


        return calculadora.data("result", result);
    }

}

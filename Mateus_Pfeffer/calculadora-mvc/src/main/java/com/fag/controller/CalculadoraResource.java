package com.fag.controller;

import com.fag.model.EnumOperation;
import com.fag.model.IEnum;
import com.fag.service.CalculadoraService;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Path("/calculator")
public class CalculadoraResource {

    @Inject
    CalculadoraService service;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getPage(@QueryParam("name") String name) {
        List<String> operations = Stream.of(EnumOperation.values())
                .map(EnumOperation::getValue)
                .collect(Collectors.toList());

        return Templates.page(name, operations);
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calculate(@FormParam("num1") String num1,
                                      @FormParam("num2") String num2,
                                      @FormParam("operation") String operation) {
        BigDecimal value1 = new BigDecimal(num1);
        BigDecimal value2 = new BigDecimal(num2);

        if (value2.equals(BigDecimal.ZERO) && operation.equals("Divisão")) {
            throw new RuntimeException("Erro! Segundo número inválido!");
        }

        BigDecimal result = service.calculate(value1, value2, IEnum.findByValue(EnumOperation.class, operation));

        return Templates.calculator(result, null);
    }

    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance page(String name, List<String> operations);

        public static native TemplateInstance calculator(BigDecimal result, String name);
    }

}
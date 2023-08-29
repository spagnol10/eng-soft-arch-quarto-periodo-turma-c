package org.acme.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.acme.model.EnumUserOption;
import org.acme.services.CalculatorService;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/home")
@Consumes(MediaType.TEXT_HTML)
@Produces(MediaType.TEXT_HTML)
public class Calculator {
@Inject
  Template page;

  @Inject
  Template calculator;

  // @Inject
  // CalculatorService service;

  @GET
  public TemplateInstance get(@QueryParam("name") String name) {
    List<String> arithmeticOperations = List.of(EnumUserOption.values()).stream()
    .map(e -> e.getValue())
    .collect(Collectors.toList());

    return page.data("name", name, "arithmeticOperations", arithmeticOperations);
  }

  @POST
  public TemplateInstance post(@QueryParam("name") String name) {
    List<String> arithmeticOperations = List.of(EnumUserOption.values()).stream()
    .map(e -> e.getValue())
    .collect(Collectors.toList());

    return page.data("name", name, "arithmeticOperations", arithmeticOperations);
  }
}

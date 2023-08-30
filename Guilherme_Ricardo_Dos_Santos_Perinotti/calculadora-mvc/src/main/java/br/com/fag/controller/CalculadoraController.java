package br.com.fag.controller;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.stream.Collectors;

import br.com.fag.model.EnumUserOption;

@Consumes(MediaType.TEXT_HTML)
@Produces(MediaType.TEXT_HTML)
@Path("/calculadora")
public class CalculadoraController {
  
  @Inject
  Template index;

  @Inject
  Template calculadora;

  @GET
  public TemplateInstance get(@QueryParam("name") String name) {
    List<EnumUserOption> arithmeticOperations = List.of(EnumUserOption.values())
      .stream()
      .map(e -> e.getOption())
      .collect(Collectors.toList());
    
    return index.data("name", name, "arithmeticOperations", arithmeticOperations);
  }

}

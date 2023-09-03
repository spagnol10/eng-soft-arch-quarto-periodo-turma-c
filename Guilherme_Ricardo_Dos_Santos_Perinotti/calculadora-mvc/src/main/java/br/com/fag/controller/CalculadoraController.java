package br.com.fag.controller;

import java.util.List;
import java.util.stream.Collectors;

import br.com.fag.model.EnumUserOption;
import br.com.fag.service.CalculadoraService;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

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
    
    return index.data("name", "Guilherme Perinotti", "arithmeticOperations", arithmeticOperations);
  }

  @POST
  @Consumes("application/x-www-form-urlencoded")
  public TemplateInstance post(@FormParam("primeiroValor") Float primeiro, @FormParam("segundoValor") Float segundo, @FormParam("selectCalculadora") Integer operation ) {

    CalculadoraService service = new CalculadoraService();

    Float result = service.calculate(primeiro, segundo, operation);

    
    return calculadora.data("result", result);
  }

}

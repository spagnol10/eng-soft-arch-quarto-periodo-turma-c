package org.acme;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

@Path("/Calculadora")
public class SomePage {

    private final Template page;

    public SomePage(Template page) {
        this.page = requireNonNull(page, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance retornarTelaInicial() {
        return page.data("dataDTO", null);
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calcular(@FormParam("valor1") Double valor1) {
            @FormParam("valor1") Double valor1,
            @FormParam("valor2") Double valor2,
            @FormParam("opcao") String opcao,
        TemplateDataDTO dto = new TemplateDataDTO();
        CalculadoraService service = new CalculadoraService();

        Double resultado = service.realizarCalculo(opcao, valor1, valor2);

        dto.setName("Zucco");
        dto.setResultado(valor1 + valor2);

        return page.data("dataDTO", dto);
    }


}

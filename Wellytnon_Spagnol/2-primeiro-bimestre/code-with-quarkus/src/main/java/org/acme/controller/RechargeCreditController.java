package org.acme.controller;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.dto.recharge.TokenRechargeDTO;
import org.acme.model.TokenRecharge;
import org.acme.service.TokenRechargeService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/recharge")
public class RechargeCreditController {

    @Inject
    @RestClient
    TokenRechargeService tokenRechargeService;

    @GET
    @Path("/token")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response hello() {

        TokenRechargeDTO dto = getToken();
        TokenRecharge entity = new TokenRecharge();

        entity.setToken(dto.getAccess_token());
        entity.persist();

        return Response.ok(getToken()).build();
    }

    public TokenRechargeDTO getToken() {
        Form form = new Form();

        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

        TokenRechargeDTO token = tokenRechargeService.getToken(form);

        return token;
    }


}

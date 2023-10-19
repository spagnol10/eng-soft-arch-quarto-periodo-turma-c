package org.acme.service;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;
import org.acme.dto.boletos.TokenBoletoDTO;
import org.acme.dto.recharge.TokenRechargeDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface TokenRechargeService {

    @POST
    @Path("/v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    TokenRechargeDTO getToken(Form form);
}


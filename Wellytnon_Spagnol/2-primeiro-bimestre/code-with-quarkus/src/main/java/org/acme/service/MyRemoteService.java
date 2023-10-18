package org.acme.service;

import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.acme.dto.boletos.ConsultBoletoDto;
import org.acme.dto.boletos.ConsultResponseDTO;
import org.acme.dto.boletos.PaymentResponseDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface MyRemoteService {

    @POST
    @Path("/v5/transactions/billpayments/authorize")
    ConsultResponseDTO consult(@HeaderParam("Authorization") String token, ConsultBoletoDto dto);

    @POST
    @Path("/v5/transactions/billpayments")
    PaymentResponseDTO payment(@HeaderParam("Authorization") String token, ConsultBoletoDto dto);
}

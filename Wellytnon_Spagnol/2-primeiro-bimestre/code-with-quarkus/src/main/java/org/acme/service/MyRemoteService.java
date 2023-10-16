package org.acme.service;

import org.acme.dto.boletos.*;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface MyRemoteService {

    @POST
    @Path("/v5/transactions/billpayments/authorize")
    ConsultResponseDTO consult(@HeaderParam("Authorization") String token, ConsultBoletoDto dto);

    @POST
    @Path("/v5/transactions/billpayments")
    PaymentResponseDTO payment(@HeaderParam("Authorization") String token, ConsultBoletoDto dto);

    // @PUT
    // @Path("/v5/transactions/billpayments/{transactionId}/capture")
    // String capture(@HeaderParam("Authorization") String string, ConsultaBoletoDto
    // dto);
    //
    // @DELETE
    // @Path("/v5/transactions/billpayments/{transactionId}/void")
    // String cancel(@HeaderParam("Authorization") String string, ConsultaBoletoDto
    // dto);
    //
    // @DELETE
    // @Path("/v5/transactions/billpayments/{transactionId}/reverse")
    // String reverse(@HeaderParam("Authorization") String string, ConsultaBoletoDto
    // dto);

    // @GET
    // @Path("/v5/transactions/status-consult")
    // ConsultResponseDTO statusConsult(@HeaderParam("Authorization") String string,
    // ConsultaBoletoDto dto);

    // @GET
    // @Path("/v5/transactions/occurrency")
    // PaymentResponseDTO occurrence(@HeaderParam("Authorization") String string,
    // ConsultaBoletoDto dto);
}

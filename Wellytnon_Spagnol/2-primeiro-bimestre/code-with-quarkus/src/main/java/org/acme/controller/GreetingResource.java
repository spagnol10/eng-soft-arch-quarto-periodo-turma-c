package org.acme.controller;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.dto.boletos.ConsultBoletoDto;
import org.acme.dto.boletos.ConsultResponseDTO;
import org.acme.dto.boletos.PaymentResponseDTO;
import org.acme.dto.boletos.TokenBoletoDTO;
import org.acme.model.Payment;
import org.acme.model.Token;
import org.acme.repositories.PaymentRepository;
import org.acme.service.MyRemoteService;
import org.acme.service.TokenService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api")
public class GreetingResource {

    @Inject
    @RestClient
    MyRemoteService restClient;

    @Inject
    @RestClient
    TokenService tokenService;

    @Inject
    PaymentRepository paymentRepository;

    @GET
    @Path("/token")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response hello() {

        TokenBoletoDTO dto = getToken();
        Token entity = new Token();

        entity.setToken(dto.getAccess_token());
        entity.persist();

        return Response.ok(getToken()).build();
    }

    public TokenBoletoDTO getToken() {
        Form form = new Form();

        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

        TokenBoletoDTO token = tokenService.getToken(form);

        return token;
    }

    @POST
    @Path("/consult")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response consult(ConsultBoletoDto dto) {
        ConsultResponseDTO response = restClient.consult("Bearer " + getToken().getAccess_token(), dto);

        return Response.ok(response).build();
    }

    @POST
    @Path("/payment")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response payment(ConsultBoletoDto dto) {
        PaymentResponseDTO response = restClient.payment("Bearer " + getToken().getAccess_token(), dto);
        Payment entity = new Payment();

        entity.setAmount(dto.getBill().getValue());
        entity.setDigitable(dto.getData().getDigitable());
        entity.setReceipt(response.getReceipt().getReceiptformatted());

        paymentRepository.persistPayment(entity);
        return Response.ok().entity(response).build();
    }

    @GET
    @Path("/payment/list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPayments() {
        return Response.ok().entity(paymentRepository.listAllPayments()).build();
    }

    @GET
    @Path("/payment/find")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findById(@HeaderParam("id") String id) {
        return Response.ok().entity(paymentRepository.findPaymentById(id)).build();
    }

    @PATCH
    @Path("/payment")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response update(@HeaderParam("id") String id) {
        return Response.ok().entity(paymentRepository.updatePayment(id)).build();
    }

    @DELETE
    @Path("/payment")
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@HeaderParam("id") String id) {
        return Response.ok().entity(paymentRepository.delete(id)).build();
    }

}

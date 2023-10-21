package org.acme.service;

import jakarta.ws.rs.*;
import org.acme.dto.recharge.ConsultResponseRechargeDTO;
import org.acme.dto.recharge.PhoneDTO;
import org.acme.dto.recharge.ReservBalanceToRecharge;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface MyRemoteRechargeService {

    @GET
    @Path("/v5/transactions/topups/providers")
    ConsultResponseRechargeDTO listOperators(@HeaderParam("Authorization") String token, PhoneDTO dto);

    @POST
    @Path("/v5/transactions/topups")
    ConsultResponseRechargeDTO reserv(@HeaderParam("Authorization") String token, ReservBalanceToRecharge dto);


}

package org.acme.service;

import jakarta.ws.rs.*;
import org.acme.dto.recharge.ConsultResponseRechargeDTO;
import org.acme.dto.recharge.QueryParams;
import org.acme.dto.recharge.ReservBalanceToRecharge;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface MyRemoteRechargeService {

    @GET
    @Path("/v5/transactions/topups/providers?stateCode=11&type=0&category=0")
    ConsultResponseRechargeDTO listOperators(@HeaderParam("Authorization") String token, QueryParams dto);

    @GET
    @Path("/v5/transactions/topups/provider-values")
    ConsultResponseRechargeDTO consultOperational(@HeaderParam("Authorization") String token, QueryParams dto);

    @GET
    @Path("/v5/transactions/status-consult")
    ConsultResponseRechargeDTO consultRecharge(@HeaderParam("Authorization") String token, QueryParams dto);

    @GET
    @Path("/v5/transactions/topups/find-providers")
    ConsultResponseRechargeDTO searchOperator(@HeaderParam("Authorization") String token, QueryParams dto);

    @POST
    @Path("/v5/transactions/topups")
    ConsultResponseRechargeDTO reserv(@HeaderParam("Authorization") String token, ReservBalanceToRecharge dto);

    @PATCH
    @Path("/v5/transactions/topups/{transactionId}/capture")
    ConsultResponseRechargeDTO update(@PathParam("transactionId") String transactionId, @HeaderParam("Authorization") String token, ReservBalanceToRecharge dto);


}

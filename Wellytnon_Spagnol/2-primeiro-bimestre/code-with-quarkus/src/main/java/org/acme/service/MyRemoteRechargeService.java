package org.acme.service;

import jakarta.ws.rs.*;
import org.acme.dto.recharge.*;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface MyRemoteRechargeService {

    @GET
    @Path("/v5/transactions/topups/providers")
    Operator listOperators(@HeaderParam("Authorization") String token, @QueryParam("stateCode") Integer stateCode, @QueryParam("category") String category, @QueryParam("type") String type);

    @GET
    @Path("/v5/transactions/topups/provider-values")
    ConsultOperatingValues consult(@HeaderParam("Authorization") String token, @QueryParam("stateCode") Integer stateCode, @QueryParam("providerId") String providerId);

//    @GET
//    @Path("/v5/transactions/status-consult")
//    ConsultResponseRechargeDTO consultRecharge(@HeaderParam("Authorization") String token, QueryParams dto);
//
//    @GET
//    @Path("/v5/transactions/topups/find-providers")
//    ConsultResponseRechargeDTO searchOperator(@HeaderParam("Authorization") String token, QueryParams dto);

    @POST
    @Path("/v5/transactions/topups")
    ConsultResponseRechargeDTO reserve(@HeaderParam("Authorization") String token, ReservBalanceToRecharge dto);

    @PATCH
    @Path("/v5/transactions/topups/{transactionId}/capture")
    ConsultResponseRechargeDTO update(@PathParam("transactionId") String transactionId, @HeaderParam("Authorization") String token, ReservBalanceToRecharge dto);


}

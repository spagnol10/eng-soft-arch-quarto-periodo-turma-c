//package org.acme.usecases;
//
//import org.acme.dto.recharge.RechargeDTO;
//import org.acme.repositories.IRechargeDataBaseRepository;
//import org.acme.repositories.IRechargeVendorRepository;
//
//public class CreateRecharge {
//
//    private IRechargeVendorRepository vendor;
//    private IRechargeDataBaseRepository dbRepository;
//
//    public CreateRecharge(IRechargeVendorRepository vendor, IRechargeDataBaseRepository dbRepository) {
//        this.vendor = vendor;
//        this.dbRepository = dbRepository;
//    }
//
//    public RechargeDTO execute(RechargeDTO rechargeDTO) {
//        // Implemente o código para processar a recarga aqui.
//        // Use a instância de vendor e dbRepository para realizar a recarga.
//
//        // Após processar a recarga, você pode retornar um novo RechargeDTO.
//        RechargeDTO resultDTO = new RechargeDTO();
//
//        // Preencha os dados no resultDTO com base no processamento da recarga.
//        // Por exemplo:
//        resultDTO.setAmount(rechargeDTO.getAmount());
//        resultDTO.setPhoneNumber(rechargeDTO.getPhoneNumber());
//        resultDTO.setTransactionId("123456");
//
//        return resultDTO;
//    }
//
//}

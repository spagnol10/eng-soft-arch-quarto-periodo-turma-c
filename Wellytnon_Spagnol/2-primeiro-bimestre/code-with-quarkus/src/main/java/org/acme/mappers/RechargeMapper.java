package org.acme.mappers;

import org.acme.dto.recharge.RechargeDTO;
import org.acme.entities.RechargeBO;

public class RechargeMapper {

    public static RechargeDTO toDTO(RechargeBO bo) {
        RechargeDTO dto = new RechargeDTO();
        dto.setValue(bo.getValue());
        dto.setDocument(bo.getDocument());
        dto.setOperatorId(bo.getProviderId());
        dto.setPhone(PhoneMapper.toDTO(bo.getPhone()));
        dto.setReceipt(bo.getReceipt());
        dto.setTransactionId(bo.getTransactionId());
        dto.setSuccess(bo.isSuccess());
        return dto;
    }

    public static RechargeBO toBO(RechargeDTO dto) {
        return new RechargeBO(
                dto.getValue(),
                dto.getDocument(),
                dto.getOperatorId(),
                PhoneMapper.toBO(dto.getPhone()),
                dto.getReceipt(),
                dto.getTransactionId(),
                dto.isSuccess());
    }
}

package org.acme.mappers;

import org.acme.dto.recharge.PhoneDTO;
import org.acme.entities.PhoneBO;

public class PhoneMapper {

    public static PhoneDTO toDTO(PhoneBO bo) {
        PhoneDTO dto = new PhoneDTO();
        dto.setStateCode(bo.getStateCode());
        dto.setCountryCode(bo.getCountryCode());
        dto.setNumber(bo.getNumber());
        return dto;
    }

    public static PhoneBO toBO(PhoneDTO dto) {
        return new PhoneBO(
                dto.getStateCode(),
                dto.getCountryCode(),
                dto.getNumber());
    }

}

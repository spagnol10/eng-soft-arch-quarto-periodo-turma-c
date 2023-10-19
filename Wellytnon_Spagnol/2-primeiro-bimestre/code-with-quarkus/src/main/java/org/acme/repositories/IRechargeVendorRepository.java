package org.acme.repositories;

import org.acme.dto.recharge.OperatorDTO;
import org.acme.dto.recharge.ProductDTO;
import org.acme.dto.recharge.RechargeDTO;

import java.util.List;

public interface IRechargeVendorRepository {
    RechargeDTO create(RechargeDTO recharge);

    List<OperatorDTO> listOperators(Integer stateCode, Integer category);

    List<ProductDTO> listProducts(Integer stateCode, Integer operatorId);

}

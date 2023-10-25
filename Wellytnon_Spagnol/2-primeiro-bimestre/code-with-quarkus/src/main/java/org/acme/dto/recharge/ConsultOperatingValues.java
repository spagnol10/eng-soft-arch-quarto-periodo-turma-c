package org.acme.dto.recharge;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class ConsultOperatingValues {
    private List<ProductDTO> value;
    private String externalNsuQuery;
    private String errorCode;
    private String message;
    private String status;

}

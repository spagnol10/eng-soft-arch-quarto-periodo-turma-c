package org.acme.dto.boletos;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.Getter;

@Getter
public class TokenBoletoDTO {

    @JsonbProperty("access_token")
    public String access_token;

    public TokenBoletoDTO() {
    }

    public TokenBoletoDTO(String access_token) {
        this.access_token = access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

}

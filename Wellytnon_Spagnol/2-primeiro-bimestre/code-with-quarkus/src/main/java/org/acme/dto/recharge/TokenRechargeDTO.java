package org.acme.dto.recharge;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.Getter;

public class TokenRechargeDTO {

    @JsonbProperty("access_token")
    public String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}

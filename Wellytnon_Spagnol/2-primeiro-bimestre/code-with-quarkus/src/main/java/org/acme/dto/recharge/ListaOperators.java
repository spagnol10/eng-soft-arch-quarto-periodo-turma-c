package org.acme.dto.recharge;

import java.util.List;

public class ListaOperators {

    private List<OperatorDTO> providers;
    private String errorCode;
    private String message;
    private Integer status;

    public List<OperatorDTO> getProviders() {
        return providers;
    }

    public void setProviders(List<OperatorDTO> providers) {
        this.providers = providers;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

package org.acme.dto.recharge;

public class ResponseUpdate {
    private Integer externalNSU;
    private String externalTerminal;
    private String status;

    public Integer getExternalNSU() {
        return externalNSU;
    }

    public void setExternalNSU(Integer externalNSU) {
        this.externalNSU = externalNSU;
    }

    public String getExternalTerminal() {
        return externalTerminal;
    }

    public void setExternalTerminal(String externalTerminal) {
        this.externalTerminal = externalTerminal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

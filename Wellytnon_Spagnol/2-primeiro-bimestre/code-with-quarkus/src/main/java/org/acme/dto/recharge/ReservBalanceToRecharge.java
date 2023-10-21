package org.acme.dto.recharge;

import org.acme.dto.boletos.TopupDataDTO;

public class ReservBalanceToRecharge {
    private String externalTerminal;
    private Integer externalNsu;
    private TopupDataDTO topupData;
    private String cpfCnpj;
    private String signerCode;
    private Integer providerId;
    private PhoneDTO phone;

    public String getExternalTerminal() {
        return externalTerminal;
    }

    public void setExternalTerminal(String externalTerminal) {
        this.externalTerminal = externalTerminal;
    }

    public Integer getExternalNsu() {
        return externalNsu;
    }

    public void setExternalNsu(Integer externalNsu) {
        this.externalNsu = externalNsu;
    }

    public TopupDataDTO getTopupData() {
        return topupData;
    }

    public void setTopupData(TopupDataDTO topupData) {
        this.topupData = topupData;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getSignerCode() {
        return signerCode;
    }

    public void setSignerCode(String signerCode) {
        this.signerCode = signerCode;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public PhoneDTO getPhone() {
        return phone;
    }

    public void setPhone(PhoneDTO phone) {
        this.phone = phone;
    }
}

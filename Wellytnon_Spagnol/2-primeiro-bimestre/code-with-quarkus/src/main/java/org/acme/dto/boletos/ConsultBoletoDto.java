package org.acme.dto.boletos;

import jakarta.json.bind.annotation.JsonbProperty;

public class ConsultBoletoDto {

    @JsonbProperty("barCode")
    private ConsultBoletoDataDTO data;
    @JsonbProperty("billData")
    private ConsultBoletoDataDTO bill;
    private Long transactionIdAuthorize;
    private String cpfCnpj;
    private String dueDate;

    public ConsultBoletoDataDTO getData() {
        return data;
    }

    public void setData(ConsultBoletoDataDTO data) {
        this.data = data;
    }

    public ConsultBoletoDataDTO getBill() {
        return bill;
    }

    public void setBill(ConsultBoletoDataDTO bill) {
        this.bill = bill;
    }

    public Long getTransactionIdAuthorize() {
        return transactionIdAuthorize;
    }

    public void setTransactionIdAuthorize(Long transactionIdAuthorize) {
        this.transactionIdAuthorize = transactionIdAuthorize;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}

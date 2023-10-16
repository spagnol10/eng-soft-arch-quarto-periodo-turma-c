package org.acme.dto.boletos;

public class RegisterData {

    private Boolean allowChangeValue;
    private Double discountValue;
    private String documentPayer;
    private String documentRecipient;
    private String dueDateRegister;
    private String fineValueCalculated;
    private String interestValueCalculated;
    private Double maxValue;
    private Double minValue;
    private Double originalValue;
    private String payDueDate;
    private String payer;
    private String recipient;
    private Double totalUpdated;
    private Double totalWIthAdditional;
    private Double totalWithDiscount;

    public Boolean getAllowChangeValue() {
        return allowChangeValue;
    }

    public void setAllowChangeValue(Boolean allowChangeValue) {
        this.allowChangeValue = allowChangeValue;
    }

    public Double getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(Double discountValue) {
        this.discountValue = discountValue;
    }

    public String getDocumentPayer() {
        return documentPayer;
    }

    public void setDocumentPayer(String documentPayer) {
        this.documentPayer = documentPayer;
    }

    public String getDocumentRecipient() {
        return documentRecipient;
    }

    public void setDocumentRecipient(String documentRecipient) {
        this.documentRecipient = documentRecipient;
    }

    public String getDueDateRegister() {
        return dueDateRegister;
    }

    public void setDueDateRegister(String dueDateRegister) {
        this.dueDateRegister = dueDateRegister;
    }

    public String getFineValueCalculated() {
        return fineValueCalculated;
    }

    public void setFineValueCalculated(String fineValueCalculated) {
        this.fineValueCalculated = fineValueCalculated;
    }

    public String getInterestValueCalculated() {
        return interestValueCalculated;
    }

    public void setInterestValueCalculated(String interestValueCalculated) {
        this.interestValueCalculated = interestValueCalculated;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    public Double getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(Double originalValue) {
        this.originalValue = originalValue;
    }

    public String getPayDueDate() {
        return payDueDate;
    }

    public void setPayDueDate(String payDueDate) {
        this.payDueDate = payDueDate;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public Double getTotalUpdated() {
        return totalUpdated;
    }

    public void setTotalUpdated(Double totalUpdated) {
        this.totalUpdated = totalUpdated;
    }

    public Double getTotalWIthAdditional() {
        return totalWIthAdditional;
    }

    public void setTotalWIthAdditional(Double totalWIthAdditional) {
        this.totalWIthAdditional = totalWIthAdditional;
    }

    public Double getTotalWithDiscount() {
        return totalWithDiscount;
    }

    public void setTotalWithDiscount(Double totalWithDiscount) {
        this.totalWithDiscount = totalWithDiscount;
    }

}

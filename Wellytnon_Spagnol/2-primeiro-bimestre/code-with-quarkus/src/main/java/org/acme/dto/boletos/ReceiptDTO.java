package org.acme.dto.boletos;

public class ReceiptDTO {

    private String receiptData;
    private String receiptFormatted;

    public String getReceiptData() {
        return receiptData;
    }

    public void setReceiptData(String receiptData) {
        this.receiptData = receiptData;
    }

    public String getReceiptFormatted() {
        return receiptFormatted;
    }

    public void setReceiptFormatted(String receiptFormatted) {
        this.receiptFormatted = receiptFormatted;
    }

}

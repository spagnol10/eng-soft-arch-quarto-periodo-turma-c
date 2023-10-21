package org.acme.dto.recharge;

import org.acme.dto.boletos.PaymentAuthDTO;
import org.acme.dto.boletos.ReceiptDTO;

import java.math.BigDecimal;

public class ConsultResponseRechargeDTO {

    private BigDecimal NSUnameProvider;
    private BigDecimal authentication;
    private PaymentAuthDTO authenticationAPI;
    private ReceiptDTO receipt;
    private String settleDate;
    private String createDate;
    private BigDecimal transactionId;
    private String urlreceipt;
    private String errorCode;
    private String message;
    private int status;

    public BigDecimal getNSUnameProvider() {
        return NSUnameProvider;
    }

    public void setNSUnameProvider(BigDecimal NSUnameProvider) {
        this.NSUnameProvider = NSUnameProvider;
    }

    public BigDecimal getAuthentication() {
        return authentication;
    }

    public void setAuthentication(BigDecimal authentication) {
        this.authentication = authentication;
    }

    public PaymentAuthDTO getAuthenticationAPI() {
        return authenticationAPI;
    }

    public void setAuthenticationAPI(PaymentAuthDTO authenticationAPI) {
        this.authenticationAPI = authenticationAPI;
    }

    public ReceiptDTO getReceipt() {
        return receipt;
    }

    public void setReceipt(ReceiptDTO receipt) {
        this.receipt = receipt;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(BigDecimal transactionId) {
        this.transactionId = transactionId;
    }

    public String getUrlreceipt() {
        return urlreceipt;
    }

    public void setUrlreceipt(String urlreceipt) {
        this.urlreceipt = urlreceipt;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

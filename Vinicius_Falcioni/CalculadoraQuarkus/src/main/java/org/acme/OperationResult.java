package org.acme;

public class OperationResult {

    private double result;
    private String message;

    public OperationResult() {
    }

    public OperationResult(double result, String message) {
        this.result = result;
        this.message = message;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

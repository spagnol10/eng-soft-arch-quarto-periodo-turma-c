package org.acme.dto.recharge;

public class ProductDTO {

    private String properties;
    private Integer code;
    private Double cost;
    private String detail;
    private String productName;
    private Integer checkSum;
    private Integer dueProduct;
    private Double valueBonus;
    private Double maxValue;
    private Double minValue;

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(Integer checkSum) {
        this.checkSum = checkSum;
    }

    public Integer getDueProduct() {
        return dueProduct;
    }

    public void setDueProduct(Integer dueProduct) {
        this.dueProduct = dueProduct;
    }

    public Double getValueBonus() {
        return valueBonus;
    }

    public void setValueBonus(Double valueBonus) {
        this.valueBonus = valueBonus;
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
}
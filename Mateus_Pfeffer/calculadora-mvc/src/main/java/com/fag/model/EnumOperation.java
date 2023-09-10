package com.fag.model;

import java.util.Arrays;

public enum EnumOperation implements IEnum<String> {
    ADICAO("ADICAO", "Adição"),
    SUBTRACAO("SUBTRACAO", "Subtração"),
    MULTIPLICACAO("MULTIPLICACAO", "Multiplicação"),
    DIVISAO("DIVISAO", "Divisão");

    private final String key;
    private final String value;

    EnumOperation(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static EnumOperation findByValue(String value) {
        return Arrays.stream(EnumOperation.values())
                .filter(operation -> value.equals(operation.getValue()))
                .findAny()
                .orElse(EnumOperation.ADICAO);
    }

}

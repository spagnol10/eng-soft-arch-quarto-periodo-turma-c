package com.fag.model;

public class operacoes {

    public operacoes() {}

    public static Float getOperacao(Float valor1, Float valor2, Character operacao) {
        if (valor1 == null || valor2 == null || operacao == null) {
            System.out.println("Por favor, preencha todos os campos!");
            return null;
        }
    
        float resultado = 0;
    
        switch (operacao) {
            case '+':
                resultado = valor1 + valor2;
                break;
            case '-':
                resultado = valor1 - valor2;
                break;
            case 'x':
                resultado = valor1 * valor2;
                break;
            case '/':
                if (valor2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                    return null; 
                }
                resultado = valor1 / valor2;
                break;
            default:
                System.out.println("Operação inválida!");
                return null;
        }
    
        return resultado;
    }    
}

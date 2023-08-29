package br.fag.services;
public class Divisao {

    public int operacao(int primeiroValor,  int segundoValor){
        try {
            return primeiroValor / segundoValor;
        }catch (Exception  e){
            System.out.println("ERRO - Valor digitado nao e um numero inteiro!");
        }
        return 0;
    }
}

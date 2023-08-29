package org.acme.model;

public enum EnumUserOption {
  ADICAO("Adição"),
  SUBTRACAO("Subtração"),
  MULTIPLICACAO("Multiplicação"),
  DIVISAO("Divisão");

  private String operacao;

  private EnumUserOption(String operacao){
    this.operacao = operacao;
  }

  public String getValue(){
    return this.operacao;
  }
}

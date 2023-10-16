package br.com.fag.service;

public class CalculatorService {
  public Float calculate(Float primeiro, Float segundo, Integer operation) {
    switch(operation) {
      case 1:
        return primeiro + segundo;

      case 2:
      return primeiro - segundo;

      case 3:
      return primeiro * segundo;

      case 4:
      if(segundo == 0) {
        throw new ArithmeticException("Não pode dividir por zero");
      }
      return primeiro / segundo;
    }

    return 0f;
  }
}

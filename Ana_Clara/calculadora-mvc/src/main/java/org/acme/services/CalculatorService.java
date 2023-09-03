package org.acme.services;

public class CalculatorService {
  
  public float calculate(float valueOne, float valueTwo, int operation) {
    if (operation == 1) {
      return valueOne + valueTwo;
    }
    if (operation == 2) {
      return valueOne - valueTwo;
    }
    if (operation == 3) {
      return valueOne * valueTwo;
    }
    if (operation == 4) {
      return valueOne / valueTwo;
    }
    return 0;
  }
}

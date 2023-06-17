package br.com.nicolas.app.calculator;

import br.com.nicolas.app.calculator.intern.ArithmeticOperations;

public class Calculator {
  private ArithmeticOperations arOps = new ArithmeticOperations();

  public Double sum(Double... nums) {
    return arOps.sum(nums);
  }
}

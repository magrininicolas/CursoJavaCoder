package br.com.nicolas.app.calculation;

import br.com.nicolas.app.Calculator;
import br.com.nicolas.app.calculation.intern.ArithmeticOperations;
import br.com.nicolas.app.logging.Logger;

public class CalculatorImpl implements Calculator {
  private final ArithmeticOperations arOps = new ArithmeticOperations();

  public Double sum(Double... nums) {
    Logger.info("Summing: ");
    return arOps.sum(nums);
  }
}

package br.com.nicolas.app.calculation.intern;

import java.util.Arrays;

public class ArithmeticOperations {

  public Double sum(Double... nums) {
    return Arrays.stream(nums).reduce(0.0, (t, a) -> t + a);
  }
}

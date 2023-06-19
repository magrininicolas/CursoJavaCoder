package br.com.nicolas.app.financial;

import br.com.nicolas.app.Calculator;

import java.util.ServiceLoader;

public class Teste {

  public static void main(String[] args) {

    Calculator calc = ServiceLoader.load(Calculator.class).findFirst().get();

    System.out.println(calc.sum(1.0, 2.0, 3.0, 4.0, 5.0));
  }
}

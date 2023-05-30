package Interfaces_Funcionais;

//Site com interfaces funcionais https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

import java.util.function.BinaryOperator;

public class App {
  public static void main(String[] args) {
    
    BinaryOperator<Double> soma = (x, y) -> { return x + y; };
    BinaryOperator<Double> multiplicar = (x, y) -> x * y;

    System.out.println(soma.apply(2.0, 3.0));
    System.out.println(multiplicar.apply(2.0, 3.0));

    
  }
}

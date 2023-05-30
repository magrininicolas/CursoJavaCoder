package Primeira_Lambda;

public class App {
  public static void main(String[] args) {
    
    Calculo soma = (x, y) -> { return x + y; };
    Calculo multiplicar = (x, y) -> x * y;

    System.out.println(soma.executar(2, 3));
    System.out.println(multiplicar.executar(2, 3));

    
  }
}

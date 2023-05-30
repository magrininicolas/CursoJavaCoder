package Foreach_Funcional;

import java.util.Arrays;
import java.util.List;


public class Foreach {
  public static void main(String[] args) {
    
    List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

    aprovados.forEach(nome -> System.out.println(nome));

    System.out.println("\nMethod Reference");
    aprovados.forEach(System.out::println);

    System.out.println("\nLambda Expression 2");
    aprovados.forEach(nome -> imprime(nome));

    System.out.println("\nMethod Reference 2");
    aprovados.forEach(Foreach::imprime);


  }

  static void imprime(String nome) {
    System.out.println(String.format("Oi meu nome é %s", nome));
  }
}

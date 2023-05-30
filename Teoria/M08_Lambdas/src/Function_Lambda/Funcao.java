package Function_Lambda;

import java.util.function.Function;

public class Funcao {
  public static void main(String[] args) {

    Function<Integer, String> oddsOrEvens = number -> number % 2 == 0 ? "Even" : "Odd";

    Function<String, String> result = value -> "The result is: " + value;

    Function<String, String> excited = value -> value + "!!!";

    String finalResult = oddsOrEvens
        .andThen(result)
        .andThen(excited)
        .apply(32);

    System.out.println(finalResult);

  }
}

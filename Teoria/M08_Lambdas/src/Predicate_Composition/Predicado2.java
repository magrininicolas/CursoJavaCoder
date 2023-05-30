package Predicate_Composition;

import java.util.function.Predicate;

public class Predicado2 {
  public static void main(String[] args) {
    
    Predicate<Integer> isEven = num -> num % 2 == 0;
    Predicate<Integer> isThreeDigits = num -> num >= 100 && num <= 999;

    System.out.println(isEven.and(isThreeDigits).test(122));
    System.out.println(isEven.or(isThreeDigits).test(13));
  }
}

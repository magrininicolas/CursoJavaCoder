package Map;

import java.util.Arrays;
import java.util.List;

public class Map {
  public static void main(String[] args) {

    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    nums.stream()
        .map(Integer::toBinaryString)
        .map(Conversores::reverseString)
        .map(Conversores::toInteger)
        .forEach(System.out::println);
  }
}

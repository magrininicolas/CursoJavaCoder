package Map;

public class Conversores {


  public final static String reverseString(String str) {
    return new StringBuilder(str).reverse().toString();
  }

  public final static int toInteger(String str) {
    return Integer.parseInt(str, 2);
  }

}

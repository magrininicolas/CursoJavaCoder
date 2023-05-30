package Filter2;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Filter2 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("en", "US"));

    Produto p1 = new Produto("Notebook", 2700, 0.3, 0);
    Produto p2 = new Produto("TV 4K", 2000, 0.2, 100);
    Produto p3 = new Produto("Mouse", 450, 0.3, 0);
    Produto p4 = new Produto("Teclado", 600, 0.4, 30);
    Produto p5 = new Produto("Monitor 240HZ", 1500, 0.5, 0);
    Produto p6 = new Produto("iPhone 14 Pro Max", 9000, 0.34, 0);
    Produto p7 = new Produto("Samsung S24 Ultra", 11000, 0.43, 35);

    List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

    produtos.stream()
        .filter(Lambdas.discountSmaller30)
        .filter(Lambdas.freeShipping)
        .filter(Lambdas.importantProduct)
        .map(Lambdas::promotion)
        .forEach(System.out::println);
  }
}

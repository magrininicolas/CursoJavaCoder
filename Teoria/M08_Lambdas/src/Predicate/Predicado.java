package Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicado {
  public static void main(String[] args) {

    Predicate<Product> isExpensive = prod -> (prod.price - prod.price * prod.discount) >= 1000;

    Product product1 = new Product("Notebook", 3893.89, 0.15);
    Product product2 = new Product("PC", 5004.43, 0.2);
    Product product3 = new Product("TV 4K", 5893.89, 0.9);
    Product product4 = new Product("Playstation 5", 4469.99, 0.3);
    Product product5 = new Product("Xbox Series X", 2500.43, 0.85);

    List<Product> products = new ArrayList<>(Arrays.asList(product1, product2, product3, product4, product5));

    products.forEach(prod -> {
      if (isExpensive.test(prod))
        System.out.println(prod);
    });
  }
}

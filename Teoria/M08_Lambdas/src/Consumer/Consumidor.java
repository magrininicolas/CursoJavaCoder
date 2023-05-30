package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import Predicate.Product;

public class Consumidor {
  public static void main(String[] args) {

    Consumer<Product> imprimeNome = p -> System.out.println(p.getName());

    Product p1 = new Product("Caneta", 12.34, 0.09);
    Product p2 = new Product("Notebook", 2987.99, 0.25);
    Product p3 = new Product("Caderno", 19.9, 0.03);
    Product p4 = new Product("Borracha", 7.8, 0.18);
    Product p5 = new Product("Lápis", 4.39, 0.19);

    List<Product> produtos = Arrays.asList(p1, p2, p3, p4, p5);

    produtos.forEach(imprimeNome);

    produtos.forEach(System.out::println);

  }

}

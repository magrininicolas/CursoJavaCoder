package classe;

public class ProdutoTeste {

  public static void main(String[] args) {
    Produto p1 = new Produto("Notebook", 4356.89);
    Produto p2 = new Produto("Mouse Logitech", 249.99);

    System.out.println(p1.name);
    System.out.printf("Price with discount: R$%.2f\n", p1.totalPrice());

    System.out.println(p2.name);
    System.out.printf("Price with discount: R$%.2f\n", p2.totalPrice());

  }
}

package Desafio_Composicao;

public class ClienteTeste {
  public static void main(String[] args) {

    Cliente c1 = new Cliente("Nicolas");

    Compra co1 = new Compra();
    co1.addItem(8, 4.5, "Cerveja Original 350ml");
    co1.addItem(4, 2.5, "Chocolate Snickers");

    Compra co2 = new Compra();
    co2.addItem(4, 3, "Caneta Bic");
    co2.addItem(2, 10.9, "Lapiseira");

    c1.addCompra(co1);
    c1.addCompra(co2);

    String valorTotal = String.format("Olá, senhor(a) %s. Valor total da compra: %.2f", c1.name, c1.getTotalValue());
    System.out.println(valorTotal);
  }
}

package Composicao.Um_pra_Muitos;

public class CompraTeste{
  public static void main(String[] args) {
    
    Compra c1 = new Compra();
    c1.cliente = "Nicolas Gustavo";

    c1.addItem(new Item("Caneta", 20, 7.45));
    c1.addItem(new Item("Borracha", 12, 3.89));
    c1.addItem(new Item("Caderno", 3, 18.8));

    System.out.println(c1.getTotalValue());
  }
}

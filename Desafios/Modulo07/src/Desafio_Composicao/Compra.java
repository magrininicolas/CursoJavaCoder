package Desafio_Composicao;

import java.util.ArrayList;

public class Compra {

  ArrayList<Item> itens = new ArrayList<>();

  double getValue() {
    double total = 0;

    for (Item item : itens) {
      total += item.product.price * item.quantity;
    }

    return total;
  }

  void addItem(int quantity, double price, String name) {
    itens.add(new Item(quantity, new Produto(price, name)));
  }

  void remove(Item item) {
    itens.remove(item);
  }
}

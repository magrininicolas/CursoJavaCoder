package Composicao.Um_pra_Muitos;

import java.util.ArrayList;

public class Compra {
 
  String cliente;
  ArrayList<Item> itens = new ArrayList<>();

  double getTotalValue() {
    double total = 0;

    for(Item item: itens) {
      total += item.quantidade * item.preco;
    }

    return total;
  }

  void addItem(Item item) {
    itens.add(item);
  }
}

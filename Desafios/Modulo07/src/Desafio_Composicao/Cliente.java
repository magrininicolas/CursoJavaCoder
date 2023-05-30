package Desafio_Composicao;

import java.util.ArrayList;

public class Cliente {

  String name;
  ArrayList<Compra> compras = new ArrayList<>();

  Cliente(String name) {
    this.name = name;
  }

  double getTotalValue() {
    double totalValue = 0;

    for (Compra compra : compras) {
      totalValue += compra.getValue();
    }

    return totalValue;
  }

  void addCompra(Compra compra) {
    compras.add(compra);
  }

  void removeCompra(Compra compra) {
    compras.remove(compra);
  }
}

package classe;

public class Produto {

  String name;
  double price;
  static double discount = 0.25;

  Produto() {
  }

  Produto(String name, double price) {
    this.name = name;
    this.price = price;
  }

  double totalPrice() {
    return price -= price * discount;
  }

}

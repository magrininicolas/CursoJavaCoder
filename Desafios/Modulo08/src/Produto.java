public class Produto {

  private String name;
  private double price;
  private double discount;

  public Produto(String name, double price, double discount) {
    this.name = name;
    this.price = price;
    this.discount = discount;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public double getDiscount() {
    return discount;
  }
}
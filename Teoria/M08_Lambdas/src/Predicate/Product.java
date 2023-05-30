package Predicate;

public class Product{
  
  public final String name;
  public final double price;
  public final double discount;
  
  public Product(String name, double price, double discount) {
    this.name = name;
    this.price = price;
    this.discount = discount;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price - price * discount;
  }

  public double getDiscount() {
    return discount;
  }

  @Override
  public String toString() {
    return String.format("Name: %s. Price: %.2f", getName(), getPrice());
  }
}

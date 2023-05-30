package Filter2;

public class Produto{
  
  private String name;
  private double price;
  private double discount;
  private double shippingRate;
  
  public Produto(String name, double price, double discount, double shippingRate) {
    this.name = name;
    this.price = price;
    this.discount = discount;
    this.shippingRate = shippingRate;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price - price * getDiscount();
  }

  public double getDiscount() {
    return discount;
  }

  public double getShippingRate() {
    return shippingRate;
  }

  public void setName(String name) {
    if(name != null) this.name = name;
  }

  public void setDiscount(double discount) {
    if(discount <= 1.0) this.discount = discount;
  }

  public void setShippingRate(double shippingRate) {
    if(shippingRate >= 0) this.shippingRate = shippingRate;
  }
}

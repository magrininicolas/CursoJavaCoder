package Reduce;

public class Media {

  private double total;
  private int quantity;

  public void add(double value) {
    total += value;
    quantity++;
  }

  public double calculaMedia() {
    return total / quantity;
  }

  public static Media combine(Media m1, Media m2) {
    Media result = new Media();
    result.total = m1.total + m2.total;
    result.quantity = m1.quantity + m2.quantity;
    return result;
  }
}

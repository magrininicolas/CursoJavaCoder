package Filter2;

import java.util.function.Predicate;

public class Lambdas {

  private Lambdas() {
  }

  static public Predicate<Produto> discountSmaller30 = prod -> prod.getDiscount() >= 0.3;

  static public Predicate<Produto> freeShipping = prod -> prod.getShippingRate() == 0;

  static public Predicate<Produto> importantProduct = prod -> prod.getPrice() >= 500;

  static public String promotion(Produto p) {
    String str = String.format("PROMOTION: %s for only %.2f. FREE SHIPPING.", p.getName(), p.getPrice());
    return str;
  }
}

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class App {
  public static void main(String[] args) {

    Produto p = new Produto("iPad", 3235.89, 0.13);

    /*
     * Function<Produto, Double> precoFinal = prod -> prod.getPrice() -
     * prod.getPrice() * prod.getDiscount();
     * Function<Double, Double> tipoImposto = price -> {
     * double precoImposto = price >= 2500 ? 0.085 : 0.0;
     * price += price * precoImposto;
     * return price;
     * };
     * Function<Double, Double> tipoFrete = price -> {
     * double precoFrete = price >= 3000 ? 100.00 : 50.00;
     * price += precoFrete;
     * return price;
     * };
     * Function<Double, String> formataPreco = price -> (String.format("R$%.2f",
     * price)).replace(".", ",");
     * 
     * System.out.println(precoFinal
     * .andThen(tipoImposto)
     * .andThen(tipoFrete)
     * .andThen(formataPreco)
     * .apply(p));
     * }
     */

    //// OU ////

    Function<Produto, Double> precoFinal = prod -> prod.getPrice() - prod.getPrice() * prod.getDiscount();
    UnaryOperator<Double> imposto = price -> price >= 2500 ? price * 1.085 : price;
    UnaryOperator<Double> frete = price -> price >= 3000 ? price + 100 : price + 50;
    Function<Double, String> formataPreco = price -> (String.format("R$%.2f", price))
        .replace(".", ",");

    System.out.println(precoFinal
        .andThen(imposto)
        .andThen(frete)
        .andThen(formataPreco)
        .apply(p));
  }
}
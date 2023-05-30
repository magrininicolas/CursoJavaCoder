public class App {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    final double FTOCSUB = 32;
    final double FTOCDIV = 5/9.0;
    double fahrenheit = Double.parseDouble(s.nextLine());
    double celsius = (fahrenheit - FTOCSUB) * FTOCDIV;
    Double.toString(celsius);
    System.out.println(String.format("%.2f", celsius));
    s.close();
  }
}

package circunferencia;

public class AreaCirc {
  double raio;
  static final double PI = 3.14159;

  AreaCirc(double raio) {
    this.raio = raio;
  }

  static double area(double raio) {
    return Math.pow(raio, 2) * PI;
  }
}

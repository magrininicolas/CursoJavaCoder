public class ValorVSReferencia {
  public static void main(String[] args) throws Exception {

    double a = 2;
    double b = a;

    a++;
    b--;

    System.out.printf("%.2f | %.2f\n", a, b);

    Data d1 = new Data();
    Data d2 = d1;
    d1.day = 31;
    d2.month = 12;
    d1.year = 2023;
    System.out.println(d1.obterDataFormatada());
    System.out.println(d2.obterDataFormatada());

    voltarDataParaValorPadrao(d1);
    System.out.println(d1.obterDataFormatada());
    System.out.println(d2.obterDataFormatada());
  }

  static void voltarDataParaValorPadrao(Data d) {
    d.day = 1;
    d.month = 1;
    d.year = 1970;
  }
}

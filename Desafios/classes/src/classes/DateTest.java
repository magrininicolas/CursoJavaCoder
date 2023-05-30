package classes;

public class DateTest {

  public static void main(String[] args) {
    Date date1 = new Date();
    Date date2 = new Date(05, 04, 2023);

    System.out.println();
    System.out.println(date1.obterDataFormatada());
    System.out.println(date2.obterDataFormatada());
  }
}

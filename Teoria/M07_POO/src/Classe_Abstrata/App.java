package Classe_Abstrata;

public class App {
  public static void main(String[] args) {

    Ave a = new Calopsita();

    System.out.println(a.mover());
    System.out.println(a.respirar());
    System.out.println(a.alimentacao());
  }
}

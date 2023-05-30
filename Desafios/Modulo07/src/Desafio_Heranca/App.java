package Desafio_Heranca;

import Desafio_Heranca.Classes.Subaru;
import Desafio_Heranca.Classes.Toyota;

public class App {
  public static void main(String[] args) {
    
    Subaru subaru = new Subaru();
    subaru.ligar();
    subaru.acelerar();
    subaru.acelerar();
    subaru.acelerar();
    System.out.println(subaru);

    Toyota toyota = new Toyota();
    toyota.ligar();
    System.out.println(toyota);
    toyota.ligarTurbo();
    toyota.acelerar();
    toyota.desligarTurbo();
    toyota.acelerar();
    System.out.println(toyota);
  }
}

package testes.teste_inheritance;

import infra.DAO;
import modelo.inheritance.Car;
import modelo.inheritance.Subaru;
import modelo.inheritance.Toyota;

public class NewCar {
  public static void main(String[] args) {
    
    DAO<Car> dao = new DAO<>();

    Subaru subaru = new Subaru("Impreza", 1998, 55000.0, "2.0", "Navy Blue");
    
    Toyota toyota = new Toyota("Corolla", 1986, 120000.0, "1.6 20V", "Right");

    dao.openTransaction().include(subaru).closeTransaction();
  }
}

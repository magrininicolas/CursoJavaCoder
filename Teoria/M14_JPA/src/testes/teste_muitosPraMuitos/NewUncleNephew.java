package testes.teste_muitosPraMuitos;

import infra.DAO;
import modelo.muitosPraMuitos.Nephew;
import modelo.muitosPraMuitos.Uncle;

public class NewUncleNephew {
  public static void main(String[] args) {
    
    Uncle uncle1 = new Uncle("João");
    Uncle uncle2 = new Uncle("Roberto");

    Nephew nephew1 = new Nephew("Renato");
    Nephew nephew2 = new Nephew("Davi");

    uncle1.getNephews().add(nephew1);
    nephew1.getUncles().add(uncle1);
    uncle1.getNephews().add(nephew2);
    nephew2.getUncles().add(uncle1);

    uncle2.getNephews().add(nephew1);
    nephew1.getUncles().add(uncle2);
    uncle2.getNephews().add(nephew2);
    nephew2.getUncles().add(uncle2);

    DAO<Uncle> daoUncle = new DAO<>(Uncle.class);
    DAO<Nephew> daoNephew = new DAO<>(Nephew.class);

    daoNephew.openTransaction().include(nephew1).include(nephew2).closeTransaction();
    daoUncle.openTransaction().include(uncle1).include(uncle2).closeTransaction();

    daoNephew.close();
    daoUncle.close();
  }
}

package testes.teste_umPraMuitos;

import infra.DAO;
import modelo.umPraMuitos.OrderItens;
import modelo.umPraMuitos.OrderTable;

public class GetOrder {
  public static void main(String[] args) {
    DAO<OrderTable> dao = new DAO<>(OrderTable.class);

    OrderTable order = dao.getByID(1L);

    for (OrderItens item : order.getItens()) {
      System.out.println(item.getQuantity());
    }

    dao.close();
  }
}

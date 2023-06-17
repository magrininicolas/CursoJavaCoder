package testes.teste_umPraMuitos;

import infra.DAO;
import modelo.basico.Product;
import modelo.umPraMuitos.OrderTable;
import modelo.umPraMuitos.OrderItens;

public class NewOrder {
  
  public static void main(String[] args) {
    
    DAO<OrderItens> daoOrderItens = new DAO<>(OrderItens.class);
    DAO<OrderTable> daoOrder = new DAO<>(OrderTable.class);
    DAO<Product> daoProduct = new DAO<>(Product.class);

    OrderTable order = new OrderTable();
    Product product = new Product("Geladeira", 2789.99);
    OrderItens item = new OrderItens(order, product, 10);

    daoOrder.openTransaction().include(order).closeTransaction();
    daoProduct.openTransaction().include(product).closeTransaction();
    daoOrderItens.openTransaction().include(item).closeTransaction().close();

  }
}

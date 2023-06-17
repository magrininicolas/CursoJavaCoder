package testes.testes_Product;

import infra.DAO;
import modelo.basico.Product;

public class NewProduct {
    public static void main(String[] args) {

        DAO<Product> dao = new DAO<>(Product.class);

        Product product = new Product("Monitor 23'", 799.99);

        dao.openTransaction().include(product).closeTransaction().close();

    }
}

package testes.testes_Product;

import java.util.List;
import java.util.function.BinaryOperator;

import infra.DAO;
import modelo.basico.Product;

public class GetProducts {
    public static void main(String[] args) {

        DAO<Product> dao = new DAO<>(Product.class);
        List<Product> products = dao.obtainAll();

        for (Product product : products) {
            System.out.println("ID: " + product.getId() + " - Name: " + product.getName());
        }

        BinaryOperator<Double> soma = (t, p) -> t + p;

        double totalPrice = products.stream()
                .map(p -> p.getPrice())
                .reduce(0.0, soma);

        System.out.println("O valor total é R$" + String.format("%.2f", totalPrice));

        dao.close();
    }
}

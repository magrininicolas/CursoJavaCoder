package modelo.umPraMuitos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import modelo.basico.Product;

@Entity
@Table(name = "order_itens")
public class OrderItens {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  private OrderTable order;

  @ManyToOne
  private Product product;

  @Column(nullable = false)
  private Integer quantity;
  
  @Column(nullable = false)
  private Double price;

  public OrderItens() {
  }

  public OrderItens(OrderTable order, Product product, Integer quantity) {
    this.setOrder(order);
    this.setProduct(product);
    this.setQuantity(quantity);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderTable getOrder() {
    return order;
  }

  public void setOrder(OrderTable order) {
    this.order = order;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;

    if(product != null && this.price == null) {
      this.setPrice(product.getPrice());
    }
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  


}

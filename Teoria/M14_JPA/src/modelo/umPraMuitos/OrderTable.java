package modelo.umPraMuitos;


import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "orders")
public class OrderTable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long id;

  @OneToMany(mappedBy = "order")
  private List<OrderItens> itens;
  
  @Column(nullable = false)
  private Instant date;

  public OrderTable() {
    this.date = Instant.now();
  }
  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Instant getDate() {
    return date;
  }

  public void setDate(Instant date) {
    this.date = date;
  }
  
  public List<OrderItens> getItens() {
    return itens;
  }

  public void setItens(List<OrderItens> itens) {
    this.itens = itens;
  }

}



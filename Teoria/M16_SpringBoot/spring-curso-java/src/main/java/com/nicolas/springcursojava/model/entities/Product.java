package com.nicolas.springcursojava.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "products")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_id")
  private int id;

  @NotBlank
  @Column(name = "product_name")
  private String name;

  @Min(0)
  @Column(name = "product_price")
  private Double price;

  @Min(0)
  @Max(1)
  @Column(name = "product_discount")
  private Double discountPerc;

  public Product() {
  }

  public Product(String name, Double price, Double discountPerc) {
    this.name = name;
    this.price = price;
    this.discountPerc = discountPerc;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Double getDiscountPerc() {
    return discountPerc;
  }

  public void setDiscountPerc(Double discountPerc) {
    this.discountPerc = discountPerc;
  }

}

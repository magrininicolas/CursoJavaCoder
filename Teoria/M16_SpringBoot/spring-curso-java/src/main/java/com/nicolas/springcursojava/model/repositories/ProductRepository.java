package com.nicolas.springcursojava.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nicolas.springcursojava.model.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

  public Iterable<Product> findByNameContainingIgnoreCase(String namePart);
}

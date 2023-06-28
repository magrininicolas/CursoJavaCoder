package com.nicolas.springcursojava.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nicolas.springcursojava.model.entities.Product;

public interface PagingProductRepository extends PagingAndSortingRepository<Product, Integer> {
  
}

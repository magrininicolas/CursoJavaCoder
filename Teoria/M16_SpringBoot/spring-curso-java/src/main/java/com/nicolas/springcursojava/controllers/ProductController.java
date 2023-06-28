package com.nicolas.springcursojava.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nicolas.springcursojava.model.entities.Product;
import com.nicolas.springcursojava.model.repositories.PagingProductRepository;
import com.nicolas.springcursojava.model.repositories.ProductRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @Autowired
  private PagingProductRepository pagingProductRepository;

  @RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
  public Product saveProduct(@Valid Product product) {
    productRepository.save(product);
    return product;
  }

  @GetMapping("/all")
  public Iterable<Product> getAllProducts() {
    return productRepository.findAll();
  }
  
  @GetMapping("/name")
  public Iterable<Product> getProductsByName(@RequestParam String namePart) {
    return productRepository.findByNameContainingIgnoreCase(namePart);
  }

  @GetMapping("/page/{pageNumber}/{qntProd}")
  public Iterable<Product> getProductsByPage(@PathVariable Integer pageNumber, @PathVariable Integer qntProd) {
    if (qntProd >= 5){
      qntProd = 5;
    }
    Pageable page = PageRequest.of(pageNumber, qntProd);
    return pagingProductRepository.findAll(page);
  }

  @GetMapping
  public Optional<Product> getProductById(@RequestParam(name = "id") Integer id) {
    return productRepository.findById(id);
  }

  @DeleteMapping()
  public void deleteProductById(@RequestParam(name = "id") Integer id) {
    productRepository.deleteById(id);
  }

}

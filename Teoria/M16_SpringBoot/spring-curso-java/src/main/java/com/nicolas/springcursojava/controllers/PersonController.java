package com.nicolas.springcursojava.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nicolas.springcursojava.model.entities.Address;
import com.nicolas.springcursojava.model.entities.Person;

@RestController
@RequestMapping("/person")
public class PersonController {

  List<String> children = List.of("Cássio", "Rafaela", "Renato Augusto");
  
  @GetMapping("/nicolas")
  public Person getPerson() {
    return new Person("Nicolas", LocalDate.of(2002, 12, 27), true, new Address("Av. Padre Jaime", 2185), children);
  }
}

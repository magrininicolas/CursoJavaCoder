package com.nicolas.springcursojava.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nicolas.springcursojava.models.Client;

@RestController
@RequestMapping("/clients")
public class ClientController {
  
  @GetMapping("/any")
  public Client getClient(){
    return new Client(27L, "Nicolas", "471.598.668-00");
  }

  @GetMapping("/{id}")
  public Client getClientById(@PathVariable Long id){
    return new Client(id, "Rodson", "158.386.268-44");
  }

  @GetMapping
  public Client getClientByIdSecurity(@RequestParam(name = "id") Long id) {
    return new Client(id, "Luzia", "225.902.248-00");
  }
}
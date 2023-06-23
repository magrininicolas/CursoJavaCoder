package com.nicolas.springcursojava.models;

import java.time.LocalDate;
import java.util.List;

public class Person {
  
  private String name;
  private LocalDate birthDate;
  private Boolean vip;
  private Address address;
  private List<String> children;
  

  public Person(String name, LocalDate birthDate, Boolean vip, Address address, List<String> children) {
    this.name = name;
    this.birthDate = birthDate;
    this.vip = vip;
    this.address = address;
    this.children = children;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public Boolean getVip() {
    return vip;
  }

  public void setVip(Boolean vip) {
    this.vip = vip;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public List<String> getChildren() {
    return children;
  }

  public void setChildren(List<String> children) {
    this.children = children;
  }
  
}

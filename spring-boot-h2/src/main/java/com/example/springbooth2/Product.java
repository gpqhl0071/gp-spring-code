package com.example.springbooth2;

import javax.persistence.Entity;

@Entity
public class Product {
  @javax.persistence.Id
  private String Id;
  private String name;
}

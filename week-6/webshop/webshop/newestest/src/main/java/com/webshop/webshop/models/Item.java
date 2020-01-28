package com.webshop.webshop.models;

public class Item {
  private String name;
  private String description;
  private Integer price;
  private int stock;
  private String type;

  public Item(String name, String description, int price, int stock, String type){
    this.name = name;
    this.description = description;
    this.price = price;
    this.stock = stock;
    this.type = type;
  }

  public Item(){
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}

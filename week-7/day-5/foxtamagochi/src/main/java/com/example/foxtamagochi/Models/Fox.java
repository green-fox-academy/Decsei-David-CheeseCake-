package com.example.foxtamagochi.Models;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fox {

  private String name;
  private List<String> tricks;
  private String food;
  private String drink;
  private boolean isLoggedIn;

  // Create a fox with given parameters
  public Fox(String name, String food, String drink) {
    this.tricks = new ArrayList<>();
    this.isLoggedIn = false;
    this.name = name;
    this.food = food;
    this.drink = drink;
    //For testing data
    this.tricks.add("Nothing");
    this.tricks.add("Nothing");
    this.tricks.add("Nothing");
  }
}

package com.example.foxtamagochi.Repository;

import com.example.foxtamagochi.Models.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ListOfFoxes {

  private List<Fox> listOfFoxes;

  public ListOfFoxes() {
    this.listOfFoxes = new ArrayList<>();

    this.listOfFoxes.add(new Fox("Sanyi", "pizza", "cola"));
    this.listOfFoxes.add(new Fox("Béla", "pizza", "cola"));
    this.listOfFoxes.add(new Fox("Peti", "kaki", "cola"));
  }

  //If theres a match with given name return the fox from the list if not return null
  public Fox findFoxWithName(String name) {
      return listOfFoxes
          .stream()
          .filter(fox -> fox.getName().equals(name))
          .findFirst()
          .orElse(null);
  }

  //If theres a match with given name return the fox from the list if not return null
  public Fox findFoxWithLoginState() {
    if (anyLoggedIn()) {
      return listOfFoxes.stream().filter(Fox::isLoggedIn).findFirst().get();
    }
    return null;
  }

  //Sets selected fox loggedIn state to true
  public void logInFox(String name) {
    listOfFoxes.stream().filter(fox -> fox.getName().equals(name)).findFirst().get()
        .setLoggedIn(true);
  }

  //Checks if any of the foxes are logged in
  public boolean anyLoggedIn(){
    return listOfFoxes.stream().anyMatch(Fox::isLoggedIn);
  }

}

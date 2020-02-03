package com.example.foxtamagochi.Interfaces;

import com.example.foxtamagochi.Repository.ActionHistory;
import com.example.foxtamagochi.Models.Fox;
import com.example.foxtamagochi.Repository.ListOfFoxes;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginInterfaceImplementation implements LoginInterface {

  ListOfFoxes listOfFoxes;
  ActionHistory actionHistory;
  boolean loggedIn;

  //initialize the list and the set isLoggedIn state to false in constructor
  @Autowired
  public LoginInterfaceImplementation(ListOfFoxes listOfFoxes, ActionHistory actionHistory) {
    this.listOfFoxes = listOfFoxes;
    this.actionHistory = actionHistory;
    this.loggedIn = false;
  }

  //returns true if the name is empty and false if its not <- for login check
  @Override
  public boolean nameIsEmpty(String name) {
    return name.equals("");
  }

  // Returns the fox object from the list based on name
  @Override
  public Fox returnTheFox(String name) {
    return listOfFoxes.findFoxWithName(name);
  }

  // Returns the fox object from the list based on login state
  @Override
  public Fox returnTheFoxWithLoginState() {
    return listOfFoxes.findFoxWithLoginState();
  }

  @Override
  public List<String> returnActionHistoryList() {
    if (actionHistory.returnTheList().size() <= 0) {
      actionHistory.returnTheList().add("No actions so far.");
      return actionHistory.returnTheList();
    }
    return actionHistory.returnTheList();
  }

  //Set loggedIn state to true when correct fox name is given
  @Override
  public void logIn(String name) {
    listOfFoxes.logInFox(name);
  }

  //Check if any of the foxes is logged in
  @Override
  public boolean anyLoggedIn(){
    return listOfFoxes.anyLoggedIn();
  }
}

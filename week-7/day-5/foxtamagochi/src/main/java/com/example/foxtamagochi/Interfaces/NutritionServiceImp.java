package com.example.foxtamagochi.Interfaces;

import com.example.foxtamagochi.Repository.ListOfFoxes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NutritionServiceImp implements NutritionService {

  ListOfFoxes listOfFoxes;

  @Autowired
  public NutritionServiceImp(ListOfFoxes listOfFoxes){
    this.listOfFoxes = listOfFoxes;
  }

  //Modify the food and drink on the selected fox
  @Override
  public void modifyFoodAndDrink(String name, String food, String drink) {
    if (!food.equals("") && !drink.equals("")) {
      listOfFoxes.findFoxWithName(name).setFood(food);
      listOfFoxes.findFoxWithName(name).setFood(drink);
    } else if (!food.equals("")) {
      listOfFoxes.findFoxWithName(name).setFood(food);
    } else if (!drink.equals("")) {
      listOfFoxes.findFoxWithName(name).setDrink(drink);
    }
  }
}

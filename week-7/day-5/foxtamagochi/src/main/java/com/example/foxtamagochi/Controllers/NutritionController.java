package com.example.foxtamagochi.Controllers;

import com.example.foxtamagochi.Interfaces.LoginInterface;
import com.example.foxtamagochi.Interfaces.NutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NutritionController {

  // inject the interface which handles the login
  NutritionService nutritionService;
  LoginInterface loginInterface;

  @Autowired
  public NutritionController(NutritionService nutritionService, LoginInterface loginInterface) {
    this.nutritionService = nutritionService;
    this.loginInterface = loginInterface;
  }

  @PostMapping(value = "/nutritionStore")
  public String changeFoodOrDrink(@RequestParam String name,
      @RequestParam(required = false) String food, @RequestParam(required = false) String drink) {
    nutritionService.modifyFoodAndDrink(name, food, drink);
    loginInterface.returnActionHistoryList().add("Changed the food/drink.");
    return "redirect:/your_fox?name=" + name;
  }
}

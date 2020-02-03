package com.example.foxtamagochi.Controllers;

import com.example.foxtamagochi.Interfaces.LoginInterface;
import com.example.foxtamagochi.Interfaces.TrickListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TricksController {

  TrickListService trickListService;
  LoginInterface loginInterface;

  @Autowired
  public TricksController(TrickListService trickListService, LoginInterface loginInterface){
    this.trickListService = trickListService;
    this.loginInterface = loginInterface;
  }

  @PostMapping(value = "/add_new_trick")
  public String addNewTrick(@RequestParam String name,
      @RequestParam(required = false) String trick) {
    trickListService.addNewTrick(name, trick);
    loginInterface.returnActionHistoryList().add("Added new trick: " + trick);
    return "redirect:/your_fox?name=" + name;
  }

  @PostMapping(value = "/remove_trick")
  public String removeTrick(@RequestParam String name,
      @RequestParam(required = false) String trick) {
    trickListService.removeTrick(name, trick);
    loginInterface.returnActionHistoryList().add("Removed the trick: " + trick);
    return "redirect:/your_fox?name=" + name;
  }

}

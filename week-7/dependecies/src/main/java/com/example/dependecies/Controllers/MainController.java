package com.example.dependecies.Controllers;

import com.example.dependecies.Interfaces.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MainController {
  UtilityService utilityService;

  public MainController(UtilityService utilityService){
    this.utilityService = utilityService;
  }

  @GetMapping(value="/index")
  public String index(){
    return "/index";
  }

  @GetMapping(value="/useful/colored")
  public String randomColor(Model model){
    model.addAttribute("model",utilityService.randomColor());
    return "index";
  }

  @GetMapping(value="/caesar")
  public String caesar(){
    return "/index";
  }



}

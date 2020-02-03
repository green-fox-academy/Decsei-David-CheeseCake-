package com.example.foxtamagochi.Controllers;

import com.example.foxtamagochi.Interfaces.LoginInterface;
import com.example.foxtamagochi.Interfaces.LoginInterfaceImplementation;
import com.example.foxtamagochi.Models.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

  // inject the interface which handles the login
  LoginInterface loginInterface;

  public MainController(LoginInterface loginInterface) {
    this.loginInterface = loginInterface;
  }

  // This renders the login page to log in to your pet when /login is called
  @GetMapping(value = "login")
  public String loginController() {
    return "login";
  }

  // This handling the login when the pet name was given on the login page
  // and redirects the fox name to the /your_fox handler
  @PostMapping(value = "login")
  public String loginController(@RequestParam String name) {
    if (!loginInterface.nameIsEmpty(name)) {
      loginInterface.logIn(name);
      return "redirect:/your_fox?name=" + name;
    }
    return "login";
  }

  // This wont let the user to enter on index directly
  // but lets him return to his fox which is logged in
  @GetMapping(value = "")
  public String wontLetToIndexIfWithoutLogin(Model model) {
    if (loginInterface.anyLoggedIn()) {
      model.addAttribute("foxFromList", loginInterface.returnTheFoxWithLoginState());
      model.addAttribute("actionHistory", loginInterface.returnActionHistoryList());
      return "index";
    }
    return "login";
  }

  // Render the index with the selected fox from list but redirects any attempt to
  // log in to another fox without login screen
  @GetMapping(value = "/your_fox")
  public String ShowIndexWithSelectedFox(@RequestParam (required = false) String name, Model model) {
    if (name == null || name.equals("") || !loginInterface.returnTheFox(name).isLoggedIn()) {
      return "login";
    }
    model.addAttribute("foxFromList", loginInterface.returnTheFox(name));
    model.addAttribute("actionHistory", loginInterface.returnActionHistoryList());
    return "index";

  }
}

package com.webshop.webshop.controllers;

import com.webshop.webshop.models.Item;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebshopController {

  List<Item> itemList = new ArrayList<>();

  public WebshopController() {
    itemList.add(new Item("Male shirt", "A normal male T-shirt.", 2500, 10, "Shirt"));
    itemList.add(new Item("Female shirt", "A normal female T-shirt.", 5000, 20, "Shirt"));
    itemList.add(new Item("Nike shoe", "A legit Nike shoe.", 10000, 5, "Shoes"));
    itemList.add(new Item("Tyv shoe", "Your everyday cheap shoe.", 6000, 50, "Shoes"));
    itemList.add(new Item("Elegant hat", "No one wears this anymore.", 15000, 3, "Hat"));
    itemList.add(new Item("iBag", "Just a tesco bag with an apple on it.", 200000, 1, "Trash"));
  }

  @GetMapping(value = "/webshop")
  public String returnWebshop(Model model) {
    model.addAttribute("itemList", itemList);
    return "webshop";
  }

  @GetMapping(value = "/only-available")
  public String returnOnlyAvailable(Model model) {
    model.addAttribute("itemList", itemList.stream().filter(item -> item.getStock() > 0).collect(
        Collectors.toList()));
    return "webshop";
  }

  @GetMapping(value = "/cheapest-first")
  public String returnCheapestFirst(Model model) {
    model.addAttribute("itemList",
        itemList.stream().sorted((item1, item2) -> item1.getPrice().compareTo(item2.getPrice()))
            .collect(Collectors.toList()));
    return "webshop";
  }

  @GetMapping(value = "/only-nike")
  public String returnOnlyNike(Model model) {
    model.addAttribute("itemList",
        itemList.stream().filter(
            item -> item.getName().contains("nike") || item.getDescription().contains("nike"))
            .collect(Collectors.toList()));
    return "webshop";
  }

  @GetMapping(value = "/averageStock")
  public String returnAverageStock(Model model) {
    OptionalDouble averageStockFromList = itemList.stream().mapToInt(Item::getStock).average();
    if (averageStockFromList.isPresent()) {
      Double average = averageStockFromList.getAsDouble();
      model.addAttribute("average", average);
      return "average";
    }
    return "redirect:/";
  }

  @GetMapping(value = "/most-expensive")
  public String returnMostExpensive(Model model) {
    Optional<Item> item = itemList.stream().min((item1, item2) -> item2.getPrice().compareTo(item1.getPrice()));
    if (item.isPresent()) {
      Item newitem = item.get();
      model.addAttribute("mostExpensiveOne", newitem);
      return "mostexpensive";
    }
    return "redirect:/";
  }

  @PostMapping(value = "/search")
  public String returnSearch(Model model, @RequestParam String search) {
    model.addAttribute(itemList.stream().filter(item -> item.getDescription().contains(search)).collect(Collectors.toList()));
      return "webshop";
    }

  @GetMapping(value = "/typeFiltered")
  public String filterByType(Model model) {
    model.addAttribute(itemList.stream().sorted(Comparator.comparing(Item::getType)).collect(Collectors.toList()));
    return "webshop";
  }

  @GetMapping(value = "/priceFiltered")
  public String filterByPrice(Model model) {
    model.addAttribute(itemList.stream().sorted(Comparator.comparing(Item::getPrice)).collect(Collectors.toList()));
    return "webshop";
  }

}

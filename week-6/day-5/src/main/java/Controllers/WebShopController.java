package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebShopController {

  @GetMapping(value="/webshop")
  public String returnWebshop(){
    return "webshop";
  }

}

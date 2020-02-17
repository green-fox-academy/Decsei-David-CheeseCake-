package com.example.week9day1.Contorllers;

import com.example.week9day1.Domain.Appended;
import com.example.week9day1.Domain.ArrayHandlerCalc;
import com.example.week9day1.Domain.ArrayHandlerinput;
import com.example.week9day1.Domain.DoIt;
import com.example.week9day1.Domain.Greeter;
import com.example.week9day1.Domain.JsonUntil;
import com.example.week9day1.Domain.NumberToDouble;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @GetMapping(value = "/")
  public String index() {
    return "index";
  }

  @GetMapping(value = "/doubling")
  @ResponseBody
  public NumberToDouble doubling(@RequestParam(required = false) Integer input) {
    NumberToDouble newInput = new NumberToDouble(input);
    return newInput;
  }

  @GetMapping(value = "/greeter")
  @ResponseBody
  public ResponseEntity<Greeter> greeter(@RequestParam(required = false) String name,
      @RequestParam(required = false) String title) {
    Greeter newGreet = new Greeter(name, title);
    assert HttpStatus.resolve(newGreet.getStatusCode()) != null;
    return new ResponseEntity<>(newGreet, HttpStatus.resolve(newGreet.getStatusCode()));
  }

  @GetMapping(value = "/appenda/{appendable}")
  @ResponseBody
  public ResponseEntity<Appended> append(@PathVariable(required = false) String appendable) {
    if (appendable == null || appendable.isEmpty()) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Appended appended = new Appended(appendable);
    return new ResponseEntity<>(appended, HttpStatus.OK);
  }

  @PostMapping(value = "/dountil/{action}")
  @ResponseBody
  public ResponseEntity<DoIt> doIt(@PathVariable String action, @RequestBody JsonUntil input) {
    DoIt doIt = new DoIt(action, input.getUntil());
    return new ResponseEntity<>(doIt, HttpStatus.OK);
  }

  @PostMapping(value = "/arrays")
  @ResponseBody
  public ResponseEntity<ArrayHandlerCalc> doIt(@RequestBody ArrayHandlerinput input) {
    ArrayHandlerCalc calc = new ArrayHandlerCalc(input.getWhat(), input.getNumbers());
    return new ResponseEntity<>(calc, HttpStatus.OK);
  }
}

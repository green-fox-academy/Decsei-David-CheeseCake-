package com.example.dependecies.Interfaces;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Printer {
  MyColor myColor;


  @Autowired
  public Printer(@Qualifier("Blue") MyColor myColor){
    this.myColor = myColor;
  }

  public void log(String message) {
    System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
  }

  public void printColor() {
    myColor.printMyColor();
  }
}


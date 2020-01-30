package com.example.dependecies.Colors;

import com.example.dependecies.Interfaces.MyColor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("Green")
@Service
public class GreenColor implements MyColor {


  @Override
  public void printMyColor() {
    System.out.println("My color is green.");
  }
}

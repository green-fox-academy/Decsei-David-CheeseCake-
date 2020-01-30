package com.example.dependecies.Interfaces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

import org.hibernate.validator.internal.constraintvalidators.hv.EmailValidator;
import org.springframework.stereotype.Service;

@Service
public class UtilityService implements Serializable {

  ArrayList<String> colors;
  Random random;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }


  public static String validateEmailApache(String email) {
   email = email.trim();
    EmailValidator eValidator = new EmailValidator();
    if (eValidator.isValid(email, email.trim())) {
      return email + " is a valid email address.";
    } else {
      return email + " is not a valid email address.";
    }
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public String caesar(String text, int number) {
    if (number < 0) {
      number = 26 + number;
    }

    String result = "";
    for (int i = 0; i < text.length(); i++) {
      int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
      result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
    }
    return result;
  }
}
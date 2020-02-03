package com.example.foxtamagochi.Services;

import com.example.foxtamagochi.Repository.ListOfFoxes;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter

@Service
public class FoxServiceController {
  private ListOfFoxes listOfFoxes;
  private boolean isLoggedIn;

  public FoxServiceController(ListOfFoxes listOfFoxes){
    this.listOfFoxes = listOfFoxes;
    this.isLoggedIn = false;
  }


}

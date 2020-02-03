package com.example.foxtamagochi.Interfaces;

import com.example.foxtamagochi.Repository.ListOfFoxes;
import org.springframework.stereotype.Service;

@Service
public class TrickListServiceImp implements TrickListService {

  private ListOfFoxes listOfFoxes;

  public TrickListServiceImp(ListOfFoxes listOfFoxes) {
    this.listOfFoxes = listOfFoxes;
  }

  @Override
  public void addNewTrick(String name, String trick) {
    if (!trick.equals("")) {
      listOfFoxes.findFoxWithName(name).getTricks().add(trick);
    }
  }

  @Override
  public void removeTrick(String name, String trick) {
    if (!trick.equals("")) {
      for (int i = 0; i < listOfFoxes.findFoxWithName(name).getTricks().size(); i++) {
        if (listOfFoxes.findFoxWithName(name).getTricks().get(i).equals(trick)) {
          listOfFoxes.findFoxWithName(name).getTricks().remove(i);
          return;
        }
      }
    }
  }

}

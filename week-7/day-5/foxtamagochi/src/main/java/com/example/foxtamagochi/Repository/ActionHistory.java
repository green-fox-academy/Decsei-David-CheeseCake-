package com.example.foxtamagochi.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

@Repository
public class ActionHistory {

  private List<String> actionHistory;

  public ActionHistory(){
    this.actionHistory = new ArrayList<>();
  }

  public List<String> returnTheList(){
    return this.actionHistory;
  }

}

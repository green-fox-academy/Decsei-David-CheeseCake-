package com.example.foxtamagochi.Interfaces;

import com.example.foxtamagochi.Models.Fox;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface LoginInterface {

  boolean nameIsEmpty(String name);

  void logIn(String name);

  boolean anyLoggedIn();

  Fox returnTheFox(String name);

  Fox returnTheFoxWithLoginState();

  List<String> returnActionHistoryList();
}

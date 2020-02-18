package com.example.week9day1.Services;

import com.example.week9day1.Repository.MainRepoInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServiceIntImp implements MainServiceInt {

  MainRepoInt mainRepoInt;

  @Autowired
  public MainServiceIntImp(MainRepoInt mainRepoInt) {
    this.mainRepoInt = mainRepoInt;
  }
}

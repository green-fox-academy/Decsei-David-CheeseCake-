package com.example.week9day1.Domain;

public class Appended {
  private String appended;

  public Appended(String input) {
    this.appended = input.concat("a");
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }


}

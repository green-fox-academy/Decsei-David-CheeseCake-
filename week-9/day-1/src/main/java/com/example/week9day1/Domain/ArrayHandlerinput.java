package com.example.week9day1.Domain;

import com.fasterxml.jackson.annotation.JsonValue;

public class ArrayHandlerinput {

  private String what;
  private Integer[] numbers;

  public ArrayHandlerinput(String what, Integer[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public ArrayHandlerinput(ArrayHandlerinput input) {
    this.what = input.getWhat();
    this.numbers = input.getNumbers();
  }

  public ArrayHandlerinput() {
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public Integer[] getNumbers() {
    return numbers;
  }

  public void setNumbers(Integer[] numbers) {
    this.numbers = numbers;
  }

  @JsonValue
  @Override
  public String toString() {
    return super.toString();
  }
}
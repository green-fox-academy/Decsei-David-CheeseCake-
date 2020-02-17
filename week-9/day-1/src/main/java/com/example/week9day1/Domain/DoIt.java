package com.example.week9day1.Domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class DoIt {

  @JsonInclude(Include.NON_NULL)
  private Integer result;
  @JsonInclude(Include.NON_NULL)
  private String error;


  public DoIt(String action, Integer until) {

    if (action.equals("factor")) {
      int num = until, i = 1;
      this.result = 1;
      while (i <= num) {
        this.result *= i;
        i++;
      }
    } else if (action.equals("sum")) {
      int num = until, i = 1;
      this.result = 0;
      while (i <= num) {
        this.result += i;
        i++;
      }
    } else if (until == null) {
      this.error = "Please provide a number!";
    }
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}

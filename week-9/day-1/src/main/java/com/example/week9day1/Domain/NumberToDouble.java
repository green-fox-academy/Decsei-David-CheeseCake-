package com.example.week9day1.Domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class NumberToDouble {

  @JsonInclude(Include.NON_NULL)
  private Integer received;
  @JsonInclude(Include.NON_NULL)
  private Integer result;
  @JsonInclude(Include.NON_NULL)
  private String error;

  public NumberToDouble(Integer received) {
    if (received != null) {
      this.received = received;
      this.result = received * 2;
    } else {
      this.error = "Please provide an input!";
    }
  }

  public Integer getReceived() {
    return received;
  }

  public void setReceived(Integer received) {
    this.received = received;
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

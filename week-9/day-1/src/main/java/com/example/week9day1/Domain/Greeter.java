package com.example.week9day1.Domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Greeter {
  @JsonInclude(Include.NON_NULL)
  private String welcome_message;
  @JsonInclude(Include.NON_NULL)
  private String error;
  @JsonInclude(Include.NON_NULL)
  private Integer statusCode;

  public Greeter(String name, String title) {
    if ((name == null && title == null) || (name.isEmpty() && title.isEmpty())) {
      this.error = "Please provide a name and a title!";
      this.statusCode = 400;
    } else if (name == null || name.isEmpty()) {
      this.error = "Please provide a name!";
      this.statusCode = 400;
    } else if (title == null || title.isEmpty()) {
      this.error = "Please provide a title!";
      this.statusCode = 400;
    } else {
      this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
      this.statusCode = 200;
    }
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }
}

package com.example.listingtodo.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Todo {
  private Long id;
  private String title;
  private boolean urgent;
  private boolean done;

  public Todo(Long id, String title) {
    this.id = id;
    this.title = title;
    this.urgent = false;
    this.done = false;
  }
}

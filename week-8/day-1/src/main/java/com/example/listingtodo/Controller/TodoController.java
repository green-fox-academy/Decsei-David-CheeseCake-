package com.example.listingtodo.Controller;

import com.example.listingtodo.Repository.TodoListRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

  TodoListRepoImp todoListRepoImp;

  @Autowired
  public TodoController(TodoListRepoImp todoListRepoImp) {
    this.todoListRepoImp = todoListRepoImp;
  }

  @GetMapping(value="/todo")
  public String todoApp(Model model){
    model.addAttribute("todoList", todoListRepoImp);
    return "todo";
  }

  @GetMapping(value={"", "/", "welcome"})
  public String list(Model model){
    return "This is my first todo";
  }
}

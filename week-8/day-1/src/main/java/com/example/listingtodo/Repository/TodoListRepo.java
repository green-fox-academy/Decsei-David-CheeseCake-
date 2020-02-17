package com.example.listingtodo.Repository;

import com.example.listingtodo.Model.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface TodoListRepo extends CrudRepository<Todo, Long> {

  List<Todo> listToDo = null;
  
}

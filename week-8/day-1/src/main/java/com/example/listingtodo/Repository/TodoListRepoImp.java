package com.example.listingtodo.Repository;

import com.example.listingtodo.Model.Todo;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TodoListRepoImp implements TodoListRepo {


  @Autowired
  public TodoListRepoImp(List<Todo> listToDo) {
    this.listToDo = listToDo;
    listToDo.add(Arrays.asList(
        new Todo()
    ));
  }

  @Override
  public <S extends Todo> S save(S entity) {
    return null;
  }

  @Override
  public <S extends Todo> Iterable<S> saveAll(Iterable<S> entities) {
    return null;
  }

  @Override
  public Optional<Todo> findById(Long aLong) {
    return Optional.empty();
  }

  @Override
  public boolean existsById(Long aLong) {
    return false;
  }

  @Override
  public Iterable<Todo> findAll() {
    return null;
  }

  @Override
  public Iterable<Todo> findAllById(Iterable<Long> longs) {
    return null;
  }

  @Override
  public long count() {
    return 0;
  }

  @Override
  public void deleteById(Long aLong) {

  }

  @Override
  public void delete(Todo entity) {

  }

  @Override
  public void deleteAll(Iterable<? extends Todo> entities) {

  }

  @Override
  public void deleteAll() {

  }
}

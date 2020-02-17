package com.example.week9day1.Domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayHandlerCalc {

  @JsonInclude(Include.NON_EMPTY)
  private List<Integer> result;
  @JsonInclude(Include.NON_NULL)
  private String error;

  public ArrayHandlerCalc(String what, Integer[] numbers) {
    result = new ArrayList<>();

    if (what == null || what.isEmpty() || (numbers == null )) {
      this.error = "Please provide what to do with the numbers! (Or the numbers!)";
    } else if (what.equals("multiply")) {
      result.add(Arrays.stream(numbers).reduce(1, (a, b) -> a * b));
    } else if (what.equals("sum")) {
      result.add(Arrays.stream(numbers).reduce(0, Integer::sum));
    } else if (what.equals("double")) {
      result = (Arrays.stream(numbers).map(i -> i*2).collect(Collectors.toList()));
    }
  }

  public List<Integer> getResult() {
    return result;
  }

  public void setResult(List<Integer> result) {
    this.result = result;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}

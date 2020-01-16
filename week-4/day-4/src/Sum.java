import java.util.ArrayList;

public class Sum {

  ArrayList<Integer> listOfNumbers = new ArrayList<>();

  public Integer sum(ArrayList<Integer> list) {
    int summed = 0;
    for (int i = 0; i < list.size(); i++) {
      summed += list.get(i);
    }
    return summed;
  }
}

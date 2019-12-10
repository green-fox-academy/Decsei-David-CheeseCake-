import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

  public static void main(String[] args) {
ArrayList<String> list = new ArrayList<>();
list.addAll(Arrays.asList("Eggs", "milk", "fish", "apples", "bread", "chicken"));

if (list.contains("milk")) {
  System.out.println("We have milk on the list");
} else {
  System.out.println("We dont have milk on the list");
    }
if (list.contains("bananas")) {
  System.out.println("We have bananas on the list");
}else {
  System.out.println("We dont have bananas on the list");
}
  }
}

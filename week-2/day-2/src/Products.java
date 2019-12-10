import java.util.Arrays;
import java.util.HashMap;

public class Products {

  public static void main(String[] args) {
    HashMap<String, Integer> products = new HashMap<>();
    products.put("Eggs", 200);
    products.put("Milk", 200);
    products.put("Fish", 400);
    products.put("Apples", 150);
    products.put("Bread", 50);
    products.put("Chicken", 550);

    System.out.println("The price of a fish: " + products.get("Fish"));

    int[] prices = new int[products.size()];
    int fill = 0;
    for (String key : products.keySet()) {
      prices[fill] = products.get(key);
      fill++;
    }
    System.out.println("The most expensive product is: " + Arrays.stream(prices).max().getAsInt());
    System.out
        .println("The average of the prices is: " + Arrays.stream(prices).average().toString());

    int below = 0;
    for (String key : products.keySet()) {
      if (products.get(key) > 300) {
        below++;
      }
    }
    System.out.println("There are " + below + " items under 300");

    for (String key : products.keySet()) {
      if (products.get(key) < 125) {
        System.out.println("We can buy " + key + " for " + products.get(key));
      }

    }

    System.out.println("The cheapest product is: " + Arrays.stream(prices).min().getAsInt());
    System.out.println("------------------Products turorial 2 ----------------------");
    for (String key : products.keySet()) {
      if (products.get(key) < 201) {
        System.out.println("Less than 201: " + key);
      }
    }
    for (String key : products.keySet()) {
      if (products.get(key) > 150) {
        System.out.println("More than 150: " + key + products.get(key));
      }
    }
  }
}



import java.lang.reflect.Array;
import java.util.Arrays;

public class PersonalFinance {

//    We are going to represent our expenses in a list containing integers.
//
//    Create a list with the following items.
//        500, 1000, 1250, 175, 800 and 120
//    Create an application which solves the following problems.
//    How much did we spend?
//    Which was our greatest expense?
//    Which was our cheapest spending?
//    What was the average amount of our spendings?

  public static void main(String[] args) {
  int[] Finance = {500, 1000, 1250, 175, 800, 120};

    int sum = 0;
      for (int d : Finance) {
          sum += d;
      }
    System.out.println("We spent: " + sum);

    int max = Arrays.stream(Finance).max().getAsInt();
    System.out.println("The greatest expense was: " + max);

    int min = Arrays.stream(Finance).min().getAsInt();
    System.out.println("The cheapest expense was: " + min);

    double average = Arrays.stream(Finance).average().getAsDouble();
    System.out.println("The average of our spending was: " + Math.round(average));




  }
}

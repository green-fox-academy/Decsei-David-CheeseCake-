import java.util.Scanner;

public class Divide0 {
// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int divide = 10;

    int test = 0;
    do {
      System.out.println("Insert number to divine 10 with: ");
      int input = scan.nextInt();
      try {
        System.out.println(input + " divided by " + divide + " is " + divide / input);
        test++;
      } catch (ArithmeticException e) {
        System.out.println("Fail.");
      }
    } while (test < 1);


  }
}

import java.util.Scanner;

public class Sum {

// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

    public static void main(String[] args) {
        System.out.println("Insert numbers to add: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println(sum(a));

    }

    public static int sum(int a) {
        int b = 0;
        for (int i = 1; i <= a; i++) {
            b = b + i;
        }
        return b;
    }

}

import java.util.Scanner;

public class Factorial {
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

    public static void main(String[] args) {
        System.out.println("Insert numbers to factor: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println("The factorial of " + a + " is " + factorio(a));


    }

    public static int factorio(int a) {
        int FactNum = 1;

        for (int i = 1; i <= a; i++) {
            FactNum = FactNum * i;
        }
        return FactNum;
    }

}

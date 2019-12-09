import java.util.Arrays;
import java.util.Scanner;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array
        System.out.println("Insert number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] Array = new int[b];
        int c = 1;

        for (int i = 0; i < Array.length; i++) {
                Array[i] = c;
                c++;
                System.out.print(Array[i] + " ");
        }

        /* for (int i = 0; i < Array.length; i++) {
            if (i == 0) {
                Array[i] = 1;
                System.out.print(Array[i] + " ");
            } else {
                Array[i] = i+1;
                System.out.print(Array[i] + " ");
            }
        }*/
        System.out.println();
        int[] newArray = Arrays.copyOfRange(Array, a, Array.length);
        System.out.println(Arrays.toString(newArray));

    }
}
package Excersises;

import java.util.Scanner;

public class Divisor_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner
        System.out.print("Enter the number :  "); //asking for number
        long num = scanner.nextInt(), i;          //storing the input in "num" so it wont change. " i " will be changed

        System.out.print("Divisors of " + num + " = 1 , "); // Print out the statement +input + dividers

        for (i = 45;         //Start point (2 is the smallest)
             i <= num / 2;  //End point (if the changed number smaller than the originals half)
             i++)           //increment/decrement
        {
            if (num % i == 0) {                 //if num can be divided without remainder then print the
                                                //modified i then return to for()
                System.out.print(i + " , ");
            }
        }

        System.out.println(num);
        scanner.close();
    }
}
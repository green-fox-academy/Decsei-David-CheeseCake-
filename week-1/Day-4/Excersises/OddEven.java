package Excersises;

// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Kérem adja meg a számot: ");
        int input = scan.nextInt();

        if (input%2 == 0) {
            System.out.println("A szám páros.");
        } else {
            System.out.println("A szám páratlan.");
        }


    }
}

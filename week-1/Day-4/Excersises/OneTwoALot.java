package Excersises;

// Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot

import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;

        do { System.out.println("Kérem adjon meg a számot: ");
            num = scan.nextInt(); }
        while(num <= 0);

        if (num == 1) {
            System.out.println("One");
        } else if (num == 2) {
            System.out.println("Two");
        } else {
            System.out.println("A lot");
        }

    }

}

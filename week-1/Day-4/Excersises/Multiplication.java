package Excersises;

import java.util.Scanner;

// Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150
public class Multiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please insert your number: ");
        int num = scan.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(i + " * " + num + " = " + i*num);
        }
    }
}

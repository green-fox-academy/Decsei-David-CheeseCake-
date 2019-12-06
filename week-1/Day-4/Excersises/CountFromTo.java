package Excersises;

import java.util.Scanner;

// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
public class CountFromTo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num_a = 0;
        int num_b = 0;

        System.out.println("Please enter your first number: ");
        num_a = scan.nextInt();

        System.out.println("Please enter your second number: ");
        num_b = scan.nextInt();

        if (num_b < num_a) {
            System.out.println("The second number should be bigger.");
            num_a = scan.nextInt();
        } else {
            do {
                System.out.println(num_a);
                num_a++;
            }while (num_a <= num_b);
        }


    }
}

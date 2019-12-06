package Excersises;

import java.util.Scanner;

// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int SumOfArray = 0;

        System.out.println("How many numbers you want: ");
        int input = scan.nextInt();
        int[] myNum = new int[input];


        for (int i = 0; i < input; i++) {
            System.out.println("Enter your numbers: ");
            myNum[i] = scan.nextInt();
        }

        for (int value : myNum) {
            SumOfArray += value;
        }
        System.out.println("Your numbers summary is: " + SumOfArray);
        System.out.println("Your numbers average is: " + SumOfArray / input);
    }
}

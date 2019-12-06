package Excersises;

import java.util.Scanner;

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was
public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number : ");
        int row = scan.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j=1; j<=row; j++) {
                if (i == 1 || i == row) {
                    System.out.print("%");
                } else if (j == 1 || j == row) {
                    System.out.print("%");
                } else if (i == j) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
}
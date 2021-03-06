package Excersises;

import java.util.Scanner;

// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
public class DrawPyramid {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Insert a number: ");
            int rows = scan.nextInt();

            int k = 0;

            for(int i = 1; i <= rows; i++, k = 0) {
                for(int space = 1; space <= rows - i; ++space) {
                    System.out.print(" ");
                }
                while(k != 2 * i - 1) {
                    System.out.print("*");
                    ++k;
                }
                System.out.println();
                }
        }
    }

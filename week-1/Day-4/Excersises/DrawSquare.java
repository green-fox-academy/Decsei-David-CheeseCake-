package Excersises;
// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter number : ");
        int row = scan.nextInt();

        for (int i = 1; i <= row; i++) {                        //run this many times = rows
            if (i==1 || i==row) {                           // but check if the next loop is the first or the last
                    for (int j = 1; j <= row; j++) {            //print this many times in one row loop
                        System.out.print("%");
                    }
                        System.out.println();
            } else {
                    System.out.print("%");
                        for (int j = row-(row-1); j <=row-2; j++) {
                        System.out.print(" ");//print this many times in one row loop
                        }

                    System.out.print("%");
                    System.out.println();
            }
        }
    }

}

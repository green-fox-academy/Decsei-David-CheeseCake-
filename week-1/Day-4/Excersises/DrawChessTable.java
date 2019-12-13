package Excersises;

import java.util.Scanner;

// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
public class DrawChessTable {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number : ");
        int row = scan.nextInt();

            for (int i = 1; i <= row; i++) {

                    for (int j = 1; j <= row; j++) {
                    System.out.print("% ");
                    }
                    System.out.println();

                    for (int k = 1; k <= row; k++) {
                    System.out.print(" %");
                    }
                    System.out.println();

            }

    }

}

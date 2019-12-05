package Excersises;

import java.util.Scanner;

// Write a program that asks for two numbers and prints the bigger one
public class PrintBigger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = scan.nextInt();

        System.out.println("Enter a number: ");
        int b = scan.nextInt();

       if (a < b){
           System.out.println(b +" Is the bigger number.");
       }else {
           System.out.println(a +" Is the bigger number.");
       }
    }
}

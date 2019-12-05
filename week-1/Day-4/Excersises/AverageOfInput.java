package Excersises;
// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Kérem adja meg az első számot: ");
            int first = scan.nextInt();

        System.out.println("Kérem adja meg az második számot: ");
            int second = scan.nextInt();

        System.out.println("Kérem adja meg az harmadik számot: ");
            int third = scan.nextInt();

        System.out.println("Kérem adja meg az negyedik számot: ");
            int fourth = scan.nextInt();

        System.out.println("Kérem adja meg az ötödik számot: ");
            int fifth = scan.nextInt();

    int summ = first+second+third+fourth+fifth;
    int average = 5;


        System.out.println("Összesen: " + summ + "\n");
        System.out.println("Átlag: " + summ/5 + "\n");



    }
}

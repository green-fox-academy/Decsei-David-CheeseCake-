package Excersises;

public class TwoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13
int a = 22;
int b = 13;
        // Print the result of 13 added to 22
        System.out.println("13 plus 22 is " + b+a);

        // Print the result of 13 substracted from 22
        System.out.println("22 minus 13 is " + (a-b));

        // Print the result of 22 multiplied by 13
        System.out.println("22 times 13 is " + a*b);

        // Print the result of 22 divided by 13 (as a decimal fraction)
        //If (double) isnt there then the divide will be an integer therefore decimal will be 1...
double decimal = (double)a/b;
        System.out.println("22 divided by 13 as a decimal fraction is " + decimal);

        // Print the integer part of 22 divided by 13
        System.out.println("22 divided by 13 as an integer is " +a/b);

        // Print the remainder of 22 divided by 13
int remainder = a%b;
        System.out.println("The remainder of 22 divided by 13 is " + remainder);
    }
}
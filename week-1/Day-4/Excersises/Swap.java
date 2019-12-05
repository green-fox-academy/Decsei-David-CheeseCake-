package Excersises;

public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;
        int temp = a;

        System.out.println("Before swap: " + a +" and " + b);

        temp = b;
        a = b;
        b = temp;


        System.out.println("After swap: " + a +" and " + b);
    }
}
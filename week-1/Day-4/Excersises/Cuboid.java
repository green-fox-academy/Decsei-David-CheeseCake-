package Excersises;

/*
 Write a program that stores 3 sides of a cuboid as variables (doubles)
 The program should write the surface area and volume of the cuboid like:

 Surface Area: 600
 Volume: 1000
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

DecimalFormat df = new DecimalFormat("0");
double a_side = 0;
double b_side = 0;
double c_side = 0;



            System.out.println("Please enter the sizes of your cuboid:");
                    a_side = scan.nextDouble();

            System.out.println("Please enter the sizes of your cuboid:");
                    b_side = scan.nextDouble();

            System.out.println("Please enter the sizes of your cuboid:");
                    c_side = scan.nextDouble();


        System.out.println("The volume of your cuboid is " + (int)Math.round(a_side*b_side*c_side) + "\n");
        System.out.println("The surface of your cuboid is " + (int)Math.round(2*((a_side+b_side+c_side))) + "\n");
    }
}

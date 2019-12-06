package Excersises;

import java.util.Scanner;

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tries = 0, guess;
        int random = (int) (Math.random()*100);

        do {
            System.out.println("Please enter your guess (between 0 - 100) : ");
            guess = scan.nextInt();
        }while (guess > 0 && guess < 100);

            while (guess != random) {
                if (guess < random) {
                        System.out.println("The stored number is higher");
                    do {
                        System.out.println("Please enter your guess (between 0 - 100) : ");
                        guess = scan.nextInt();
                        tries++;
                        }while (guess > 0 || guess < 100);

                }else if(guess > random) {
                            System.out.println("The stored number is lower");
                        do {
                            System.out.println("Please enter your guess (between 0 - 100) : ");
                            guess = scan.nextInt();
                            tries++;
                        }while (guess > 0 || guess < 100);
                    } }
                        System.out.println("Yes! The stored number was " + random + ", same as your guess " + guess + " !");
                        System.out.println(tries);
        }




    }

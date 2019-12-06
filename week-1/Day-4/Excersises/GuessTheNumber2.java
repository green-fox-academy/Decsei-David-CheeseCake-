package Excersises;

import java.util.Scanner;

public class GuessTheNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 - 100");
        int guess = scanner.nextInt();
        boolean goodGuess = false;
        int random = (int) (Math.random()*100);
        System.out.println(random);

        while (!goodGuess){
            if (guess > 100 || guess < 0){
                System.out.println("Your guess is not between 0 and 100");
                guess = scanner.nextInt();
            }else if (guess == random){
                System.out.println("You win, good guess");
                goodGuess = true;
            }else {
                System.out.println("You guessed wrong, try again");
                guess = scanner.nextInt();
            }
        }
    }
}

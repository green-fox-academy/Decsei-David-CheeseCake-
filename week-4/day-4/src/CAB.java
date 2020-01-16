import java.util.Random;
import java.util.Scanner;

public class CAB {

  boolean state;
  char[] numberToGuessMatrix;
  char[] guessMatrix;
  int guesses = 0;
  Random randomize = new Random();
  Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    CAB newCab = new CAB();
    int normalRandomNumber = newCab.randomize.nextInt(10000 - 1000) + 1000;
    System.out.println(normalRandomNumber);

    do {
      newCab.playCAB(normalRandomNumber, newCab.askForInput(newCab.scanner));
    } while (newCab.guesses < 5);
    System.out.println("Out of tries.");
  }

  public Integer askForInput(Scanner scanner) {
    System.out.println("Please insert your guess!");
    int guess = scanner.nextInt();
    while (guess < 1000 || guess > 10000) { // !(a&&b) = !a || !b
      System.out.println("Invalid number. Please insert a number between 1000 - 9999");
      guess = scanner.nextInt();
    }
    System.out.println("Your guess was: " + guess);
    guesses++;
    return guess;
  } // good scanner, leave it

  public void Start() {
    if (!state) {
      System.out.println("Playing...");
      state = true;
    }
  }

  public void checkGuess(Integer numberToGuess, Integer guess) {
    if (guess.equals(numberToGuess)) {
      System.out.println("Wow.... You actually won... And my program worked.");
      System.exit(0);
    } else {
      numbersToCharMatrix(numberToGuess, guess);
      checkTheBullsAndCows();
    }
  }

  public void numbersToCharMatrix(Integer numberToGuess, Integer guess) {
    String numberToGuessString = String.valueOf(numberToGuess);
    numberToGuessMatrix = numberToGuessString.toCharArray();
    String GuessString = String.valueOf(guess);
    guessMatrix = GuessString.toCharArray();
  } // working, leave it

  public void checkTheBullsAndCows() {
    int cow =0;
    int bull =0;
    for (int i = 0; i < guessMatrix.length; i++) {
      for (int j = 0; j < guessMatrix.length; j++) {
        if (this.guessMatrix[i] == numberToGuessMatrix[i]) {
          cow++;
          break;
        } else if (guessMatrix[i] == numberToGuessMatrix[j]) {
          bull++;
          break;
        }
      }
    }
    System.out.println("Guesses: " + guesses);
    System.out.println("Almost! You have " + cow + " Cows and " + bull + " Bulls.");
  }

  public void playCAB(Integer testRandomNumber, Integer testGuess) {
    Start();
    checkGuess(testRandomNumber, testGuess);
  }
}

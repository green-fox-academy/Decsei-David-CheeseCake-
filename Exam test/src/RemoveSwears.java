import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class RemoveSwears {

  public static void main(String[] args) throws IOException {
    File textToCheck = new File(
        "Lorem.txt");
    String[] wordToRemove = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole",
        "dick", "piss", "cunt"};
    System.out.println("Bad words removed: " + removeBadWords(textToCheck, wordToRemove));
  }

  public static int removeBadWords(File textToCheck, String[] wordToRemove) throws IOException {
    int counter = 0;

    Scanner scannerLines = new Scanner(textToCheck);
    while (scannerLines.hasNextLine()) {
      String line = scannerLines.nextLine();
      for (String s : wordToRemove) {
        String upperCaseWord =
            s.substring(0, 1).toUpperCase(Locale.ENGLISH) + s
                .substring(1);
        while (line.contains(s) || line.contains(upperCaseWord)) {
          if (line.contains(s)) {
            counter++;
            line = line.replace(s, "");

          } else {
            line = line.replace(upperCaseWord, "");
            counter++;

          }
        }
      }
    }
    return counter;
  }
}



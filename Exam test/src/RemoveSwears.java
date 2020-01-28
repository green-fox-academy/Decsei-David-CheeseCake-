import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class RemoveSwears {

  public static void main(String[] args) throws IOException {
    String[] wordToRemove = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole",
        "dick", "piss", "cunt"};
    System.out.println("Bad words removed: " + removeBadWords(wordToRemove));
  }

  public static int removeBadWords(String[] wordToRemove) throws IOException {
    int counter = 0;

    Path filePath = Paths.get("src/ReadFile/teszt.txt");
    List<String> lines = Files.readAllLines(filePath);
    List<String> content = new ArrayList();
    for (int i = 0; i < lines.size(); i++) {
      for (String s : wordToRemove) {
        String upperCaseWord = s.substring(0, 1).toUpperCase(Locale.ENGLISH) + s.substring(1);
        while (lines.contains(s) || lines.contains(upperCaseWord)) {
          if (lines.contains(s)) {
            lines = lines.remove(s);
            counter++;
          } else {
            int tempIndex = lines.indexOf(s);
            lines.remove(s);
            lines.add(tempIndex, s);
            counter++;
          }
        }
      }
    }
    return counter;
  }
}



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    try {
      System.out.println("Please input your file name: ");
      String input = scan.nextLine();
      Path path = Paths.get(input);

      if (Files.exists(path)) {

        System.out.println("Please input your word: ");
        String word = scan.nextLine();
        System.out.println("Please input your word: ");
        String number = scan.nextLine();

        List<String> content = new ArrayList();

        if (word.equals("apple")) {
          for (int i = 1; i <= 5; i++) {
            content.add(word);
          }
          content.add(number);
        } else {
          content.add(word);
          content.add(number);
        }

        Files.write(path, content);

        System.out.println(Files.readAllLines(path));
      }

    } catch (IOException e) {
      System.out.println("");
    }
  }

}

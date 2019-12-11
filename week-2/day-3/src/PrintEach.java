import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEach {

  public static void main(String[] args) throws IOException {
    // Write a program that opens a file called "my-file.txt", then prints
    // each line from the file.
    // If the program is unable to read the file (for example it does not exist),
    // then it should print the following error message: "Unable to read file: my-file.txt"
    Path path = Paths.get("my-file.txt");
    try {
      if (Files.exists(path)) {
        List<String> read = Files.readAllLines(path);
        for (String sor : read) {
          System.out.println(sor);
        }
      } else {
        System.out.println("Theres no file to read");
      }
    } catch (ArithmeticException e) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}

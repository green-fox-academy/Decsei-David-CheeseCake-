import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {

  // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);

    int test = 0;
    do {
      try {
        System.out.println("Insert the file name to read: ");
        String fileName = scan.nextLine();
        Path path = Paths.get(fileName);
        List<String> lines = Files.readAllLines(path);
        System.out.println("The number of lines in this file is: " + lines.size());
        test++;
      } catch (NoSuchFileException e) {
        System.out.println("The number of lines in this file: 0");
      }

    } while (test < 1);
  }
}




import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteSingleLine {

  public static void main(String[] args) throws IOException {
    // Write a function that is able to manipulate a file
    // By writing your name into it as a single line
    // The file should be named "my-file.txt"
    // In case the program is unable to write the file,
    // It should print the following error message: "Unable to write file: my-file.txt"
    Path path = Paths.get("my-file.txt");
    try {
      List<String> lines = Files.readAllLines(path);
      System.out.println(lines + "\n -----------------------------");
      Files.writeString(path, "Nadena Décsei Dávid");
      System.out.println(Files.readAllLines(path));
      Files.write(path, lines);
    } catch (IOException e){
      System.out.println("Unable to write file: my-file.txt");
    }

  }
}

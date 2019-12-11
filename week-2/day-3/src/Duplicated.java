import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Duplicated {

  public static void main(String[] args) throws IOException {
    Path content = Paths.get("Double.txt");
    List<String> content_list = Files.readAllLines(content);
    System.out.println(content_list);

    StringBuilder content_sb = new StringBuilder();
    String.valueOf(content_list).chars().distinct().forEach(c -> content_sb.append((char) c));

    System.out.println(content_sb);

  }

}
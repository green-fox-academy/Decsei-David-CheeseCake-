import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Scanner;


public class Copy {

  public static void main(String[] args) throws IOException {
    File original = new File("my-file.txt");
    File copy = new File("copy.txt");
    Scanner copied = new Scanner(new File("copy.txt"));

    System.out
        .println(Files.readAllLines(Paths.get(String.valueOf(original))) + "\n ------------------");
    System.out
        .println(Files.readAllLines(Paths.get(String.valueOf(copy))) + "\n ------------------");

    System.out.println(copy(original, copy) + "\n ------------------");

    System.out
        .println(Files.readAllLines(Paths.get(String.valueOf(copy))) + "\n ------------------");

  }

  public static boolean copy(File a, File b) throws InvalidPathException, IOException {
    FileChannel sourceChannel = null;
    FileChannel destChannel = null;
    try {
      sourceChannel = new FileInputStream(a).getChannel();
      destChannel = new FileOutputStream(b).getChannel();
      destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
      return true;
    } catch (InvalidPathException r) {
      return false;

    } catch (IOException t) {
      return false;
    }
  }
}





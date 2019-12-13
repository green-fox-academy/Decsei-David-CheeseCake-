import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob {

  public static void main(String[] args) throws IOException {

String theString = "aabbb";

    File file = new File("test.txt");
    Scanner scan = new Scanner(file);
    theString = scan.nextLine();
    while (scan.hasNextLine()) {
      theString = theString + scan.nextLine();
    }
    char[] charArray = theString.toCharArray();



    StringBuilder str = new StringBuilder(theString);
    StringBuilder rev = str.reverse();
    System.out.println(rev);


  }

}

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class Excersises {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    System.out.println("excersise 1");
    numbers.stream().filter(x -> x % 2 == 0).forEach(y -> System.out.print(y + ","));
    System.out.println();

    System.out.println("excersise 2");
    List<Integer> numbers2 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    numbers2.stream().filter(x -> x >= 0).forEach(y -> System.out.print(y + ","));
    System.out.println();

    System.out.println("excersise 3");
    List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);
    numbers3.stream().filter(x -> (x * x) > 20).forEach(y -> System.out.print(y + ","));
    System.out.println();

    System.out.println("excersise 4");
    List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    numbers4.stream().filter(x -> x % 2 == 1).mapToInt(Integer::intValue).average().stream()
        .forEach(y -> System.out.print(y + ","));
    System.out.println();

    System.out.println("excersise 5");
    List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
    System.out.print(numbers5.stream().filter(x -> x % 2 == 1).mapToInt(Integer::intValue).sum());
    System.out.println();

    System.out.println("excersise 6");
    String testString = "whereIsThE Uppercase?";
    IntStream testStreamString = testString.chars();
    String upperOnes = testStreamString.filter(Character::isUpperCase).collect(StringBuilder::new,
        StringBuilder::appendCodePoint,
        StringBuilder::append)
        .toString();
    System.out.println(upperOnes);

    System.out.println("excersise 7");
    List<String> cities = Arrays
        .asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM",
            "ABU DHABI", "PARIS");
    cities.stream().filter(x -> x.startsWith("A")).forEach(y -> System.out.print(y + ","));
    System.out.println();

    System.out.println("excersise 8");
    List<String> randomWords = Arrays
        .asList("ROME", "LONDON ", "NAIROBI  ", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM",
            "ABU DHABI", "PARIS");
    System.out.println(randomWords.stream().map(String::trim).collect(StringBuilder::new,
        StringBuilder::append,
        StringBuilder::append).toString());
    System.out.println();

    System.out.println("excersise 9");
    HashMap<String, Integer> charsInString = new HashMap<>();
    List<String> randomWords2 = Arrays
        .asList("ROMEEEE");

  }

}


import java.util.ArrayList;
import java.util.Arrays;

public class List_2 {

    public static void main(String[] args) {
        ArrayList<String> ListA = new ArrayList<>();
        ListA.addAll(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        System.out.println("List A is: " + ListA.toString() + "\n -----------------------------------------");

        ArrayList<String> ListB = new ArrayList<>();
        ListB.addAll(ListA);
        System.out.println("List B is: " + ListA.toString() + "\n -----------------------------------------");

        if (ListA.contains("Durian")) {
            System.out.println("List A is containing Durian \n -----------------------------------------\"");
        } else {
            System.out.println("List A is containing Durian \n -----------------------------------------");
        }
        ListB.remove("Durian");
        ListA.add("Kiwifruit");

        System.out.println("List A size is: " + ListA.size() + "\n -----------------------------------------");
        System.out.println("List B size is: " + ListB.size() + "\n -----------------------------------------");

        System.out.println("The index of Avocado in List A is: " + ListA.indexOf("Avocado")
                + "\n -----------------------------------------");

        System.out.println("The index of Durian in List B is: " + ListB.indexOf("Durian")
                + "\n -----------------------------------------");

        ListB.add("Passion Fruit, Pomelo");
    }

}

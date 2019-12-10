import java.util.HashMap;

public class MapIntroduction {
    public static void main(String[] args) {
        HashMap<Integer, Character> Map = new HashMap<>();
        if (Map.isEmpty()) {
            System.out.println("The map is empty\n --------------------------------");
        } else {
            System.out.println("The map is not empty\n --------------------------------");
        }
        Map.put(97, 'a');
        Map.put(98, 'b');
        Map.put(99, 'c');
        Map.put(65, 'A');
        Map.put(66, 'B');
        Map.put(67, 'C');

        System.out.println(Map.keySet() + "\n--------------------------------");
        System.out.println(Map.values() + "\n--------------------------------");

        Map.put(68, 'D');
        System.out.println(Map.size() + "\n--------------------------------");

        System.out.println(Map.get(99) + "\n--------------------------------");

        Map.remove(97);

        if (Map.containsKey(100)) {
            System.out.println(Map.get(100) + "is on the 100th place \n--------------------------------");

        } else {
            System.out.println("There is nothing on the 100th place \n--------------------------------");
        }
        Map.clear();

    }
}

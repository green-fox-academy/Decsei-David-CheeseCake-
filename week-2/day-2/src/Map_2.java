import java.util.HashMap;

public class Map_2 {
    public static void main(String[] args) {
        HashMap<String, String> Map = new HashMap<>();
        Map.put("978 - 1 - 60309 - 452 - 8", "A Letter to Jo");
        Map.put("978 - 1 - 60309 - 459 - 7", "Lupus");
        Map.put("978 - 1 - 60309 - 444 - 3", "Red Panda and Moon Bear");
        Map.put("978 - 1 - 60309 - 461 - 0", "The Lab");

        for (String map : Map.keySet()) {
            System.out.println(Map.get(map) + " (" + map + ") \n");
        }

        Map.remove("978-1-60309-444-3");
        Map.remove("", "The Lab");

        Map.put("978-1-60309-450-4", "They Called Us Enemy");
        Map.put("978-1-60309-453-5", "Why Did We Trust Him?");

        if (Map.containsKey("478-0-61159-424-8")) {
            System.out.println("Yes there is a value on 478-0-61159-424-8 " + "\n ----------------");
        } else {
            System.out.println("Nope, there is nothing on 478-0-61159-424-8 \n ----------------");
        }

        System.out.println(Map.get("978-1-60309-453-5"));

    }

}

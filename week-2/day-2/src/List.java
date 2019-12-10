import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.toString());
        names.add("William");

        if (names.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            System.out.println("The list is not empty");
        }
        names.add("John");
        names.add("Amanda");

        System.out.println(names.size());
        System.out.println(names.get(names.size() - 1));

        Iterator IndivItem = names.iterator();
        while (IndivItem.hasNext()) {
            System.out.println(IndivItem.next());
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i+1 + "." + names.get(i));
        }

        names.remove(1);

        for (int i = names.size()-1; i >= 0; i--) {
            System.out.println(names.get(i));
        }

        names.clear();
    }

}


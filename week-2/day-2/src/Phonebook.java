import java.util.HashMap;

public class Phonebook {

  public static void main(String[] args) {
    HashMap<String, String> pbook = new HashMap<>();
    pbook.put("William A. Lathan", "405-709-1865");
    pbook.put("John K. Miller", "402-247-8568");
    pbook.put("Hortensia E. Foster", "606-481-6467");
    pbook.put("Amanda D. Newland", "319-243-5613");
    pbook.put("Brooke P. Askew", "307-687-2982");

//  What is John K. Miller's phone number?
//  Whose phone number is 307-687-2982?
//  Do we know Chris E. Myers' phone number?

    System.out.println("John K. Miller's phone number is: " + pbook.get("John K. Miller"));

    for (String key : pbook.keySet()) {
      if ("307-687-2982".equals(pbook.get(key))) {
        System.out.println("307-687-2982 is " + key);
      }

    }
    if (pbook.containsKey("Chris E. Myers")) {
      System.out.println("Chris E. Myers's phone number is: " + pbook.get("Chris E. Myers"));
    } else {
      System.out.println("We dont know Chris E. Myers's phone number");
    }
  }
}

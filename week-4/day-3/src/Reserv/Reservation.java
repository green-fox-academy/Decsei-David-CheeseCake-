package Reserv;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reservation implements Reservationy {

  List<String> Days = new ArrayList<>();
  List<String> rCodes = new ArrayList<>();

  @Override
  public String getDowBooking() {
    Days.add("Monday");
    Days.add("Tuesday");
    Days.add("Wednesday");
    Days.add("Thursday");
    Days.add("Friday");
    Days.add("Saturday");
    Days.add("Sunday");

    Random random = new Random();
    int x = random.nextInt(Days.size());
    return Days.get(x);
  }

  @Override
  public String getCodeBooking() {
    char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9'};
    Random random = new Random();
    String a = "";
    for (int i = 0; i < 8; i++) {
      int randomNumber = random.nextInt(36);
      a += chars[randomNumber];
    }
    for (int i = 0; i < 7; i++) {
      rCodes.add(a);
    }
    return rCodes.get(random.nextInt(rCodes.size()));
  }

  @Override
  public String format(String code, String day) {
    return String.format("Booking# " + code + " for " + day);
  }


}

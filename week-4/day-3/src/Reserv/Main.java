package Reserv;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Reservation test = new Reservation();

    for (int i = 0; i < 10; i++) {
      System.out.println(test.format(test.getCodeBooking(),test.getDowBooking()));
    }


  }

}

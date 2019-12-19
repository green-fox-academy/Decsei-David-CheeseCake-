package Pirates;

import java.util.ArrayList;

public class PirateSimulate {

  public static void main(String[] args) {
    Pirate Olaf = new Pirate("Olaf", 0, false);
    Pirate Elsa = new Pirate("Elsa", 0, false);

    //called and should reply
    Olaf.howsItGoingMate();
    System.out.println();

    //Drink a lot then pass out
    Olaf.drinkSomeRum();
    System.out.println();

    Olaf.Fight(Elsa);
    System.out.println("Cheking on Olaf");
    Olaf.howsItGoingMate();
    System.out.println("\n" + "Cheking on Elsa");
    Elsa.howsItGoingMate();

    System.out.println();
//-------------------------------------SHIP 1 ----------------------------------------------------
    Ship ship1 = new Ship("FlyingDutchman", "CptOne");
    System.out.println();
    ship1.fillCrew();

//    System.out.println(Arrays.toString(crew.toArray()));  // write out the full crew
    System.out.println();
    System.out.println("Crew size: " + ship1.getCrew().size());
    System.out.println();
    System.out.println(
        "Cpt name: " + ship1.getCrew().get(ship1.getCrew().size() - 1).getName() + " Consumed Rum: "
            + ship1.getCrew().get(ship1.getCrew().size() - 1).getConsumedRum() + " Drunk: " + ship1
            .getCrew().get(ship1.getCrew().size() - 1).getIsDrunk()
            + " Dead: " + ship1.getCrew().get(ship1.getCrew().size() - 1));

    for (int i = 0; i < ship1.getCrew().size(); i++) {
      if (ship1.getCrew().get(i).getIsDrunk()) {
        ship1.setAllPassedOut(+1);
      } else if (ship1.getCrew().get(i).getIsDead()) {
        ship1.setAllDied(+1);
      }
    } //count passed out / died member

    System.out.println(ship1.getAllPassedOut() + " Pirates are passed out");
    System.out.println(ship1.getAllDied() + " Pirates are died");

//-----------------------------------------SHIP 2 -------------------------------------------------
    System.out.println();
    Ship ship2 = new Ship("BlackPearl", "CptTwo");
    System.out.println();
    ship2.fillCrew();

    System.out.println();
    System.out.println("Crew size: " + ship1.getCrew().size());
    System.out.println();
    System.out.println(
        "Cpt name: " + ship2.getCrew().get(ship2.getCrew().size() - 1).getName() + " Consumed Rum: "
            + ship2.getCrew().get(ship2.getCrew().size() - 1).getConsumedRum() + " Drunk: " + ship2
            .getCrew().get(ship2.getCrew().size() - 1).getIsDrunk()
            + " Dead: " + ship2.getCrew().get(ship2.getCrew().size() - 1));

    System.out.println(ship2.getAllPassedOut() + " Pirates are passed out");
    System.out.println(ship2.getAllDied() + " Pirates are died");

    //-------------------------------------FIGHT------------------------------------------------

    System.out.println();
    ship1.ShipFight(ship2);

  }
}

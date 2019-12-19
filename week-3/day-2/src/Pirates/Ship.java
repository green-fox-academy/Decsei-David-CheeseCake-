package Pirates;

import java.util.ArrayList;
import java.util.Random;

public class Ship {

  String name;
  private int allDied;
  private int allPassedOut;
  private String CptName;
  private boolean destroyed;
  private int CptRum;
  private ArrayList<Pirate> crew = new ArrayList<>();



  //Constructor
  public Ship(String name, String CptName) {
    this.name = name;
    this.CptName = CptName;
  }

  //Getters Setters


  public ArrayList<Pirate> getCrew() {
    return crew;
  }

  public int getCptRum() {
    return CptRum;
  }

  public String getCptName() {
    return CptName;
  }

  public void setAllDied(int allDied) {
    this.allDied = allDied;
  }

  public int getAllDied() {
    return allDied;
  }

  public void setAllPassedOut(int allPassedOut) {
    this.allPassedOut = allPassedOut;
  }

  public int getAllPassedOut() {
    return allPassedOut;
  }

  public String getShipName() {
    return name;
  }

  public void setDestroyed(boolean destroyed) {
    this.destroyed = destroyed;
  }

  //Setter getter ends

  // fill ship with crew
  public void fillCrew() {
    Random random = new Random();
    for (int i = 0; i < random.nextInt(20); i++) {
      this.crew.add(new Pirate("Pirate" + i, random.nextInt(100), false));
    }
    this.crew.add(new Pirate(this.getCptName(), CptRum = random.nextInt(100), false));
  }

  //Ships score
  public int ShipScore() {
//    Number of Alive pirates in the crew - Number of consumed rum by the captain
    int scores = this.crew.size() - this.getCptRum();
    return scores;
  }

  // ship fight
  public void ShipFight(Ship opponent) {
    System.out.println(this.getShipName() + " attacks " + opponent.getShipName());
Random random = new Random();
    if (this.ShipScore() > opponent.ShipScore()) {
      System.out.println(this.getShipName() + " wins!");
      opponent.setDestroyed(true);
      opponent.setAllDied(random.nextInt(this.crew.size()));
    } else if (this.ShipScore() < opponent.ShipScore()) {
      System.out.println(opponent.getShipName() + " wins!");
      this.setDestroyed(true);
    } else {
      System.out.println("Both of them died...");
      this.setDestroyed(true);
      opponent.setDestroyed(true);
    }
  }
}

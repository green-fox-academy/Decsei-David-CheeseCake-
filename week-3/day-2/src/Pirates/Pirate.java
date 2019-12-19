package Pirates;

import java.util.Random;

public class Pirate {

  private String name;
  private String[] replies = {"Yeah?", "Waddaya want?", "Ill bash ya head in!"};
  private int repliesCount = 0;
  private int consumedRum;
  private int drinkCount = 0;
  private boolean IsDrunk;
  private int SleepTime = 3;
  private boolean isDead = false;

  //Constructor-------------------------
  public Pirate(String name, int consumedRum, boolean isDrunk) {
    this.name = name;
    this.consumedRum = consumedRum;
    this.IsDrunk = isDrunk;
  }
  //End of Constructor ------------------

  //Getters and setters-----------------
  public String getName() {
    return name;
  }

  public boolean getIsDrunk() {
    return IsDrunk;
  }

  public String[] getReplies() {
    return replies;
  }

  public int getConsumedRum() {
    return consumedRum;
  }

  public boolean isDrunk() {
    return IsDrunk;
  }

  public int getRepliesCount() {
    return repliesCount;
  }

  public int getDrinkCount() {
    return drinkCount;
  }

  public int getSleepTime() {
    return SleepTime;
  }

  public boolean getIsDead() {
    return isDead;
  }

  //End of getters and setters-----------------

  // Called and replies
  public void howsItGoingMate() {
    if (!this.Dead()) {
      System.out.println("This pirate is dead");
    } else {
      System.out.println(this.getName() + ": " + replies[repliesCount]);
      this.repliesCount++;
      if (this.repliesCount == 3) {
        this.repliesCount = 0;
      }
    }
  }

  //Drink 0-4 times then pass out
  public void drinkSomeRum() {
    if (!this.Dead()) {
      return;
    } else {
      if (this.drinkCount <= 4) {
        System.out.println(this.getName() + ": Pour me anudder!");
        this.drinkCount++;
        this.consumedRum++;
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        this.IsDrunk = true;
        this.PassedOut();
      }
    }
  }

  //Exit if passed out
  public void PassedOut() {
    if (this.IsDrunk && (this.SleepTime <= 3 && this.SleepTime > 0)) {
      System.out.println("Passed out and need time to sleep it off");
      this.SleepTime--;
      return;
    }
    this.SleepTime = 3;
    this.drinkCount = 0;
    this.IsDrunk = false;
  }

  //Dead or not
  public boolean Dead() {
    if (!this.isDead) {
      return true;
    }
    return false;
  }

  //Brawl A vs B
  public void Fight(Pirate opponent) {
    System.out.println(this.getName() + " picks on " + opponent.getName());
    Random random = new Random();
    switch (random.nextInt(3)) {
      case 0: // A wins
        System.out.println(this.getName() + " Wins!");
        opponent.isDead = true;
        break;
      case 1: // B wins
        System.out.println(opponent.getName() + " Wins!");
        this.isDead = true;
        break;
      case 2:
        System.out.println("Both of them died...");
        this.isDead = true;
        opponent.isDead = true;
        break;
    }
  }

  @Override
  public String toString() {
    return ("Name: " + this.getName() +
        "Rum consumed: " + this.getConsumedRum());
  }
}





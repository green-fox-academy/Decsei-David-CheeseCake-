package Aircraft;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

  protected List<Aircraft> Storage;
  protected int storeOfAmmo = 2300;
  protected int HP = 5000;
  protected int totalDmg;

  public Carrier() {
    Storage = new ArrayList<>();
  }

  public void add(Aircraft a) {
    Storage.add(a);
  }

  public void fill() {
    try {
      for (Aircraft a : Storage) {
        if (this.storeOfAmmo > a.maxAmmo) {
          this.storeOfAmmo = a.refill(this.storeOfAmmo);
        } else {
          a.Ammo = this.storeOfAmmo;
          this.storeOfAmmo = 0;
        }
      }
    } catch (Exception e) {
      System.out.println("Theres no more ammo!");
    }
  }

  public int fight(Carrier enemy) {
    int remainingHp;
    for (Aircraft a : Storage) {
      a.refill(this.storeOfAmmo);
      totalDmg = totalDmg + a.fight();
    }
    remainingHp = enemy.HP - totalDmg;
    if(remainingHp<=0) {
      System.out.println("It's dead Jim :(");
    }
    return remainingHp;
  }

  public void getStatus() {
    String carrierInfo =
        "HP: " + this.HP + ", Aircraft count: " + this.Storage.size() + ", Ammo Storage: "
            + this.storeOfAmmo + ", Total damage: " + this.totalDmg;
    System.out.println(carrierInfo);
    for (Aircraft a : Storage) {
      System.out.println(a.getStatus());
    }
  }

}

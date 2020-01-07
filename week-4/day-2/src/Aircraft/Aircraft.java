package Aircraft;

public class Aircraft {

  protected int Ammo = 0;
  protected int maxAmmo;
  protected int baseDmg;
  protected String type;
  protected boolean prior;

  public int fight() {
    int dmg = this.Ammo * this.baseDmg;
    return dmg;
  }

  public int refill(int ammoStorage) {
    this.Ammo = this.maxAmmo;
    ammoStorage = ammoStorage - this.Ammo;
    return ammoStorage;
  }

  public String getType() {
    return this.type;
  }

  public String getStatus() {
    String info =
        this.type + ", Ammo " + this.Ammo + ", Base Damage: " + this.baseDmg + ", All Damage: "
            + fight();
    return info;
  }

  public boolean isPriority() {
    return this.prior;
  }

}

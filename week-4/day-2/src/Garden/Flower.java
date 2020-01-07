package Garden;

public class Flower extends Plant {

  public Flower(String color, int water) {
    super(water, color);
    super.neededWater = 5;
    super.type = "Flower";
  }
}

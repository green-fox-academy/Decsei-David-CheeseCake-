package Garden;

public class Plant {

  protected double Water;
  protected String Color;
  protected int neededWater;
  protected String type;
  protected float absorbRatio;

  public Plant(double water, String color) {
    Water = water;
    Color = color;
  }

  public boolean needsWater() {
    if (this.Water < this.neededWater) {
      return true;
    } else {
      return false;
    }
  } //sets if the plant needs watering

  public void isNeed() {
    if (this.Water < this.neededWater) {
      System.out.println("The " + this.Color + " " + this.type + " needs water");
    } else {
      System.out.println("The " + this.Color + " " + this.type + " doesnt need water");
    }
  } //print out if it needs or not


  public void waterThePlant40(float a) {
    this.Water = +a;
  }
}

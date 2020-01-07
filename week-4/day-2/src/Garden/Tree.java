package Garden;

public class Tree extends Plant {

  public Tree(String color, int water) {
    super(water, color);
    super.neededWater = 10;
    super.type = "Tree";
    super.absorbRatio = (float) 0.75;
  }
}

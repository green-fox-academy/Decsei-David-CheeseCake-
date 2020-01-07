package Garden;

public class Simulate {

  public static void main(String[] args) {
    Garden test = new Garden();

    Flower yellow = new Flower("yellow", 1);
    test.addPlant(yellow);
    Flower blue = new Flower("blue", 1);
    test.addPlant(blue);

    Tree purple = new Tree("purple", 1);
    test.addPlant(purple);
    Tree orange = new Tree("orange", 1);
    test.addPlant(orange);

    for (Plant p : test.Plants) {
      p.needsWater();
      p.isNeed();
    }
    System.out.println();

    test.calcWater40();
    for (Plant p : test.Plants) {
      p.needsWater();
      p.isNeed();
    }
    System.out.println();

    test.calcWater70();
    for (Plant p : test.Plants) {
      p.needsWater();
      p.isNeed();
    }
    System.out.println();
  }


}

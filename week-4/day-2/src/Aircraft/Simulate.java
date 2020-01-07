package Aircraft;

public class Simulate {

  public static void main(String[] args) {
    F16 f16_1 = new F16();
    F35 f35_2 = new F35();
    F16 f16_3 = new F16();
    F35 f35_4 = new F35();
    F16 f16_5 = new F16();
    F35 f35_6 = new F35();
    Carrier carrier = new Carrier();
    Carrier enemy = new Carrier();

    f16_1.refill(carrier.storeOfAmmo);
    System.out.println(f16_1.fight());
    System.out.println(f16_1.getStatus());
    System.out.println(f16_1.isPriority());
    System.out.println("-----------------------------");
    f35_2.refill(carrier.storeOfAmmo);
    System.out.println(f35_2.fight());
    System.out.println(f35_2.getStatus());
    System.out.println(f35_2.isPriority());

    System.out.println("-----------------------------");

    carrier.add(f16_1);
    carrier.add(f35_2);
    carrier.add(f16_3);
    carrier.add(f35_4);
    carrier.add(f16_5);
    carrier.add(f35_6);

    carrier.fill();

    System.out.println(carrier.fight(enemy));
    System.out.println();
    carrier.getStatus();


  }


}

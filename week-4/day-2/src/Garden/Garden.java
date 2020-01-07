package Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  protected List<Plant> Plants;

  public Garden() {
    Plants = new ArrayList();
  }

  public void addPlant(Plant a) {
    Plants.add(a);
  }

  public int findNeeds() {
    int distributeWater = 0;
    for (Plant p : Plants) {
      if (p.needsWater()) {
        distributeWater++;
      }
    }
    return distributeWater;
  }

  public void calcWater40() {
    for (Plant p : Plants) {
      if (p.needsWater()) {
        p.waterThePlant40(40/findNeeds());
      }
    }
  }

  public void calcWater70() {
    for (Plant p : Plants) {
      if (p.needsWater()) {
        p.waterThePlant40(70/findNeeds());
      }
    }
  }
}

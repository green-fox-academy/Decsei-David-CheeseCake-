import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SumTest {

  Sum testSum = new Sum();

  @Test
  public void testSumMethodWith2Number() {
    testSum.listOfNumbers.add(10);
    testSum.listOfNumbers.add(10);

    assertEquals(20, testSum.sum(testSum.listOfNumbers));
  }

  @Test
  public void testSumMethodWithEmptyArray() throws NullPointerException {
    if (testSum.listOfNumbers.size() < 1) {
      System.out.println("The list is empty!");
    } else {
      assertEquals(20, testSum.sum(testSum.listOfNumbers));
    }
  }

}
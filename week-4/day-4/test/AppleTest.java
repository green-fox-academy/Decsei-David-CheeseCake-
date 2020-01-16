
import static org.junit.Assert.*;

import org.junit.Test;

public class AppleTest {

  @Test
  public void testGetApple(){
    Apple testApple = new Apple();
    assertEquals("apple", testApple.getApple());
  }

}
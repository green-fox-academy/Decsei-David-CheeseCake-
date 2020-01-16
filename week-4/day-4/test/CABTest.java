import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;
import org.junit.Test;

public class CABTest {

  @Test
  public void testPlayCAB(){
    CAB newGame = new CAB();

    newGame.playCAB(4000, 4000);
  }

}
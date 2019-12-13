import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AbstractUltra {

  public static void mainDraw(Graphics graphics) {

// ------------------------------------------------------------------------------------------------
    int size = WIDTH / (5 * 2);                                                                 //|
    int[] black = {0, 0, size, size};                                                           //|
    Random random = new Random();                                                               //|
// ------------------------------------------------------------------------------------------------
    for (int i = 0; i < HEIGHT / size; i++) {
      for (int j = 0; j <= WIDTH / size; j++) {
        Color randomColor = new Color(random.nextInt(256), random.nextInt(256),
            random.nextInt(256));
        graphics.setColor(randomColor);
        graphics.fillRect((int) black[0], (int) black[1], (int) black[2],
            (int) black[3]);
        black[0] += size * 2;
      }
      black[0] = 0;
      if (i % 2 == 0) {
        black[0] = size;
        black[1] += size;
      } else {
        black[0] = 0;
        black[1] += size;
      }
    }
  }

  // GF excersises template
  // Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 300;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      AbstractUltra.mainDraw(graphics);
    }
  }
}
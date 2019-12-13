import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class drawPolygon_test {

  public static void mainDraw(Graphics graphics) {
    // draw a red horizontal line to the canvas' middle.
    // draw a green vertical line to the canvas' middle.
//    X=distance*cos(angle) +x0
//    Y=distance*sin(angle) +y0

// x coordinates of vertices
    int[] start = {50, 50, 100, 50};

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 3; j++) {
        graphics.drawLine(start[j], start[j], start[j], start[j]);
        graphics.drawLine(200, 100, (int) (100 * Math.cos(Math.toRadians(60)) + 200),
            (int) (100 * Math.sin(Math.toRadians(60)) + 100));
      }
    }
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

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
      mainDraw(graphics);
    }
  }
}
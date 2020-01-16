import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener {

  private boolean play;
  private int totalBricks = 21;
  // ball speed
  private Timer timer;
  private int delay = 8;
  //player X position
  private int playerX = 310;
  private int playerY = 550;
  //ball starting position
  private int ballPositionX = 120;
  private int ballPositionY = 350;
  //ball direction
  private int ballXdir = -1;
  private int ballYdir = -2;
  //Mapgenerator
  private MapGenerator map;

  public Gameplay() {
    map = new MapGenerator(3, 7);
    addKeyListener(this);
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);
    timer = new Timer(delay, this);
    timer.start();
  }

  // Draw the shapes ------------------------------------------------------------------------------
  public void paint(Graphics g) {
    // background
    g.setColor(Color.BLACK);
    g.fillRect(1, 1, 692, 592);

    //drawing map
    map.draw((Graphics2D) g);

    // borders
    g.setColor(Color.yellow);
    g.fillRect(0, 0, 3, 592);
    g.fillRect(0, 0, 692, 3);
    g.fillRect(691, 0, 3, 592);

    // the paddle
    g.setColor(Color.green);
    g.fillRect(playerX, playerY, 100, 8);

    //ball
    g.setColor(Color.yellow);
    g.fillOval(ballPositionX, ballPositionY, 20, 20);
  }

  //moving/bouncing off the ball -------------------------------------------------------------------
  @Override
  public void actionPerformed(ActionEvent actionEvent) {
    timer.start();
    if (play) {
      // Check if ball reaches the player--------------------------------------
      if (new Rectangle(ballPositionX, ballPositionY, 20, 20)
          .intersects(new Rectangle(playerX, 550, 100, 8))) {
        // If yes, reverse the ball Y moving-------------------------------------
        ballYdir = -ballYdir;
        //---------------------------------------------------------------------
      }

      // Break the bricks --------------------------------------------------------------------------
      A:
      for (int i = 0; i < map.map.length; i++) { //for the length of the MGs map
        for (int j = 0; j < map.map[0].length; j++) { // fot the length of the map[n]
          if (map.map[i][j] > 0) {
            int brickX = j * map.brickWidth + 80;
            int brickY = i * map.brickHeight + 50;
            int brickWidth = map.brickWidth;
            int brickHeight = map.brickHeight;
            //intersection only possible with Rectangle objects-------------------------------------
            Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
            Rectangle ballRect = new Rectangle(ballPositionX, ballPositionY, 20, 20);
            //check intersection from the side------------------------------------------------------
            if (ballRect.intersects(rect)) {
              map.setBrickValue(0, i, j);
              totalBricks--;
              if (ballPositionX + 19 == rect.x || ballPositionX + 19 == rect.width) {
                ballXdir = -ballXdir;
              }
              if (ballPositionY - 19 <= rect.y || ballPositionY + 19 >= rect.height) {
                ballYdir = -ballYdir;
              }
              break A;
            }
          }
        }
      }

      ballPositionX += ballXdir;
      ballPositionY += ballYdir;
      if (ballPositionX < 0) {
        ballXdir = -ballXdir;
      }
      if (ballPositionY < 0) {
        ballYdir = -ballYdir;
      }
      if (ballPositionX > 670) {
        ballXdir = -ballXdir;
      }
    }
    if (totalBricks == 0) {
      System.exit(0);
    }
    repaint();
  }

  //Not needed ------------------------------------------------------------------------------------
  @Override
  public void keyTyped(KeyEvent keyEvent) {
  }

  @Override
  public void keyReleased(KeyEvent keyEvent) {
  }

  //Paddle = Player && check the input and the borders---------------------------------------------
  @Override
  public void keyPressed(KeyEvent keyEvent) {
    if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (playerX >= 585) {
        playerX = 585;
      } else {
        moveRight();
      }
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
      if (playerX <= 10) {
        playerX = 10;
      } else {
        moveLeft();
      }
    }
  }

  //Move the player--------------------------------------------------------------------------------
  public void moveRight() {
    play = true;
    playerX += 20;
  }

  public void moveLeft() {
    play = true;
    playerX -= 20;
  }

}



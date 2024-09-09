import org.code.neighborhood.*;
public class PainterPlus extends Painter {

  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  public void moveFast() {
    while(canMove()) {
      move();
    }
  }
  
  
  public void takeAllPaint() {
  while(isOnBucket()) {
    takePaint();
  }
}

  public void paintToEmpty(String color) {
    while(hasPaint()) {
      paint("white");
      move();
    }
  }

  public void paintDonut(String color) {
    while (hasPaint()) {
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      
    }
  }
}
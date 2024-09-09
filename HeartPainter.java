import org.code.neighborhood.*;

public class HeartPainter extends MuralPainter {

public HeartPainter () {
  
}

public void paintHeart(String mainColor) {

//Three methods for startPosition
  startPosition();
  paintTop(mainColor);
  paintBody(mainColor);
  paintBottom(mainColor);
  
}

  
public void startPosition() {
  move();
  
}
//Paints the main top lines for the heart
public void paintTop(String mainColor) {
  paintLine(mainColor, 2);
  move();
  move();
  paintLine(mainColor, 2);
  turnToWest();
}
//Paints the body for the heart. 4 length, 8 width, 4 times
public void paintBody(String mainColor) {
  paintLine(mainColor, 1);
  paintLine(mainColor,7);
  turnLeft();
  move();
  turnToWest();
  turnLeft();
  paintLine(mainColor, 8);
  turnRight();
  move();
  turnRight();
  paintLine(mainColor, 8);
  turnLeft();
  move();
  turnLeft();
  paintLine(mainColor, 8);
  turnRight();
  move();
}
//Paints the bottom lines of the heart, 6 lines of paint, then 4 lines of paint, then 2 lines of paint to evenly make a heart
public void paintBottom(String mainColor) {
  turnRight();
  move();
  paintLine(mainColor, 6);
  turnLeft();
  move();
  turnLeft();
  move();
  move();
  paintLine(mainColor, 4);
  moveToCorner();
  turnRight();
  move();
  move(); 
  move();
  paintLine(mainColor,2);
}
}


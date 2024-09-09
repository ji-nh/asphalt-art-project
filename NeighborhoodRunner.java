import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

//Makes the mural background white
MuralPainter mp = new MuralPainter();
    mp.paintBackground("white", 13);

//Instantiation
    HeartPainter hp = new HeartPainter();

//Inputs paintHeart and moveToCorner Method
    hp.paintHeart("blue");

    hp.moveToCorner();

    
  }
}
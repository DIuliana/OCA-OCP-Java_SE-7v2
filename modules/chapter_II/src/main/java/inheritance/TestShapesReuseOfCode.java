package inheritance;

/**
 * Chapter II: Object Orientation
 *
 * SubChapter 2:Inheritance and Polymorphism
 *
 * Inheritance-> scope:reuse of code
 *
 */

    class GameShape{

        public void displayShape(){
            System.out.println("displaying shape");
        }
    }

    class PlayerPiece extends  GameShape{

        public void movePiece(){
            System.out.println("moving game piece");
        }
    }

public class TestShapesReuseOfCode {

    public  static void  main(String[] args){

        PlayerPiece playerPiece=new PlayerPiece();

        playerPiece.displayShape();
        playerPiece.movePiece();
    }
}

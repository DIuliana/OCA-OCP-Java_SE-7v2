package inheritance;
/**
 * Chapter II: Object Orientation
 *
 * SubChapter 2:Inheritance and Polymorphism
 *
 * Inheritance-> scope: polymorphism
 *
 */

class AnotherGameShape
{

    public void displayShape()
    {

        System.out.println("displaying shape");
    }
}

class AnotherPlayerPiece extends AnotherGameShape
{
    public void movePiece()
    {

        System.out.println("moving game piece");
    }

}

class TilePiece extends AnotherGameShape
{

    public void getAdjacent()
    {

        System.out.println("getting adjacent tiles");
    }
}

public class TestShapesPolymorphism
{

    public static void main(String[] args)
    {
        AnotherPlayerPiece player = new AnotherPlayerPiece();

        TilePiece tile = new TilePiece();


        doShapes(player);
        doShapes(tile);


    }

    public static void doShapes(AnotherGameShape anotherGameShape)
    {
        anotherGameShape.displayShape();
    }
}

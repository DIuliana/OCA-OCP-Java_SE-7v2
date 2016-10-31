package poly;

/**
 * Chapter II: Object Orientation
 *
 * SubChapter 3:Polymorphism
 *
 */
public class PlayerPiece extends GameShape implements Animable
{
    public void animate()
    {
        System.out.println("animating player piece");
    }

    public void movingPiece()
    {

        System.out.println("moving game piece");
    }
}

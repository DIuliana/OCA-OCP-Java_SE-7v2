package poly;

/**
 * Created by p3700639 on 10/28/2016.
 */
public class MainClass
{

    public static void main(String[] args)
    {

        PlayerPiece playerPiece = new PlayerPiece();

        Object o = playerPiece;
        GameShape gameShape = playerPiece;
        // PlayerPiece Object is being referred to a reference of Animable
        Animable animable = playerPiece;

        animable.animate();
    }
}

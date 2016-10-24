package sub3.testprotected;

import sub3.declarations.Bounceable;

/**
 * Chapter I: Declaration and Data Access
 *
 * SubChapter 3:Use Interfaces
 *
 * SubSubChapter1: Declaring an Interface
 *
 */
public class Ball implements Bounceable// Bouceable has public access, so this
                                       // class, which is outside its package
                                       // can implement it
{
    public void bouce()
    {
        System.out.println("I am a bounceable outside package ball!");
    }

    public void setBouceFactor(int bf)
    {

    }
}

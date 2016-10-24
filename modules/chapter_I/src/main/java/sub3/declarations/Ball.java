package sub3.declarations;

/**
 * Created by p3700639 on 10/24/2016.
 */

/**
 * Chapter I: Declaration and Data Access
 *
 * SubChapter 3:Use Interfaces
 *
 * SubSubChapter1: Declaring an Interface
 *
 */
public class Ball implements DefaultAccessBounceable
{
    public void bouce()
    {
        System.out.println("I am a bounceable package ball! ");
    }

    public void setBouceFactor(int bf)
    {

        bf = 1;
    }
}

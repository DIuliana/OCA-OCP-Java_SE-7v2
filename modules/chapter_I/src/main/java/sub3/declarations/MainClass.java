package sub3.declarations;


/**
 * Chapter I: Declaration and Data Access
 *
 * SubChapter 3:Use Interfaces
 *
 * SubSubChapter1: Declaring an Interface
 *
 */
public class MainClass {

    public static void main(String ...args){

        Ball packageBall=new Ball();
        packageBall.bouce();

        sub3.testprotected.Ball  outPackageBall= new sub3.testprotected.Ball();
        outPackageBall.bouce();

    }
}

package sub3.declarations;

/**
 * Chapter I: Declaration and Data Access
 *
 * SubChapter 3:Use Interfaces
 *
 * SubSubChapter2: Declaring Interface Constants
 *
 */
public class Zap implements Foo {

    public void go() {
        //compilation FAILURE, cannot change a constant value
       // BAR=2;
        System.out.print("Bar from go from implementing class: "+ BAR);
    }
}

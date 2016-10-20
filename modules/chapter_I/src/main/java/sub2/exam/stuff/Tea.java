package sub2.exam.stuff;

import sub2.cert.Beverage;

/**
 * Chapter I: Declaration and Data Access
 *
 * SubChapter 2:Define Classes
 *
 * SubSubChapter6: Class Declaration and Modifiers
 *
 */
public class Tea extends Beverage{

    public Tea(){
        System.out.println("I am an Tea");
    }
}
//Errors: try to access(through inheritance) class with default access modifier: sub2.cert.Beverage is not public in sub2.cert; cannot be accessed from outside package
        //try to access(through inheritance) class with final modifier           Tea.java:[5,26] cannot inherit from final sub2.cert.Beverage

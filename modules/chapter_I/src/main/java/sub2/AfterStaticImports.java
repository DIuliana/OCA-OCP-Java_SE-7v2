package sub2;

//we can import the static members one by one
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.toHexString;

//or we can import all the static members
import static java.lang.Integer.*;

import static java.lang.System.out;

/**
 * Chapter I: Declaration and Data Access
 *
 * SubChapter 2:Define Classes
 *
 * SubSubChapter5: Static Import Statement
 *
 */
public class AfterStaticImports {

    static public void main(String lala[]){

        out.println(MAX_VALUE);
        out.println(toHexString(42));
    }
}

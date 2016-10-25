package sub4.methodaccessmodifiers;

/**
 * Chapter I: Declaration and Data Access
 *
 * SubChapter 4:Declare Class Members
 *
 * SubSubChapter1: Access Modifiers
 *
 */
public class Bear
{

    public  Bear() {
    }

    public void publicMethod()
    {

        System.out.println("public method");

    }

    protected void protectedMethod()
    {

        System.out.println("protected method");
    }

    void defaultMethod()
    {
        System.out.println("default method");
    }

    private void privateMethod()
    {
        System.out.println("private method");
    }

}

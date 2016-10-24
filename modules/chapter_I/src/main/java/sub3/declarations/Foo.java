package sub3.declarations;

/**
 * Chapter I: Declaration and Data Access
 *
 * SubChapter 3:Use Interfaces
 *
 * SubSubChapter2: Declaring Interface Constants
 *
 *  EXAM WATCH!
 */
public interface Foo
{
    public static final int BAR = 42;// redundant public static final
                                     // declaration, because member variables
                                     // are CONSTANTS ONLY in an INTERFACE and
                                     // these modifiers are deault

    void go();
}

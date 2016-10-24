package sub3.declarations;

/**
 * Chapter I: Declaration and Data Access
 *
 * SubChapter 3:Use Interfaces
 *
 * SubSubChapter1: Declaring an Interface
 *
 */
 public abstract interface Bounceable {//redundant abstract modifier->an interface is abstract by default

    abstract void bouce();//redundant abstract modifier
    public void setBouceFactor(int bf);//redundant public access modifier

    // ->all interface modifiers are abstract and public by default

}

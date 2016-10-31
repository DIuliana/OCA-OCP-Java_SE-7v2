package override;

/**
 * Created by p3700639 on 10/27/2016.
 */
public class MainClass
{

    public static void main(String[] args)
    {

        Animal animal = new Horse();
        Animal animal1 = new Animal();

        // animal reference to invoke a method on Horse object
        // even if reference is of type Animal, JVM, at runtime, knows what
        // method to call, in the inheritance tree->which is eat() from Horse
        animal.eat();

        // buck method is not in Animal class-> The compiler looks only at the
        // REFERENCED type, NOT the INSTANCE type


        // animal.buck();->illegal
        animal1.eat();

    }
}

package sub2;

/**
 * Chapter I: Declaration and Data Access
 *
 * SubChapter 2:Define Classes
 *
 * SubSubChapter6: Class Declaration and Modifiers
 *
 */
abstract class Car {
    private double price;
    private double model;
    private double year;

    public abstract void goFast();
    public abstract void goUpHill();
    public abstract void impressNeightbors();


}
//Car car =new Car(); Errors about trying to instantiate an abstract class: sub2.Car is abstract; cannot be instantiated

//if the class contains a single abstract method, then the class MUST be abstract

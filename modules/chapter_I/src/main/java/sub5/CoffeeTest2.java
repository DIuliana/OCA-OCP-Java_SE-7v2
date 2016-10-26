package sub5;

/**
 * Chapter I: Declaration and Data Access
 * <p>
 * SubChapter 5:Declare and Use Enums
 */

class Coffee2 {
    CoffeeSize size;

    enum CoffeeSize {
        BIG, HUGE, OVERWHELMING
    }

}

public class CoffeeTest2 {

    public static void main(String[] args) {
        Coffee2 drink = new Coffee2();

        drink.size = Coffee2.CoffeeSize.HUGE;

        System.out.println(drink.size);
    }
}

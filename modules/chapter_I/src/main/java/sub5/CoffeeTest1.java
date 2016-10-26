package sub5;

/**
 * Chapter I: Declaration and Data Access
 *
 * SubChapter 5:Declare and Use Enums
 *
 *
 */

class Coffee
{
    CoffeeSize size;
}

enum CoffeeSize
{
    BIG, HUGE, OVERWHELMING
}

public class CoffeeTest1
{
    public static void main(String[] args)
    {

        Coffee drink = new Coffee();
        drink.size = CoffeeSize.BIG;
        System.out.println(drink.size);
    }

}

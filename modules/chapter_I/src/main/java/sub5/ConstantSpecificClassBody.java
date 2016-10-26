package sub5;

/**
 * Chapter I: Declaration and Data Access
 *
 * SubChapter 5:Declare and Use Enums
 *
 *
 */

enum CoffeeSize3
{

    BIG(8), HUGE(10), OVERWHELMING(16)
    {

        public String getLidCode()// override the getLidCode() method from
                                  // CoffeeSize3
        {
            return "A";
        }
    };

    public String getLidCode()
    {
        return "B";
    }

    private int ounces;

    public int getOunces()// this method is overridden
    {
        return ounces;
    }

    CoffeeSize3(int ounces)
    {
        this.ounces = ounces;
    }

}

class SuperMagicCoffee
{

    CoffeeSize3 size3;
}

public class ConstantSpecificClassBody
{

    public static void main(String[] args)
    {

        SuperMagicCoffee drink = new SuperMagicCoffee();
        drink.size3 = CoffeeSize3.OVERWHELMING;

        System.out.println(drink.size3+" "+drink.size3.getLidCode());

        SuperMagicCoffee drink2 = new SuperMagicCoffee();
        drink2.size3 = CoffeeSize3.BIG;

        System.out.println(drink2.size3+" "+drink2.size3.getLidCode());
    }

}

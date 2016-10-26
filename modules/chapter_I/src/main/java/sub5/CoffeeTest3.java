package sub5;

/**
 * Chapter I: Declaration and Data Access
 *
 * SubChapter 5:Declare and Use Enums
 *
 *
 */

enum CoffeeSize2
{
    BIG(2), Huge(10), OVERWHELMING(16);

    private int ounces;

    CoffeeSize2(int ounces)
    {
        this.ounces = ounces;
    }

    public int getOunces()
    {
        return ounces;
    }

}

class MagicCoffee{

    CoffeeSize2 size2;//each instance of MagicCoffee has an enum

    public static void main(String[] args){

        MagicCoffee drink1=new MagicCoffee();
        drink1.size2=CoffeeSize2.BIG;

        MagicCoffee drink2=new MagicCoffee();
        drink2.size2=CoffeeSize2.OVERWHELMING;

        System.out.println(drink1.size2.getOunces());

        //list all coffee sizes with their corresponding ounce value
        for(CoffeeSize2 coffeeSizes:CoffeeSize2.values()){
            System.out.println(coffeeSizes+" "+coffeeSizes.getOunces());
        }
    }



}

public class CoffeeTest3
{
}

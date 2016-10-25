package sub4.methodaccessmodifiers;

import sub4.otherpackage.PandaBear;

/**
 * Created by p3700639 on 10/24/2016.
 */
public class MainClass {


    public static void main(String ...args){

        BabyBear babyBear=new BabyBear();
        babyBear.lala();
      /*  babyBear.publicMethod();
        babyBear.protectedMethod();
        babyBear.defaultMethod();*/


        PandaBear pandaBear=new PandaBear();
        pandaBear.publicMethod();
        pandaBear.protectedMethod();
        //no default access because Panda is in another package


        Car mini=new Mini();
        System.out.println(mini.getType());

        mini.goUpHill();
        mini.doCarThings();
       System.out.println(mini.getType());
    }
}

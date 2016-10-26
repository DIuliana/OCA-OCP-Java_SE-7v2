package sub4.methodaccessmodifiers;

/**
 * Created by p3700639 on 10/25/2016.
 */
public class Mini extends Car {

    public void goUpHill() {

       System.out.println("i am a mini and i go uphill");
    }

    public void doCarThings(){
        super.doCarThings();

        System.out.println("i am a mini and i do car things");
    }

    public String getType(){

       return  super.getType();
    }

}

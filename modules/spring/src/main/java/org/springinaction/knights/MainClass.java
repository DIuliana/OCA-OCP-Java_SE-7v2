package org.springinaction.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by p3700639 on 10/21/2016.
 */
public class MainClass
{

    public static void main(String args[])
    {

       /* Quest quest=new SlayDragonQuest();

        BraveKnight braveKnight =new BraveKnight(quest);
        braveKnight.embarkOnQuest();*/


        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/knights.xml");

        Knight knight=context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();

    }


}

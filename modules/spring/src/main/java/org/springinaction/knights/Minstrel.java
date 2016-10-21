package org.springinaction.knights;

import java.io.PrintStream;

/**
 * Created by p3700639 on 10/21/2016.
 */
public class Minstrel
{

    PrintStream stream;

    public Minstrel(PrintStream stream)
    {
        this.stream = stream;
    }

    public void singBeforeQuest()
    {

        stream.println("singing before quest");
    }

    public void singAfterQuest()
    {
        stream.println("singing after quest");

    }

}

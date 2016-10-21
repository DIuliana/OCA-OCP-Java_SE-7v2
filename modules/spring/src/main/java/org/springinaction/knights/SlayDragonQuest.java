package org.springinaction.knights;

import java.io.PrintStream;

/**
 * Created by p3700639 on 10/21/2016.
 */
public class SlayDragonQuest implements Quest
{

    PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream)
    {
        this.printStream = printStream;
    }

    public void embark()
    {
       printStream.println("Embark on  slay dragon quest!");
    }
}

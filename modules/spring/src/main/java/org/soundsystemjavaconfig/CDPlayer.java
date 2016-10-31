package org.soundsystemjavaconfig;

import org.soundsystem.*;
import org.springframework.context.annotation.Configuration;

/**
 * Created by p3700639 on 10/31/2016.
 */

public class CDPlayer
{

    private CompactDisc cd;

    public CDPlayer(CompactDisc cd)
    {
        this.cd = cd;
    }

    public void play(){

        cd.play();
    }
}

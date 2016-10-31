package org.soundsystemjavaconfig;

import org.soundsystem.*;

/**
 * Created by p3700639 on 10/31/2016.
 */
public class SgtPeppers implements org.soundsystemjavaconfig.CompactDisc
{

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play()
    {
        System.out.println("Playing " + title + " by " + artist);
    }
}

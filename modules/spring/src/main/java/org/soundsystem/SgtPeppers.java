package org.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Part I: Core Spring 2. Wiring beans
 *
 * 2.2.1 Automatically wiring beans
 *
 */

@Component("lovelyBeanName")// or @Named("lovelyBeanName")
public class SgtPeppers implements CompactDisc
{

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play()
    {
        System.out.println("Playing " + title + " by " + artist);

    }
}

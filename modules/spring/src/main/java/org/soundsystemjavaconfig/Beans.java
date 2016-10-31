package org.soundsystemjavaconfig;

import org.springframework.context.annotation.Bean;

/**
 * Created by p3700639 on 10/31/2016.
 */
public class Beans
{
    // fist way with a @Bean method

    @Bean // this annotation tells Spring that this method will return an object
          // that should be registered as a bean in the Spring Context
    public CompactDisc sgtPeppers()
    {

        return new SgtPeppers();
    }

    // Spring intercepts the call to sgtPeppers() and makes sure that what is
    // returned is the Spring bean that was created when Spring itself called
    // sgtPeppers() to create the CompactDisc bean.Therefore, both CDPlayer
    // beans will be given the same instance of SgtPeppers.
    @Bean
    public CDPlayer cdPlayer()
    {

        return new CDPlayer(sgtPeppers());
    }

    @Bean
    public CDPlayer anotherCDPlayer()
    {
        return new CDPlayer(sgtPeppers());
    }

    // or

    // Here, the cdPlayer() method asks for a CompactDisc as a parameter. When
    // Spring
    // calls cdPlayer() to create the CDPlayer bean, it autowires a CompactDisc
    // into the
    // configuration method.
    // With this technique, the cdPlayer() method can still inject the
    // CompactDisc into the
    // CDPlayer’s constructor without explicitly referring to the CompactDisc’s
    // @Bean
    // method.
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc)
    {
        return new CDPlayer(compactDisc);
    }

}

package org.springinaction.knights;

/**
 * Part I: Core Spring 1. Spring into action
 *
 * 1.1.2 Injecting dependencies
 *
 */
public class RescueDamselQuest implements Quest
{

    public RescueDamselQuest()
    {
        System.out.println("I am a rescue damsel quest!");
    }

    public void embark()
    {
        System.out.println("Embark on  rescue damsel quest!");
    }
}

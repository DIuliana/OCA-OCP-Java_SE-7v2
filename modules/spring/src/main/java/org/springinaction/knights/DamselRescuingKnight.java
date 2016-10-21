package org.springinaction.knights;

/**
 * Part I: Core Spring 1. Spring into action
 *
 * 1.1.2 Injecting dependencies
 *
 */
public class DamselRescuingKnight implements Knight
{

    private RescueDamselQuest quest;

    public DamselRescuingKnight()
    {

        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest()
    {
        quest.embark();
    }
    
}

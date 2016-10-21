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

    //as we can see DamselRescuingKnight creates its own quest, a RescueDamselQuest in its constructor.
    //this makes a DamselRescuingKnight  tightly coupled to a RescueDamselQuest and severely limits the knight's quest-embarking repertoire.
    //if a damsel needs rescuing, this knight's there, but if a dragon needs slaying or a round table needs something, then this knight's going to gave to sit out.
}

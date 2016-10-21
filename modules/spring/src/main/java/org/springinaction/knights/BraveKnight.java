package org.springinaction.knights;

/**
 * Created by p3700639 on 10/21/2016.
 */
public class BraveKnight implements Knight
{

    Quest quest;

    public BraveKnight(Quest quest)
    {
        this.quest = quest;
    }

    public void embarkOnQuest()
    {
        quest.embark();
    }
}

package org.springinaction.knights;

/**
 * Created by p3700639 on 10/21/2016.
 */
public class BraveKnight implements Knight
{

    Quest quest;
    Minstrel minstrel;

    public BraveKnight(Quest quest, Minstrel minstrel)
    {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    public void embarkOnQuest()
    {
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }
}

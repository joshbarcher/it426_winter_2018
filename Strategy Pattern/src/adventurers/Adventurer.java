package adventurers;

import flaws.IFlaw;
import personality.IPersonality;

public class Adventurer
{
    //store strategies for adventurer behavior
    private IFlaw flaw;
    private IPersonality personality;

    public Adventurer(IFlaw flaw, IPersonality personality)
    {
        this.flaw = flaw;
        this.personality = personality;
    }

    public void interact()
    {
        //interact with the adventurer
        personality.act();
        flaw.exposeFlaw();
    }

    public IFlaw getFlaw()
    {
        return flaw;
    }

    public IPersonality getPersonality()
    {
        return personality;
    }
}

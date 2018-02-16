package adventurers;

import flaws.IFlaw;
import goals.IGoal;
import personality.IPersonality;

public class GoalOrientedAdventurer extends Adventurer
{
    private IGoal goal;

    public GoalOrientedAdventurer(IFlaw flaw, IPersonality personality, IGoal goal)
    {
        super(flaw, personality);

        this.goal = goal;
    }

    public void interact()
    {
        super.interact();

        goal.accomplishGoal();
    }
}

package adventurers;

import flaws.Clumsy;
import flaws.Dishonest;
import goals.GatherPlunder;
import personality.Boasting;
import personality.Oblivious;
import personality.Pragmatic;

public class TestAdventurer
{
    public static void main(String[] args)
    {
        Adventurer john = new Adventurer(new Clumsy(), new Pragmatic());
        john.interact();

        john = new Adventurer(new Clumsy(), new Oblivious());
        john.interact();

        john = new GoalOrientedAdventurer(new Dishonest(), new Oblivious(), new GatherPlunder());
        john.interact();
    }
}

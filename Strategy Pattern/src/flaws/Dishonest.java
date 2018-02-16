package flaws;

public class Dishonest implements IFlaw
{
    @Override
    public void exposeFlaw()
    {
        System.out.println("Oops, did I say that?!?!");
    }
}

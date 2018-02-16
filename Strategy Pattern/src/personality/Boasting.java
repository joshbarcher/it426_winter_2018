package personality;

public class Boasting implements IPersonality
{
    @Override
    public void act()
    {
        System.out.println("I am the best ever, no seriously...");
    }
}

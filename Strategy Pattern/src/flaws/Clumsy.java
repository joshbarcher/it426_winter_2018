package flaws;

public class Clumsy implements IFlaw
{
    @Override
    public void exposeFlaw()
    {
        System.out.println("Oops, I stumbled over that rock...");
    }
}

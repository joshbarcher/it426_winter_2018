package facade;

import facade.Facade.VerifyType;

public class TestFacade
{
    public static void main(String[] args)
    {
        String[] colors = {"green", "burgundy", "purple", "burgundy", "burgundy",
                           "magenta", "cyan", "cyan"};

        colors = Facade.operate(colors)
                       .filter("green")
                       .removeDuplicates()
                       .resize(3)
                       .getData();

        boolean isEmail = Facade.verify("e@e.com", VerifyType.EMAIL);
    }
}

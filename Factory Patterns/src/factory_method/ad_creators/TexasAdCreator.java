package factory_method.ad_creators;

import java.util.Arrays;
import java.util.List;

public class TexasAdCreator implements IAdCreator
{
    @Override
    public List<String> provideAds()
    {
        return Arrays.asList("Country music!", "Come BBQ with us!",
                             "We know the queso", "Nothing as flat as Texas");
    }
}

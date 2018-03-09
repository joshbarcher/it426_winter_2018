package factory_method.ad_server;

import factory_method.ad_creators.IAdCreator;

import java.util.List;
import java.util.Random;

public abstract class AdServer
{
    private Random random = new Random();
    private List<String> ads;

    public AdServer()
    {

    }

    public abstract IAdCreator getAdCreator();

    public String provideSingleAd()
    {
        IAdCreator creator = getAdCreator();
        List<String> ads = creator.provideAds();

        return ads.get(random.nextInt(ads.size()));
    }
}

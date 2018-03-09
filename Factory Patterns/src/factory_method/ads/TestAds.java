package factory_method.ads;

import factory_method.ad_server.AdServer;
import factory_method.ad_server.TexasAdServer;

public class TestAds
{
    public static void main(String[] args)
    {
        AdServer server = new TexasAdServer();
        String ad = server.provideSingleAd();
        System.out.println(ad);
    }
}

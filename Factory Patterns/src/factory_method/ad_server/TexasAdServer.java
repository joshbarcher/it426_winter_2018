package factory_method.ad_server;

import factory_method.ad_creators.IAdCreator;
import factory_method.ad_creators.TexasAdCreator;

public class TexasAdServer extends AdServer
{
    @Override
    public IAdCreator getAdCreator()
    {
        return new TexasAdCreator();
    }
}

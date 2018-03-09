package factory_method.ad_server;

import factory_method.ad_creators.FloridaAdCreator;
import factory_method.ad_creators.IAdCreator;

public class FloridaAdServer extends AdServer
{
    @Override
    public IAdCreator getAdCreator()
    {
        return new FloridaAdCreator();
    }
}

package adapters;

import athletes.BasketballPlayer;
import news.IAthlete;

public class BasketballPlayerAdapter implements IAthlete
{
    private BasketballPlayer player;

    public BasketballPlayerAdapter(BasketballPlayer player)
    {
        this.player = player;
    }

    @Override
    public String getName()
    {
        return getStat("name");
    }

    private String getStat(String stat)
    {
        try
        {
            Object name = player.getStat(stat);
            if (name == null)
            {
                return "unknown";
            }
            return name.toString();
        }
        catch (Exception ex)
        {
            throw new IllegalStateException(
                    "Something went wrong when retrieving " + stat);
        }
    }

    @Override
    public String getSport()
    {
        return "basketball";
    }

    @Override
    public double getAvgScore()
    {
        return getDoubleStat("avg score", Double.MAX_VALUE);
    }

    private double getDoubleStat(String stat, double defaultValue)
    {
        String avgScore = getStat(stat);
        if (avgScore.equals("unknown"))
        {
            return defaultValue;
        }
        return Double.parseDouble(avgScore);
    }

    @Override
    public int getAge()
    {
        return (int)getDoubleStat("age", -1);
    }
}

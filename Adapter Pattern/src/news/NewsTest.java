package news;

import adapters.BasketballPlayerAdapter;
import athletes.BasketballPlayer;

public class NewsTest
{
    public static void main(String[] args)
    {
        BasketballPlayer player = new BasketballPlayer();
        player.addStat("name", "Michael Jordan");
        player.addStat("age", 35);
        player.addStat("avg score", 30);

        BasketballPlayerAdapter adapter = new BasketballPlayerAdapter(player);

        News news = new News();
        news.printAthlete(adapter);
    }
}

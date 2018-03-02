package athletes;

import java.util.HashMap;
import java.util.Map;

public class BasketballPlayer {
    private Map<String, Object> stats;

    // name
    // height
    // games played
    // points per game

    public BasketballPlayer() {
        stats = new HashMap<String, Object>();
    }

    public void addStat(String statName, Object statValue) {
        stats.put(statName, statValue);
    }

    public Object getStat(String statName) throws Exception {
        return stats.get(statName);
    }

    public static void main(String[] args) {
        BasketballPlayer player = new BasketballPlayer();
        player.addStat("name", "Michael Jordan");
        player.addStat("height", new Double(6.5));
        player.addStat("games_played", new Integer(100));
        player.addStat("points_per_game", new Integer(25));

    }
}
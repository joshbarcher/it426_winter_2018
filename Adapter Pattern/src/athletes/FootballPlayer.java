package athletes;
import java.util.Map;
import java.util.Set;

public class FootballPlayer {


    //fields
    private String name;
    private String team;
    private String posistion;
    private int playerNumber;
    private Map<String, String> statsMap;


    public FootballPlayer(String name, String team, String posistion, int playerNumber, Map<String, String> statsMap) {
        this.name = name;
        this.team = team;
        this.posistion = posistion;
        this.playerNumber = playerNumber;
        this.statsMap = statsMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosistion() {
        return posistion;
    }

    public void setPosistion(String posistion) {
        this.posistion = posistion;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public Map<String, String> getStatsMap() {
        return statsMap;
    }

    public void setStatsMap(Map<String, String> statsMap) {
        this.statsMap = statsMap;
    }

}
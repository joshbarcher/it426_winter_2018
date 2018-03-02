package athletes;
public class SoccerPlayer {
    private String name;
    private int goalsPerGame;
    private String position;
    private String clubName;

    public SoccerPlayer(String name, int goalsPerGame, String position, String clubName) {
        this.name = name;
        this.goalsPerGame = goalsPerGame;
        this.position = position;
        this.clubName = clubName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoalsPerGame() {
        return goalsPerGame;
    }

    public void setGoalsPerGame(int goalsPerGame) {
        this.goalsPerGame = goalsPerGame;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
}

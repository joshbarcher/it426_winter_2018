package employee_evaluations.rankings;

public class RankedReview implements Comparable<RankedReview>
{
    private String name;
    private int score;

    public RankedReview(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    public String getName()
    {
        return name;
    }

    public int getScore()
    {
        return score;
    }

    //ranked reviews are sorted descending by score
    public int compareTo(RankedReview other)
    {
        return other.score - this.score;
    }
}
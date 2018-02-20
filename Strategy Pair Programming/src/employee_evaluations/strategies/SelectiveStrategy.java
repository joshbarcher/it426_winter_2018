package employee_evaluations.strategies;

import employee_evaluations.rankings.Review;

import java.util.List;

public class SelectiveStrategy implements IStrategy
{
    @Override
    public int getScore(List<Review> reviews, int year)
    {
        //look at each review
        for (Review review : reviews)
        {
            if (review.getYear() == year)
            {
                //sum the kpis
                int[] kpis = review.getKpis();
                return kpis[0] + kpis[2] + kpis[3];
            }
        }
        return 0;
    }
}
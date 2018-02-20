package employee_evaluations.strategies;

import employee_evaluations.rankings.Review;

import java.util.List;

public class TotalStrategy implements IStrategy
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
                int total = 0;

                for (int kpi : review.getKpis())
                {
                    total += kpi;
                }

                return total;
            }
        }
        return 0;
    }
}

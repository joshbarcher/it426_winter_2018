package employee_evaluations.strategies;

import employee_evaluations.rankings.Review;

import java.util.List;

public class WeightedStrategy implements IStrategy
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
                int[] kpis = review.getKpis();

                for (int i = 0; i < kpis.length; i++)
                {
                    double weight = 1.0;
                    if (i == 1)
                    {
                        weight = 2.0;
                    }
                    else if (i == 3)
                    {
                        weight = 3.0;
                    }
                    total += weight * kpis[i];
                }

                return total;
            }
        }
        return 0;
    }
}
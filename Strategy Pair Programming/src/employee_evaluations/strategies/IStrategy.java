package employee_evaluations.strategies;

import employee_evaluations.rankings.Review;

import java.util.List;

public interface IStrategy
{
    public int getScore(List<Review> reviews, int year);
}
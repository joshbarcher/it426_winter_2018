package employee_evaluations.rankings;

import employee_evaluations.strategies.IStrategy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

//provides access to a list of employee names and yearly reviews
public class RankingsCalculator
{
	//all employee names (last names omitted)
	private Set<String> names;

	//a mapping of names to yearly reviews
	private Map<String, List<Review>> yearlyReviews;

	public RankingsCalculator()
	{
		names = new HashSet<>();
		yearlyReviews = new HashMap<>();

		loadData();
	}

	public void printRankings(IStrategy strategy, int year)
    {
		//create a ranked list of employee reviews
		List<RankedReview> rankedList = new ArrayList<>();

		for (String name : names)
		{
		    //get the score
			List<Review> reviews = yearlyReviews.get(name);
			int score = strategy.getScore(reviews, year);

			//generate a ranked review and save it
			RankedReview rankedReview = new RankedReview(name, score);
			rankedList.add(rankedReview);
		}

		//sort our results
		RankedReview[] rankedReviews = rankedList.toArray(
				new RankedReview[rankedList.size()]);
		Arrays.sort(rankedReviews);

		//print out the ranked list
		for (int i = 0; i < rankedReviews.length; i++)
		{
			System.out.println(rankedReviews[i].getName() + ": " + rankedReviews[i].getScore());
		}
	}

	//loads fictitious data from a text file
	private void loadData()
	{
		try(Scanner reader = new Scanner(new FileInputStream("files/reviews.txt")))
		{
			//for each review in the file
			while (reader.hasNextLine())
			{
				String line = reader.nextLine();

				//retrieve each part of the review
				String[] parts = line.split(", ");
				String name = parts[0];
				int year = Integer.parseInt(parts[1]);
				int[] kpis = new int[parts.length - 2];

				//parse out the key performance indicators
				for (int i = 0; i < kpis.length; i++)
				{
					kpis[i] = Integer.parseInt(parts[i + 2]);
				}

				//record the name encountered
				names.add(name);

				//add the review
				if (!yearlyReviews.containsKey(name))
				{
					yearlyReviews.put(name, new ArrayList<>());
				}
				yearlyReviews.get(name).add(new Review(name, year, kpis));
			}
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("Write error: " + ex.getMessage());
		}
	}
}

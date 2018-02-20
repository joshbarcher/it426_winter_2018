package employee_evaluations.rankings;

import java.util.Arrays;

//represents an employee review
public class Review
{
	//the name of the employee
	private String name;

	//the year the review was entered
	private int year;

	//a group of scores for key performance indicators
	private int[] kpis;
	
	public Review(String name, int year, int[] kpis)
	{
		this.name = name;
		this.year = year;
		this.kpis = kpis;
	}

	public String getName()
	{
		return name;
	}

	public int getYear()
	{
		return year;
	}

	public int[] getKpis()
	{
		return kpis;
	}

	@Override
	public String toString()
	{
		return "Review [name=" + name + ", year=" + year + ", kpis="
				+ Arrays.toString(kpis) + "]";
	}
}

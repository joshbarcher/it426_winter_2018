package employee_evaluations.rankings;

import employee_evaluations.strategies.IStrategy;
import employee_evaluations.strategies.SelectiveStrategy;
import employee_evaluations.strategies.TotalStrategy;
import employee_evaluations.strategies.WeightedStrategy;

public class ReportingConsoleApp
{
    public static void main(String[] args)
    {
        Console console = new Console();

        //user prompt
        System.out.println("Welcome to the Employee Rankings Application");
        System.out.println("********************************************");
        System.out.println("Please select a strategy\n1. Total\n2. Weighted\n3. Selective");

        int choice = console.getInt();

        IStrategy strategy = null;
        switch(choice)
        {
            case 1:
                strategy = new TotalStrategy();
                break;
            case 2:
                strategy = new WeightedStrategy();
                break;
            case 3:
                strategy = new SelectiveStrategy();
                break;
            default:
                System.out.println("Input not recognized");
                return;
        }

        RankingsCalculator calculator = new RankingsCalculator();
        calculator.printRankings(strategy, 2017);
    }
}

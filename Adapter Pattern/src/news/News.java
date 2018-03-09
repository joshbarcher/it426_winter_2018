package news;

/*
 * Designing a class for an athlete
 * basketball, football, soccer
 *
 * Newspaper for like ESPN
 * Be able to print out the statistics for these athletes
 *
 * A news class that accepts athletes that will print out the statistics.
 *
 * Interface for what every athlete could say about themselves.
 *
 * Name, stats (how they are going to give statistics)
 *
 * Accept an interface for these stats
 *
 * IAthlete
 *   Program in the class to print the class and statistics data
 */
public class News {
    public void printAthlete(IAthlete athlete) {
        String athleteToString = "Name: " + athlete.getName() +
                "\nSport: " + athlete.getSport() +
                "\nAverage Score: " + athlete.getAvgScore() +
                "\nAge: " + athlete.getAge();
        System.out.println(athleteToString);
    }
}
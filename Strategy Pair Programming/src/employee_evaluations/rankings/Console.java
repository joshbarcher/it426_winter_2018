package employee_evaluations.rankings;

import java.util.Scanner;

/**
 * Helper class for reading and writing to the Java console.
 *
 * @author Josh Archer
 * @version 1.0
 */
public class Console
{
    private Scanner console = new Scanner(System.in);

    /**
     * Prints a message to the Java console.
     *
     * @param message the message to be printed
     */
    public void print(String message)
    {
        System.out.println(message);
    }

    /**
     * Prompts the user and returns a String value from the Java console.
     *
     * @param prompt a prompt for the user to read before
     * entering input
     * @return a String value
     */
    public String getString(String prompt)
    {
        System.out.println(prompt + ": ");
        return console.nextLine();
    }

    /**
     * Retrieves a String value from the Java console.
     * @return a String value
     */
    public String getString()
    {
        return console.nextLine();
    }

    /**
     * Prompts the user and returns an int value from the Java console.
     *
     * @param prompt a prompt for the user to read before
     * entering input
     * @return an int value
     */
    public int getInt(String prompt)
    {
        System.out.println(prompt + ": ");
        while (!console.hasNextInt())
        {
            System.out.println("Please enter a valid integer: ");

            //clear the scanner buffer
            console.nextLine();
        }

        return getInt();
    }

    /**
     * Retrieves a int value from the Java console.
     * @return a int value
     */
    public int getInt()
    {
        int result = console.nextInt();

        //clear the scanner buffer
        console.nextLine();

        return result;
    }

    /**
     * Prompts the user and returns a double value from the Java console.
     *
     * @param prompt a prompt for the user to read before
     * entering input
     * @return a double value
     */
    public double getDouble(String prompt)
    {
        System.out.println(prompt + ": ");
        while (!console.hasNextDouble())
        {
            System.out.println("Please enter a valid double: ");

            //clear the scanner buffer
            console.nextLine();
        }

        return getDouble();
    }

    /**
     * Retrieves a double value from the Java console.
     * @return a double value
     */
    public double getDouble()
    {
        double result = console.nextDouble();

        //clear the scanner buffer
        console.nextLine();

        return result;
    }

    /**
     * Prompts the user and returns a boolean value from the Java console.
     *
     * @param prompt a prompt for the user to read before
     * entering input
     * @return a boolean value
     */
    public boolean getBoolean(String prompt)
    {
        System.out.println(prompt + ": ");
        while (!console.hasNextBoolean())
        {
            System.out.println("Please enter true/false: ");

            //clear the scanner buffer
            console.nextLine();
        }

        return getBoolean();
    }

    /**
     * Retrieves a boolean value from the Java console.
     * @return a boolean value
     */
    public boolean getBoolean()
    {
        boolean result = console.nextBoolean();

        //clear the scanner buffer
        console.nextLine();

        return result;
    }
}

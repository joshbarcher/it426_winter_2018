package singleton_pattern;

import javax.naming.NameNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class ColorMultiton
{
    //a bunch of singletons which can be retrieved by name
    private static Map<String, ColorMultiton> colorSingletons;

    private int red;
    private int green;
    private int blue;
    private double alpha;

    private ColorMultiton(int red, int green, int blue, double alpha)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    public static ColorMultiton instance(String name) throws NameNotFoundException
    {
        if (colorSingletons == null)
        {
            colorSingletons = new HashMap<>();

            //add the singletons we support
            colorSingletons.put("magic pink",
                    new ColorMultiton(255, 0,255, 1.0));
            colorSingletons.put("lime green",
                    new ColorMultiton(50, 205, 50, 1.0));
            colorSingletons.put("hot pink",
                    new ColorMultiton(255, 105, 180, 1.0));
        }

        if (!colorSingletons.containsKey(name))
        {
            throw new NameNotFoundException("Color is missing");
        }
        else
        {
            return colorSingletons.get(name);
        }
    }

    public void printFoo(Object toPrint)
    {
        System.out.println(toPrint.toString());
    }

    public void compareTwoObject(Comparable one, Comparable two)
    {

    }
}














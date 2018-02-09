package singleton_pattern;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import javafx.application.Application;

import java.time.LocalDateTime;

public class TestSingleton
{
    public static void main(String[] args)
    {
        //this does not work!
        //AppStats stats = new AppStats();
        AppStats stats = AppStats.instance();
        AppStats stats2 = AppStats.instance();

        stats.setStartTime(LocalDateTime.now());

        //do something
        String message = "Hello world!";
        stats.setObjectsCreated(stats.getObjectsCreated() + 1);

        stats.setEndTime(LocalDateTime.now());

        System.out.println("Start time: " + stats.getStartTime());
        System.out.println("Start time: " + stats2.getStartTime());
    }
}

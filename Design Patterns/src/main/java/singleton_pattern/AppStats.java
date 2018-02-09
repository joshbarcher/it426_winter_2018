package singleton_pattern;

import java.time.LocalDateTime;

public class AppStats
{
    //store our singleton
    private static AppStats instance;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int objectsCreated;

    //control instantiation of this class
    private AppStats()
    {
        //do nothing...
    }

    public static AppStats instance()
    {
        if (instance == null)
        {
            synchronized(AppStats.class)
            {
                if (instance == null)
                {
                    instance = new AppStats();
                }
            }
        }

        return instance;
    }

    public LocalDateTime getStartTime()
    {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime)
    {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime()
    {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime)
    {
        this.endTime = endTime;
    }

    public int getObjectsCreated()
    {
        return objectsCreated;
    }

    public void setObjectsCreated(int objectsCreated)
    {
        this.objectsCreated = objectsCreated;
    }
}

package strings;

public class StringParsing
{
    public static String before(String subject, String delimiter)
    {
        int index = subject.indexOf(delimiter);
        
        return subject.substring(0, index);
    }
    
    public static String after(String subject, String delimiter)
    {
        int index = subject.indexOf(delimiter);
        
        return subject.substring(index + 1);
    }
}

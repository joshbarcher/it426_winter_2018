package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex
{
    private static Pattern emailPattern = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");
    private static Pattern zipCodePattern = Pattern.compile("^\\d{5}(-\\d{4})?$");
    private static Pattern phoneNumberPattern = Pattern.compile("^([0-9]{10})&");
    private static Pattern urlPattern = Pattern.compile("^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$");
    
    public static boolean isEmail(String subject)
    {
        return emailPattern.matcher(subject).matches();
    }
    
    public static boolean isZipCode(String subject)
    {
        return zipCodePattern.matcher(subject).matches();
    }
    
    public static boolean isPhoneNumber(String subject)
    {
        Matcher matcher = phoneNumberPattern.matcher(subject);
        
        return matcher.matches();
    }
    
    public static boolean isUrl(String subject)
    {
        return urlPattern.matcher(subject).matches();
    }
}

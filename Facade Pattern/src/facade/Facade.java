package facade;

import strings.StringRegex;

public class Facade
{
    public static boolean verify(String subject, VerifyType type)
    {
        switch (type)
        {
            case EMAIL:
                return StringRegex.isEmail(subject);
            case PHONE_NUMBER:
                return StringRegex.isPhoneNumber(subject);
            case URL:
                return StringRegex.isUrl(subject);
            case ZIP:
                return StringRegex.isZipCode(subject);
            default:
                throw new IllegalStateException("Type " + type + " is not recognized...");
        }
    }

    public static Operator operate(String[] values)
    {
        return new Operator(values);
    }

    public enum VerifyType
    {
        EMAIL,
        PHONE_NUMBER,
        URL,
        ZIP
    }
}

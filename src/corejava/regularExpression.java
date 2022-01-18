package corejava;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {
    public boolean isValidName(String name)
    {
        String pattern="^[A-Z][a-z]{2,}$";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(name);
        return m.matches();
    }
    public boolean isValidEmail(String email)
    {
        String pattern="^[a-zA-Z0-9+_.-]+[.][a-zA-Z0-9 +]+@[a-zA-Z0-9.-]+[.][a-zA-Z0-9{2,}]?+$";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(email);
        return m.matches();
    }
    public boolean isValidMobile(String mobile)
    {
        String pattern="^[0-9]{2}\\s[0-9]{10}$";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(mobile);
        return m.matches();
    }
    public boolean isValidPassword(String mobile)
    {
        String pattern="[a-zA-Z0-9]{8,}$";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(mobile);
        return m.matches();
    }
}

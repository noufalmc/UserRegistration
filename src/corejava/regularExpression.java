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
}

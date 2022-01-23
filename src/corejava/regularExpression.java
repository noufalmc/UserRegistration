/*
Author: Noufal mc
Date:17/01/22
 Regex validate to User Registration
* */

package corejava;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {
    /*
    * Check the firstname valid or invalid
    * All methods returns true
    * Regex false return false
    * Regex true it will return true


    *check whether first letter of name Caps and atleast 3 lengt
    @param
    @return
    * * */
    public boolean isValidName(String name)
    {
        String pattern="^[A-Z][a-z]{2,}$";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(name);
        return m.matches();
    }
    /*
    * Check whether user email valid or not
     * @param email
     * @return
     */
    public boolean isValidEmail(String email)
    {
        String pattern="^[a-zA-Z0-9_+-]+([.][a-zA-Z0-9+]+)*@[a-zA-Z0-9+]+([.][a-zA-z]*)+[a-z]$";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(email);
        return m.matches();
    }
    /*
    * check the mobile number valid or not
    * must enter country code and follow by space 10 digit number
    *@param mobile
    * @return
    * */
    public boolean isValidMobile(String mobile)
    {
        String pattern="^[0-9]{2}\\s[0-9]{10}$";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(mobile);
        return m.matches();
    }
    /*
    * Validate Password
    * Should have at least 1 uppercase
    * Should have at numeric  number in password
    * Should have exactly one charcter
    * */
    public boolean isValidPassword(String mobile)
    {
        String pattern="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]*[@#$%_!^&*]?[0-9a-zA-Z]*$";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(mobile);
        return m.matches();
    }
}

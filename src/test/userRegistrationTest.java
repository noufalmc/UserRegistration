package test;
import corejava.regularExpression;
import static org.junit.Assert.*;
import org.junit.Test;

public class userRegistrationTest {
    //decleration
    public static final regularExpression rs=new regularExpression();
    @Test
    /**
     *Test First Name
     *asserts Value
     */
    public void isValidFirstName()
    {
        assertTrue(rs.isValidName("Nouf"));
        assertTrue(rs.isValidName("nouf"));
        assertFalse(rs.isValidName("nouf"));
    }
    /**
     *Test  Email
     *asserts Value
     */
    @Test
    public void isValidEmail()
    {
        assertTrue(rs.isValidEmail("Nouf@gmail.com"));
        assertTrue(rs.isValidEmail("nouf"));
        assertFalse(rs.isValidEmail("nouf"));
    }
    /**
     * Test Is valid mobile
     */
    @Test
    public  void  isValidMobile()
    {
        assertTrue(rs.isValidMobile("91 9633405658"));
        assertFalse(rs.isValidEmail("909090"));
        assertTrue(rs.isValidEmail("909090"));
    }
    /**
     * Check the password
     * */
    @Test
    public  void isValidPassword()
    {
        assertTrue(rs.isValidPassword("@Nhasdhahsd123"));
        assertTrue(rs.isValidPassword("hasdhahsd1"));

    }

}

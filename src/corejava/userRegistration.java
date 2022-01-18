/*

Name:Noufal
Date:17/01/2021
User Registration
* */
package corejava;
import java.util.Scanner;

public class userRegistration {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        String name;
        System.out.println("Enter Your Choice" +
                "[1] Name Validation");
        choice=sc.nextInt();
        regularExpression re=new regularExpression();
        switch(choice)
        {
            case 1:
                sc.nextLine();
                System.out.println("Enter First Name");
                name=sc.nextLine();
                System.out.println("Result is"+re.isValidName(name));

        }

    }
}

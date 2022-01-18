/*

Name:Noufal
Date:17/01/2021
User Registration
* */
package corejava;
import java.util.Scanner;

import static java.lang.System.exit;

public class userRegistration {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        String name,type="";
        regularExpression re=new regularExpression();
        System.out.println("Enter Your Choice\n" +
                "[1] Fisrt Name\n" +
                "[2] Last Name\n" +
                "");
        choice=sc.nextInt();
        if(choice==1)
        {
            type="First";
        }
        else if(choice==2)
        {
            type="Last";
        }
        switch(choice)
        {
            case 1:
            case 2:
                sc.nextLine();
                System.out.println("Enter "+type+" Name");
                name=sc.nextLine();
                displayResult(re.isValidName(name));
                break;
            default:
                exit(0);
        }

    }
    public static void displayResult(boolean val)
    {
        if(val)
        {
            System.out.println("Valid name");
        }
        else
        {
            System.out.println("Inavlid name");
        }
    }
}

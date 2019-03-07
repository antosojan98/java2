/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class UpperLowerCaseCheck {
  
  
  public static void main(String[] args) { 
 Scanner stdIn = new Scanner(System.in);
        String password;
        String cont = "y";
        char ch;
        boolean upper = false;
        boolean lower = false;


        System.out.println("Setting up your password is easy. To view requirements enter Help.");
        System.out.print("Enter password or help: ");
        password = stdIn.next();
        ch = password.charAt(0);

        while (cont.equalsIgnoreCase("y"))
        {

            while (password.isEmpty())
            {
                System.out.print("Enter password or help: ");
                password = stdIn.next();

            }

            if (password.equalsIgnoreCase("help"))
            {
                 System.out.println("Password must meet these requirements." +
                     "\nMust contain 8 characters.\nMust contain 1 lower case letter." +
                     "\nMust contain 1 upper case letter.\nMust contain 1 numeric digit." +
                     "\nMust contain 1 special character !@#$%^&*\nDoes not contain the word AND or NOT.");

                password = "";

            }

            else if (password.length() < 8)
            {
                System.out.println("Invalid password - Must contain 8 charaters.");
                password = "";
            }


            else if (!(Character.isLowerCase(ch)))
            {
                for (int i=1; i<password.length(); i++)
                {
                   ch = password.charAt(i);

                    if (!Character.isLowerCase(ch))
                       {  
                        System.out.println("Invalid password - Must have a Lower Case character.");
                        password = "";
                       }
                     // end if

                } //end for

            }

            else if (!(Character.isUpperCase(ch)))
            {

                for (int i=0; i<password.length(); i++)
                {

                    ch = password.charAt(i);

                    if (!Character.isUpperCase(ch))
                    {
                        System.out.println("Invalid password - Must have an Upper Case character.");
                        password = "";
                    } // end if
                } //end for

            }



            else
            {
                System.out.println("Your password is " + password);

                System.out.print("Would you like to change your password? Y/N: ");
                cont = stdIn.next();
                password = "";
            }

            while (!cont.equalsIgnoreCase("y") && !cont.equalsIgnoreCase("n"))
            {
                System.out.print("Invalid Answer. Please enter Y or N: ");
                cont = stdIn.next();
            }                

        }

    
  }
  
  /* ADD YOUR CODE HERE */
  
}

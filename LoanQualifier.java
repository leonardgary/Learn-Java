//-------------------------------------------------
// Program LoanQualifier
//-------------------------------------------------

import java.util.Scanner;

public class LoanQualifier
{
   public static void main(String[] args)
   {
      //-------------------------------------------------
      // Create a Scanner object for keyboard input.
      //-------------------------------------------------
      Scanner keyboard = new Scanner(System.in);
      //-------------------------------------------------
      // Declare variables
      //-------------------------------------------------
      double salary, yearsOnJob;
      //-------------------------------------------------
      //Get the annual salary.
      //-------------------------------------------------
      System.out.print("Enter your annual salary: ");
      salary = keyboard.nextDouble();
      //-------------------------------------------------
      // Get the number of years on the current job.
      //-------------------------------------------------
      System.out.print("Enter the number of years on your " +
                       "current job: ");
      yearsOnJob = keyboard.nextDouble();
      //-------------------------------------------------
      // Determine whether the user qualifies.
      //-------------------------------------------------
      if( salary >= 30000 || yearsOnJob >= 2)
      {
         System.out.println("You qualify for the loan.");
      }
      else
      {
         System.out.println("You do not qualify for this loan.");
      }
   }
}
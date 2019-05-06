import java.util.Scanner;


public class Pennies{
   public static void main( String [] args ){
        Scanner scanner = new Scanner( System.in );
        
        int numDays;
        int pennyForDay;
        double totalPay = 0.00;
        final int PENNIES_IN_DOLLAR = 100;
        double totalSalary = 0;
        double exponent = 0.0;
        
        System.out.println("Please enter the number of days worked" );
        numDays = scanner.nextInt();
   
        System.out.println("Day\tPennies for the Day\n-----\t-------\n");
        for( int day = 1; day <= numDays; day++ ){
            pennyForDay = (int)(Math.pow( 2.0 , exponent));
            System.out.println( day + "\t\t" + pennyForDay );
            totalPay = totalPay + pennyForDay ;
            exponent++;
        }
        totalSalary = totalPay / PENNIES_IN_DOLLAR;
        System.out.println("\nTotal Salary: $" + totalSalary);     
   }
}

 
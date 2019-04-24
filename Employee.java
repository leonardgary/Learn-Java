public class Employee
{
   //--------------------------------------------------
   //Field Declarations
   //--------------------------------------------------
   private double payRate;
   private double hoursWorked;
   private double grossPay;
   //--------------------------------------------------
   //Constructor
   //--------------------------------------------------
   public Employee()
   {
      payRate = 0.0;
      hoursWorked = 0.0;
      grossPay = 0.0;
   }
   //--------------------------------------------------
   //Method Definitions (Accessors)
   //--------------------------------------------------
   public double getpayRate()
   {
      return payRate;
   }
   
     public double gethoursWorked()
   {
      return hoursWorked;
   }
   
     public double getgrossPay()
   {
      return grossPay;
   }
   //--------------------------------------------------
   //Method Definitions (Mutators)
   //--------------------------------------------------
   public void setPayRate(double newpRate)
   {
      if ( newpRate > 0 )
      {
         payRate = newpRate;
      }
      else
         System.out.println(newpRate + " is not a valid pay rate.");
         payRate = 0;
   }
   
   public void setHoursWorked(double newhWork)
   {
      if ( newhWork > 0 )
      {
         hoursWorked = newhWork;
      }
      else
         System.out.println(newhWork + " is not a valid for hours worked.");
         hoursWorked = 0;
   }  
   
   public void computeGrossPay()
   {
         grossPay = payRate * hoursWorked;
         System.out.println("Gross pay is " + grossPay );
   }
   
}          
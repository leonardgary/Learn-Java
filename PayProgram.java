public class PayProgram extends Employee
{
   public static void main(String[] args)
   {
      //-----------------------------------------
      //Declare the class variable
      //-----------------------------------------
      Employee julie; 
      //-----------------------------------------
      //Create a julie object
      //-----------------------------------------
      julie = new Employee();
      //-----------------------------------------
      //Call Methods
      //-----------------------------------------
      julie.setPayRate(18.75);
      julie.setHoursWorked(47.5);
      julie.computeGrossPay();
   }
   
}
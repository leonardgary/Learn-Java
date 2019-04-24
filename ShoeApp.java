public class ShoeApp
{
   public static void main(String[] args)
   {
   //--------------------------------------------------------------
   // Create a Shoes object with the default contructor
   // called nerdShoe 
   //--------------------------------------------------------------
      Shoes nerdShoe = new Shoes();
   //--------------------------------------------------------------
   //Create a second Shoes object and initialize its
   //fields with values
   //--------------------------------------------------------------
      Shoes coolShoe = new Shoes("Sandals","Brown", 8.5);
   //--------------------------------------------------------------
   //Create a call to set the color, style
   //& sizes of the fancyShoes....
   //--------------------------------------------------------------
      nerdShoe.setStyle("Tan");
      nerdShoe.setColor("Walking");
      nerdShoe.setSize(9.5);
   //--------------------------------------------------------------
   //Display the style of the Nerd Shoe...
   //--------------------------------------------------------------
      System.out.println("The style of the nerd shoe is: " + nerdShoe.getStyle());
   //--------------------------------------------------------------
      coolShoe.setColor("Purple");
   //--------------------------------------------------------------
   //Display the style of the Cool Shoe...
   //--------------------------------------------------------------
      System.out.println("The style of the cool shoe is: " + coolShoe.getStyle());
   //--------------------------------------------------------------
   //Display the Cool Shoe...
   //--------------------------------------------------------------
      System.out.println(coolShoe.toString());
   }  
}

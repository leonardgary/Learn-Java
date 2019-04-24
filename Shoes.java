//--------------------------------------------------------------
// Create a Shoe object with the default contructor, some
// Accessor and Mutator methods
//--------------------------------------------------------------
public class Shoes
{
   //--------------------------------------------------
   //Field Declarations
   //--------------------------------------------------
   private String style;
   private String color;
   private double size;
   //--------------------------------------------------
   //Constructor
   //--------------------------------------------------
   public Shoes()
   {
      style = "Dancing";
      color = "Red";
      size = 8.5;
   }
   public Shoes(String fstyle, String fcolor, double fsize)
   {
      style = fstyle;
      color = fcolor;
      size = fsize;
   }
//--------------------------------------------------------------
// Mutator methods
//--------------------------------------------------------------          
   public void setStyle(String fstyle)
   {
        style = fstyle;
   }
   public void setColor(String fcolor)
   {
        color = fcolor;
   }
   public void setSize(double fsize)
   {
        size = fsize;
   }
//--------------------------------------------------------------
// Accessor methods...
//--------------------------------------------------------------
   public String getStyle()
   {
      return style;
   }
   
     public String getColor()
   {
      return color;
   }
   
     public double getSize()
   {
      return size;
   }
//--------------------------------------------------------------
// Display all shoe data
//--------------------------------------------------------------
   public void displayShoeInfo()
   {
      toString();
   }
    
}

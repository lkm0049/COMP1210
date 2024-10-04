import java.text.DecimalFormat;
/**
 *Simple program that defines objects to make a box with a heart shaped
  top and bottom.
 *
 *Project 4
 *@author Liam Maher - COMP 1210-001
 *@version 02.10.2023
 */
 
public class HeartShapedBox {
   //instance variables for program
   private String label = "";
   private double radius = 0;
   private double height = 0;
   //constructor
   /**
    *Takes the variables and assigns it to inputs.
    *@param labelIn  the string you want to assign to label
    *@param radiusIn the double you want to assin to radius
    *@param heightIn the double you want to assign to height
    */
   public HeartShapedBox(String labelIn, double radiusIn, double heightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setHeight(heightIn);
   }
   /**
    *Takes the value of label.
    *@return label
    */
   public String getLabel() {
      return label;
   }
   /**
    *Makes sure there is a label submitted and then trims it.
    *@param labelIn used
    *@return false
    */
   public boolean setLabel(String labelIn) {
      if (labelIn == null) {
         return false;
      }
      else {
         label = labelIn.trim();
         return true;
      }
   }
   /**
    *Takes the value of radius.
    *@return radius
    */
   public double getRadius() {
      return radius;
   }
   /**
    *Makes sure the radius is greater than 0 and sets radiusIn to radius.
    *@param radiusIn used
    *@return true
    */
   public boolean setRadius(double radiusIn) {
      if (radiusIn > 0) {
         radius = radiusIn;
         return true;
      }
      else {
         return false;
      }
      
   }
   /**
    *Takes the value of height.
    *@return height
    */
   public double getHeight() {
      return height;
   }
   /**
    *Makes sure the height is greater than 0 and then sets height to heightIn.
    *@param heightIn used
    *@return true
    */
   public boolean setHeight(double heightIn) {
      if (heightIn > 0) {
         height = heightIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**
    *Calculates the total area.
    *@return equation for area
    */
   public double heartShapedArea() {
      return (Math.PI * Math.pow(radius, 2) + 4 * Math.pow(radius, 2));
   }
   /**
    *Calculates the lateral surface area.
    *@return equation for lateral surface area
    */
   public double lateralSurfaceArea() {
      return (height * (4 * radius + 2 * Math.PI * radius));
   }
   /**
    *Calculates the total surface area.
    *@return equation for total surface area
    */
   public double totalSurfaceArea() {
      return (2 * heartShapedArea() + lateralSurfaceArea());
   }
   /**
    *Calculates the total volume.
    *@return equation for volume
    */
   public double volume() {
      return (height * heartShapedArea());
   }
   /**
    *Sets the string to be printed.
    *@return string to be printed
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      return "HeartShapedBox " + "\"" + label + "\"" + " with radius "
         + radius + " units and height " + df.format(height) + " units:"
         + "\n\theart shaped area = " + df.format(heartShapedArea()) 
            + " square units"
         + "\n\tlateral surface area = " + df.format(lateralSurfaceArea()) 
            + " square units"
         + "\n\ttotal surface area = " + df.format(totalSurfaceArea()) 
            + " square units"
         + "\n\tvolume = " + df.format(volume()) + " cubic units";
   }



}
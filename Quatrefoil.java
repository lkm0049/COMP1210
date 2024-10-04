import java.text.DecimalFormat;
/**
 *Simple program that stores the label and diameter of a Quatrefoil 
   where the diameter is positive.
 *
 *Project 07B
 *@author Liam Maher - COMP 1210-001
 *@version 03.23.2023
 */
public class Quatrefoil implements Comparable<Quatrefoil> {
   private String label = "";
   private double diameter = 0;
   private static int count = 0;
   /**
    *Sets the label value for class.
    *@param labelIn - used.
    *@param diameterIn - used.
    */
   public Quatrefoil(String labelIn, double diameterIn) {
      setLabel(labelIn); 
      setDiameter(diameterIn); 
      count++;
   }
   /**
    *Gets the label to use.
    *@return label
    */
   public String getLabel() {
      return label;
   }
   /**
    *Sets label if it is not null.
    *@param labelIn - used.
    *@return true or false
    */
   public boolean setLabel(String labelIn) {
      if (labelIn != null && !labelIn.isEmpty()) {
         label = labelIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
   /**
    *Gets the diameter to be used.
    *@return diameterIn
    */
   public double getDiameter() {
      return diameter;
   }
   /**
    *Sets the diameter to be used.
    *@param diameterIn - used.
    *@return true or false.
    */
   public boolean setDiameter(double diameterIn) {
      if (diameterIn >= 0) {
         diameter = diameterIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**
    *Calculates the perimeter of quatrefoil in inches.
    *@return perimeter of quadrefoil in inches
    */ 
   public double perimeter() {
      return (Math.PI * diameter);
   }
   /**
    *Calculates the perimeter of the quatrefoil in feet.
    *@return perimeter of quadrefoil in feet
    */
   public double perimeterInFt() {
      return (perimeter() / 12);
   }
   /**
    *Calculates the area of the quatrefoil in square inches.
    *@return area in square inches
    */
   public double area() {
      return (Math.pow((diameter / 2), 2) 
         + 2 * ((Math.PI * Math.pow((diameter / 2), 2)) / 4));  
   }
   /**
    *Calculates the area of the quatrefoil in square feet.
    *@return area in square feet
    */
   public double areaInSqFt() {
      return (area() / 144);
   }
   /**
    *Produces a string that contains the data about the Quatrefoil.
    *@return string to be outputted.
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "Quatrefoil \"" + label + "\" with diameter "
         + df.format(diameter) + " inches has:"
         + "\n\tperimeter = " + df.format(perimeter()) + " inches (or "
         + df.format(perimeterInFt()) + " feet)"
         + "\n\tarea = " + df.format(area()) + " square inches (or "
         + df.format(areaInSqFt()) + " square feet)";
      return output;
   }
   /**
    *Gets the count value.
    *@return count
    */
   public static int getCount() {
      return count;
   }
   /**
    *Sets count back to 0.
    */
   public static void resetCount() {
      count = 0;
   }
   /**
    *Makes sure that object is instance of Quatrefoil.
    *@param obj - used.
    *@return true or false
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof Quatrefoil)) {
         return false;
      }
      else {
         Quatrefoil qf = (Quatrefoil) obj;
         return (label.equalsIgnoreCase(qf.getLabel())
            && Math.abs(diameter - qf.getDiameter()) < .000001);
      }
   }
   /**
    *Returns code required by CheckStyle.
    *@return zero
    */
   public int hashCode() {
      return 0;
   }
   /**
    *Compares one object to another.
    *@param Quatrefoil obj - used.
    *@return number
    */ 
   public int compareTo(Quatrefoil obj) {
      if (Math.abs(this.area() - obj.area()) < 0.000001) {
         return 0; //considered equal
      }
      else if (this.area() < obj.area()) {
         return -1;
      }
      else {
         return 1;
      }
   }
   
}
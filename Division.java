/**
 *Activity 11 for projects.
 *
 *Activity 11
 *@author Liam Maher - COMP 1210-001
 *@version 04.11.23
 */
public class Division {
   /**
    *Performs integer division.
    *@param numer - used.
    *@param denom - used.
    *@return int
    */
   public static int intDivide(int numer, int denom) {
      try {
         return (int) numer / denom;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
    /**
     *Performs floating point division.
     *@param numer - used.
     *@param denom - used.
     *@throws IllegalArgumentException - not used.
     *@return float
     */
   public static double decimalDivide(int numer, int denom) {
      if (denom == 0) {
         throw new IllegalArgumentException("The denominator " 
            + "cannot be zero.");
      }
      else {
         double result = (double) numer / (double) denom;
         return result;
      }
   }
}
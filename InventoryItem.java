/**
 *Simple program that represents an inventory item in a store.
 *
 *Activity 9
 *@author Liam Maher - COMP 1210-001
 *@version 04.04.23
 */
public class InventoryItem {
   //variables
   protected String name = "";
   protected double price = 0.0;
   private static double taxRate = 0.0;
   /**
    *Constructor for InventoryItem.
    *@param nameIn - used.
    *@param priceIn - used.
    */
   public InventoryItem(String nameIn, double priceIn) {
      price = priceIn;
      name = nameIn;
   }
   /**
    *Gets the name of customer.
    *@return customer name
    */
   public String getName() {
      return name;
   }
   /**
    *Returns price including tax.
    *@return price including tax
    */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   /**
    *Sets the tax rate.
    *@param taxRateIn - used.
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   /**
    *Sets string for output.
    *@return summary
    */
   public String toString() {
      String output = name + ": $" + calculateCost();
      return output;
   }
    
}
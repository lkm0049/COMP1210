/**
 *Inherts from InventoryItem.
 *
 *Activity 9
 *@author Liam Maher - COMP 1210-001
 *@version 04.04.2023
 */
public class ElectronicsItem extends InventoryItem {
   //Variables
   protected double weight = 0.0;
   /**
    *Shipping cost price.
    */
   public static final double SHIPPING_COST = 1.5;
   /**
    *Constructor for ElectronicsItem.
    *@param nameIn - used.
    *@param priceIn - used.
    *@param weightIn - used.
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   /**
    *Set weight.
    *@return weight
    */
   public double getWeight() {
      return weight;
   }
   /**
    *Overides calculatorCost.
    *@return new cost with shipping
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}
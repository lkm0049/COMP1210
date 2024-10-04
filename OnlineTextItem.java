/**
 *Represents online text users can buy.
 *
 *Activity 9
 *@author Liam Maher - COMP 1210-001
 *@version 04.04.2023
 */
public abstract class OnlineTextItem extends InventoryItem {
   /**
    *Constructor for class.
    *@param nameIn - used.
    *@param priceIn - used.
    */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   /**
    *Overides calculateCost().
    *@return price.
    */
   public double calculateCost() {
      return price;
   }
}
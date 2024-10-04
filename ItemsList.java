/**
 *Extension from activity 9 into activity 10.
 *
 *Activity 10
 *@author Liam Maher - COMP 1210-001
 *@version 04.11.23
 */
public class ItemsList {
   private InventoryItem[] inventory;
   private int count;
   /**
    *Constructor for class.
    */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = count;
   }
   /**
    *Adds item.
    *@param itemIn - used.
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   /**
    *Calculates total.
    *@param electronicsSurcharge - used.
    *@return double
    */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   /**
    *Puts everything to string.
    *@return String
    */
   public String toString() {
      String output = "All inventory:\n\n";
      for (int i = 0; i < count; i++) {
         output += inventory[i].toString() + "\n";
      }
      return output;
   }
 
}
/**
 *Extension from activity 9 into activity 10.
 *
 *Activity 10
 *@author Liam Maher - COMP 1210-001
 *@version 04.11.23
 */
public class InventoryListApp {
   /**
    *Main method for InventoryListApp.
    *@param args Command line arguements - not used.
    */
   public static void main(String[] args) {
      ItemsList myItems = new ItemsList();
      InventoryItem.setTaxRate(0.05);
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      System.out.print(myItems.toString());
      System.out.println("\nTotal: " + myItems.calculateTotal(2.0));
   }
}
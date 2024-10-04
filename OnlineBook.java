/**
 *Creates OnlineBookClass.
 *
 *Activity 9
 *@author Liam Maher - COMP 1210-001
 *@version 04.04.23
 */
public class OnlineBook extends OnlineTextItem {
   //Variables
   protected String author;
   /**
    *Constructor for OnlineBook.
    *@param nameIn - used.
    *@param priceIn - used.
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   /**
    *Overrides to String.
    *@return output
    */
   public String toString() {
      String output = name + " - " + author + ": $" + price;
      return output;
   }
   /**
    *Sets author to authorIn.
    *@param authorIn - used.
    */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
   
   
}
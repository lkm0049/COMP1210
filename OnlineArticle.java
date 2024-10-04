/**
 *Extends OnlineTectItem.
 *
 *Activity 9
 *@author Liam Maher - COMP 1210-001
 *@version 04.04.2023
 */
public class OnlineArticle extends OnlineTextItem {
   //Variable
   private int wordCount;
  /**
   *Constructor for OnlineArticle.
   *@param nameIn - used.
   *@param priceIn - used.
   */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   /**
    *Sets wordCount to word count.
    *@param wordCountIn - used.
    */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}

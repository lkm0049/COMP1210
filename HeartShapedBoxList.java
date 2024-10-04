import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 *Simple program that stores the name of the list of HeartShapedBox objects.
 *
 *Project 5
 *@author Liam Maher - COMP 1210 - 001
 *@version 2.17.2023
 */
public class HeartShapedBoxList {
   private String name = "";
   private ArrayList<HeartShapedBox> list;
   /**
    *Calls HeartShapedBox class.
    *@param nameIn - used.
    *@param listIn - used.
    */
   public HeartShapedBoxList(String nameIn, 
      ArrayList<HeartShapedBox> listIn) {
      name = nameIn;
      list = listIn;
   }
    /**
     *Gets the name of list.
     *@return listName
     */
   public String getName() {
      return name;
   }
   /**
    *Returns the size of list.
    *@return boxes.size()
    */
   public int numberOfHeartShapedBoxes() {
      int size = list.size();
      return size;
   }
   /**
    *Sets up grandTotalSurfaceArea and calculations.
    *@return grand total surface area
    */
   public double grandTotalSurfaceArea() {
      double sumSa = 0;
      HeartShapedBox tempSa;
      double i = 0;
      int index = 0;
      if (list.size() <= 0) {
         return 0;
      }
      else {
         while (index < list.size()) {
            tempSa = list.get(index);
            i = tempSa.totalSurfaceArea();
            sumSa = sumSa + i;
            index++;
         }
         return sumSa;
      }
      
   }
    /**
     *Sets up totalVolume and gets the total volume.
     *@return total volume
     */
   public double totalVolume() {
      double sumV = 0;
      HeartShapedBox tempVol;
      double i = 0;
      int index = 0;
      if (list.size() <= 0) {
         return 0;
      }
      else {
         while (index < list.size()) {
            tempVol = list.get(index);
            i = tempVol.volume();
            sumV = sumV + i;
         }
         return sumV;
      }
   }
     /**
      *Sets up averageTotalSurfaceArea and takes average.
      *@return total surface area / number of boxes
      */
   public double averageTotalSurfaceArea() {
      if (list.size() <= 0) {
         return 0;
      }
      else {
         return grandTotalSurfaceArea() / numberOfHeartShapedBoxes();
      }
   }
      /**
       *Calculates average volume.
       *@return average volume
       */
   public double averageVolume() {
      if (list.size() <= 0) {
         return 0;
      }
      else { 
         return totalVolume() / numberOfHeartShapedBoxes();
      }
   }
   /**
    *Sets up the output and string.
    *@return toString
    */
   public String toString() {
      String output =  "\n----- " + name + " -----\n";
      int i = 0;
      while (i < list.size()) {
         output += "\n";
         output += list.get(i) + "\n";
         i++;
      }
      return output;
   }
    /**
     *Summarizes info.
     *@return output string
     */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      output += "\n";
      output = "----- Summary for " + getName().trim() + " -----"
         + "\nNumber of HeartShapedBoxes: " + numberOfHeartShapedBoxes()
         + "\nTotal Surface Area: " + df.format(grandTotalSurfaceArea())
         + " square units"
         + "\nTotal Volume: " + df.format(totalVolume()) + " cubic units"
         + "\nAverage Surface Area: " + df.format(averageTotalSurfaceArea())
         + " square units"
         + "\nAverage Volume: " + df.format(averageVolume()) + " cubic units";
      return output;
   }
   /**
    *Returns the list.
    *@return list for list
    */
   public ArrayList<HeartShapedBox> getList() {
      return list;
   }
   /**
    *Scans file to be stored.
    *@param fileNameIn used
    *@return hsbl used
    *@throws FileNotFoundException for no file
    */
   public HeartShapedBoxList readFile(String fileNameIn) 
      throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<HeartShapedBox> myList = new ArrayList<HeartShapedBox>();
      double radius = 0, height = 0;
      String label = "";
      String listName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         radius = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         HeartShapedBox hsb = new HeartShapedBox(label, radius, height);
         myList.add(hsb);
      
      }
      HeartShapedBoxList hsbl = new HeartShapedBoxList(listName, myList);
      return hsbl;
   }
   /**
    *Adds new HSB.
    *@param labelIn used
    *@param radiusIn used
    *@param heightIn used
    */
   public void addHeartShapedBox(String labelIn, double radiusIn,
      double heightIn) {
      HeartShapedBox object = new HeartShapedBox(labelIn, radiusIn, heightIn);
      list.add(object);
   }
   /**
    *Looks for same label.
    *@param labelIn used
    *@return found if founf
    */
   public HeartShapedBox findHeartShapedBox(String labelIn) {
      for (HeartShapedBox hs : list) {
         if (labelIn.equalsIgnoreCase(hs.getLabel().trim())) {
            return hs;
         }
      }
      return null;
   }
   /**
    *Deletes a HSB.
    *@param labelIn used
    *@return noHs used
    */ 
   public HeartShapedBox deleteHeartShapedBox(String labelIn) {
      HeartShapedBox deleteHs = findHeartShapedBox(labelIn);
      HeartShapedBox noHs = null;
      if (deleteHs != null) {
         list.remove(findHeartShapedBox(labelIn));
         noHs = deleteHs;
      }
      else {
         noHs = null;
      }
      return noHs;
   }
   /**
    *Edits HSB.
    *@param labelIn used
    *@param radiusIn used
    *@param heightIn used
    *@return changed if changed
    */
   public boolean editHeartShapedBox(String labelIn, 
      double radiusIn, double heightIn) {
      boolean changed = false;
      if (findHeartShapedBox(labelIn) != null) {
         HeartShapedBox editHs = findHeartShapedBox(labelIn);
         editHs.setRadius(radiusIn);
         editHs.setHeight(heightIn);
         changed = true;
      }
      else {
         changed = false;
      }
      return changed;
   }
}
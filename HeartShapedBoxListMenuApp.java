import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 *Simple program that presents users with options for HeartShapedBox and
  HeartShapedBoxList.
 *
 *Project 6
 *@author Liam Maher - COMP 1210-001
 *@version 02.24.2023
 */
public class HeartShapedBoxListMenuApp {
   /**
    *Main method for program.
    *@param args Comman line arguements - not used.
    *@throws FileNotFoundException if file can't be opened.
    */
   public static void main(String[] args) throws FileNotFoundException {
      //Declaring vars and create HeartShapedBox obj
      String hsbListName = "*** no list name assigned ***";
      Scanner userInput = new Scanner(System.in);
      ArrayList<HeartShapedBox> hsbObj = new ArrayList<HeartShapedBox>();
      HeartShapedBoxList hsList = new HeartShapedBoxList(hsbListName, hsbObj);
      String input = "";
      String fileName = "No File Name";
      //Printing menu
      System.out.println("HeartShapedBox List System Menu");
      System.out.println("R - Read File and Create HeartShapedBox List");
      System.out.println("P - Print HeartShapedBox List");
      System.out.println("S - Print Summary");
      System.out.println("A - Add HeartShapedBox");
      System.out.println("D - Delete HeartShapedBox");
      System.out.println("F - Find HeartShapedBox");
      System.out.println("E - Edit HeartShapedBox");
      System.out.println("Q - Quit");
         //Prompt user for code
      do 
      {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         input = userInput.nextLine();
         if (input.length() == 0) {
            continue;
         }
         else {
            input = input.toUpperCase();
            char choice = input.charAt(0);
            switch(choice) {
               case 'R':
                  System.out.print("\tFile name: ");
                  fileName = userInput.nextLine();
                  hsList = hsList.readFile(fileName);
                  System.out.println("\tFile read in and HeartShapedBox"
                        + " List created\n");
                  break;
               case 'P':
                  System.out.println(hsList.toString());
                  break;
               case 'S':
                  System.out.println("\n" + hsList.summaryInfo() + "\n");
                  break;
               case 'A':
                  System.out.print("\tLabel: ");
                  String newLabelAdd = userInput.nextLine();
                  System.out.print("\tRadius: ");
                  double newRadiusAdd = userInput.nextDouble();
                  System.out.print("\tHeight: ");
                  double newHeightAdd = userInput.nextDouble();
                  userInput.nextLine();
                  hsList.addHeartShapedBox(newLabelAdd,
                     newRadiusAdd, newHeightAdd);
                  System.out.println("\t*** HeartShapedBox added ***");
                  System.out.print("\n");
                  break;
               case 'D':
                  System.out.print("\tLabel: ");
                  String delete = userInput.nextLine();
                  HeartShapedBox deleter = hsList.findHeartShapedBox(delete);
                  String nameDelete = "";
                  if (deleter != null) {
                     nameDelete = deleter.getLabel();
                     hsList.deleteHeartShapedBox(delete);
                     System.out.println("\t\"" + nameDelete.trim() 
                           + "\" deleted\n");
                  }
                  else {
                     System.out.println("\t\"" + delete + "\" not found\n");
                  }
                  break;
               case 'F':
                  System.out.print("\tLabel: ");
                  hsbListName = userInput.nextLine();
                  HeartShapedBox find = 
                           hsList.findHeartShapedBox(hsbListName);
                  if (find != null) {
                     System.out.println(find.toString());
                  }
                  else {
                     System.out.println("\t\"" + hsbListName 
                              + "\" not found");
                  }
                  System.out.print("\n");
                  break;
               case 'E':
                  System.out.print("\tLabel: ");
                  String newLabelEdit = userInput.nextLine();
                  System.out.print("\tRadius: ");
                  double newRadiusEdit = userInput.nextDouble();
                  System.out.print("\tHeight: ");
                  double newHeightEdit = userInput.nextDouble();
                  userInput.nextLine();
                  HeartShapedBox editr = 
                           hsList.findHeartShapedBox(newLabelEdit);
                  String nameEdit = "";
                  if (editr != null) {
                     nameEdit = editr.getLabel();
                     hsList.editHeartShapedBox(newLabelEdit,
                        newRadiusEdit, newHeightEdit);
                     System.out.println("\t\"" + newLabelEdit.trim()
                              + "\" successfully edited");
                  }
                  else {
                     System.out.println("\t\"" + newLabelEdit.trim()
                              + "\" not found");
                  }
                  System.out.print("\n");
                  break;
               case 'Q':
                  break;
               default:
                  System.out.print("\t*** invalid code ***\n");
                  System.out.print("\n");
                  break;
            }
         }
      } while (!input.equalsIgnoreCase("Q"));
                        
                        
   } 
}
import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 *Test file for Customer class.
 *
 *Activity 7B
 *@author Liam Maher - COMP 1210-001
 *@version 03.21.2023
 */

public class CustomerTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    *Tests setLocation.
    */
   @Test public void setLocationTest1() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Boston, MA");
      Assert.assertEquals("Boston, MA", cstmr.getLocation());
   }
   /**
    *Tests other instance of setLocation.
    */
   @Test public void setLocationTest2() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Atlanta", "GA");
      Assert.assertEquals("Atlanta, GA", cstmr.getLocation());
   }
   /**
    *Tests changeBalance.
    */
   @Test public void changeBalanceTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.changeBalance(100);
      Assert.assertEquals(100, cstmr.getBalance(), 0.000001);
   }
   /**
    *Tests toString.
    */
   @Test public void toStringTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Auburn, AL");
      cstmr.changeBalance(999);
      Assert.assertEquals("Lane, Jane\nAuburn, AL\n$999.0", cstmr.toString());
   }
   /**
    *First test for compareTo.
    */
   @Test public void compareToTest1() {
      //Customer1
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(500);
      //Customer2
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
      //Assert
      Assert.assertTrue(cstmr1.compareTo(cstmr2) == 0);
   }
   /**
    *Second test for compareTo.
    */
   @Test public void compareToTest2() {
      //Customer1
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(100);
      //Customer2
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
      //Assert
      Assert.assertTrue(cstmr1.compareTo(cstmr2) < 0);
   }
   /**
    *Third test for compareTo.
    */
   @Test public void compareToTest3() {
      //Customer1
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(1000);
      //Customer2
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
      //Assert
      Assert.assertTrue(cstmr1.compareTo(cstmr2) > 0);
   }
}

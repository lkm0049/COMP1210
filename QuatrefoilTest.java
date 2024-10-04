import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 *JUnit test file for Quatrefoil Class.
 *
 *Project 07A
 *@author Liam Maher - COMP 1210-001
 *@version 03.17.2023
 */
public class QuatrefoilTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**
    *Tests getLabel().
    */
   @Test public void testGetLabel() {
      Quatrefoil b = new Quatrefoil("Test", 3.5);
      Assert.assertEquals("Test", b.getLabel());
   }
   /**
    *Tests setLabel().
    */
   @Test public void testSetLabel() {
      Quatrefoil b = new Quatrefoil("Test  ", 3.5);
      boolean result = b.setLabel("Test   ");
      Assert.assertTrue(result);
   }
   /**
    *Tests getDiameter().
    */
   @Test public void testGetDiameter() {
      Quatrefoil b = new Quatrefoil("Test", 3.5);
      Assert.assertEquals(3.5, b.getDiameter(), .001);
   }
   /**
    *Tests setDiameter().
    */
   @Test public void testSetDiameter() {
      Quatrefoil b = new Quatrefoil("Test  ", 3.5);
      boolean result = b.setDiameter(3.5);
      Assert.assertTrue(result);
   }
   /**
    *Tests perimeter().
    */
   @Test public void testPerimeter() {
      Quatrefoil b = new Quatrefoil("Test", 3.5);
      Assert.assertEquals(10.996, b.perimeter(), .001);
   }
   /**
    *Tests perimeterInSqFt().
    */
   @Test public void testPerimeterInFt() {
      Quatrefoil b = new Quatrefoil("Test", 3.5);
      Assert.assertEquals(0.916, b.perimeterInFt(), .001);
   }
   /**
    *Tests area().
    */
   @Test public void testArea() {
      Quatrefoil b = new Quatrefoil("Test", 3.5);
      Assert.assertEquals(7.873, b.area(), .001);
   }
   /**
    *Tests areaInSqFt().
    */
   @Test public void testAreaInSqFt() {
      Quatrefoil b = new Quatrefoil("Test", 3.5);
      Assert.assertEquals(0.055, b.areaInSqFt(), .001);
   }
   /**
    *Tests toString().
    */
   @Test public void testToString() {
      Quatrefoil b = new Quatrefoil("Test  ", 3.5);
      Assert.assertTrue(b.toString().contains("\"Test\""));
   }
   /**
    *Tests getCount().
    */
   @Test public void testGetCount() {
      Quatrefoil b = new Quatrefoil("Test  ", 3.5);
      Quatrefoil c = new Quatrefoil("Test", 3.5);
      Quatrefoil d = new Quatrefoil("Tes", 3.5);
      Assert.assertEquals(3, d.getCount());
   }
   /**
    *Tests resetCount().
    */
   @Test public void testResetCount() {
      Quatrefoil b = new Quatrefoil("Test  ", 3.5);
      Quatrefoil c = new Quatrefoil("Test", 3.5);
      Quatrefoil d = new Quatrefoil("Tes", 3.5);
      d.resetCount();
      Assert.assertEquals(0, d.getCount());
   }
   /**
    *Tests equals().
    */
   @Test public void testEquals() {
      Quatrefoil b = new Quatrefoil("Test", 3.5);
      Quatrefoil c = new Quatrefoil("Test", 3.5);
      boolean test = true;
      Assert.assertEquals(test, c.equals(b));
   }
   /**
    *Tests hashCode().
    */
   @Test public void testHashCode() {
      Quatrefoil b = new Quatrefoil("Test", 3.5);
      Assert.assertEquals(0, b.hashCode());
   }
   /**
    *Tests compareTo() 1.
    */
   @Test public void testCompareTo1() {
      Quatrefoil b = new Quatrefoil("Test", 3.5);
      b.area(50);
      Quatrefoil c = new Quatrefoil("Test", 3.5);
      c.area(50);
      Assert.assertTrue(b.compareTo(c) == 0);
   }
   /**
    *Tests compareTo() 2.
    */
   @Test public void testCompareTo2() {
      Quatrefoil b = new Quatrefoil("Test", 3.5);
      b.area(50);
      Quatrefoil c = new Quatrefoil("Test", 3.5);
      c.area(100);
      Assert.assertTrue(b.compareTo(c) < 0);
   }
    /**
     *Tests compareTo() 3;
     */
   @Test public void testCompareTo3() {
      Quatrefoil b = new Quatrefoil("Test", 3.5);
      b.area(100);
      Quatrefoil c = new Quatrefoil("Test", 3.5);
      c.area(50);
      Assert.assertTrue(b.compareTo(c) > 0);
      
   }
}

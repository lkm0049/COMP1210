import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *Creates test for BankLoan.
 *
 *Activity 7A
 *@author Liam Maher COMP 1210-001
 *@version 03.14.2023
 */
public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }
}

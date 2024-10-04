/**
 *Simple program that caluclates bank loans.
 *
 *@author Liam Maher COMP 1210 - 001
 *@version 04.14.2023
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
   /**
    *Creates BankLoan Method.
    *@param customerNameIn - used.
    *@param interestRateIn - used.
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   /**
    *Creates borrowFromBank.
    *@param amount - used.
    *@return wasLoanMade
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   /**
    *Creates payBank.
    *@param amountPaid - used.
    *@return new balance
    */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   /**
    *Creates getBalance.
    *@return balance
    */
   public double getBalance() {
      return balance;
   }
   /**
    *Creates setInterestRate.
    *@param interestRateIn - used.
    *@return true
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**
    *Creates getInterestRate.
    *@return interestRate
    */
   public double getInterestRate() {
      return interestRate;
   }
   /**
    *Creates chargeInterest.
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   /**
    *Creates isAmountValid.
    *@param amount - used.
    *@return true
    */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   /**
    *Creates isInDebt.
    *@param loan - used.
    *@return true
    */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   /**
    *Creates getLoansCreated.
    *@return loansCreated
    */
   public static int getLoansCreated() {
      return loansCreated;
   }
   /**
    *Creates resetLoansCreated.
    */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
   /**
    *Creates toString.
    *@return output
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}

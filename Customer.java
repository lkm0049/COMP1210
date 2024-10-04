/**
 *Simple program that implements interfaces.
 *
 *Activity 7B
 *@author Liam Maher - COMP 1210-001
 *@version 03.21.2022
 */
 
public class Customer implements Comparable<Customer> {
   //instance variables
   private String name;
   private String location;
   private double balance;
   /**
    *Creates constructor of Customer.
    *@param nameIn - used.
    */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   /**
    *Sets location to use.
    *@param locationIn - used.
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**
    *Changes balance to use.
    *@param amount - used.
    */
   public void changeBalance(double amount) {
      balance += amount;
   }
   /**
    *Gets location variable.
    *@return location
    */
   public String getLocation() {
      return location;
   }
   /**
    *Gets the balance variable.
    *@return balance
    */
   public double getBalance() {
      return balance;
   }
   /**
    *New setLocation with two parameters.
    *@param city - used.
    *@param state - used.
    */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   /**
    *Creates string to be used.
    *@return output
    */
   public String toString() {
      String output = name + "\n" + location + "\n" + "$" + balance;
      return output;
   }
   /**
    *Compares one object to another.
    *@param obj - used.
    *@return number
    */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0; //considered equal
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
}
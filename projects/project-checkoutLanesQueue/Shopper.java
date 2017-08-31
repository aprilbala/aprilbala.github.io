package edu.hawaii.ics211;

/**
 * Shopper.java 
 *    Create a Shopper class that has a member variable numItems. 
 *    Instances of this class represent the shoppers in the store.
 *
 * @author April-Angela Bala
 * Spring 2017, ICS 211
 * 03-10-2017
 * Homework A06
 */

public class Shopper {
  
  private int numItems;
  
  /**
   * Default constructor
   */
  public Shopper() {
    this.numItems = 10;
  }
  
  /**
   * Creates a Shopper with itemCount, which indicates how much items the shopper has. 
   * @param itemCount
   */
  public Shopper(int itemCount) {
    numItems = itemCount;
  }
  
  /**
   * Returns the amount of items the Shopper has. 
   */
  public int getNumItems() {
    return numItems;
  }

}

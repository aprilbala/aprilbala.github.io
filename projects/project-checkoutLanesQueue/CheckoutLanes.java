package edu.hawaii.ics211;

/**
 * CheckoutLanes.java 
 *    Uses a CircularArrayQueue to simulate checkout lines in a store (ex. Foodland). 
 *
 * @author April-Angela Bala
 * Spring 2017, ICS 211
 * 03-10-2017
 * Homework A06
 */

public class CheckoutLanes {

  CircularArrayQueue<Shopper>[] expLane;    //Express lanes
  CircularArrayQueue<Shopper>[] regLane;    //Regular lanes
  int nextRegLane;

  /**
   * Default constructor.
   */
  public CheckoutLanes() {
    this.expLane = expLane;
    this.regLane = regLane;
    this.nextRegLane = 0;
  }

  /**
   * Used for checkout lanes simulation (?)
   */
  @SuppressWarnings("unchecked")
  public CheckoutLanes(int numExpress, int numRegular) {
    expLane = new CircularArrayQueue[numExpress];
    regLane = new CircularArrayQueue[numRegular];

    for (int i = 0; i < numExpress; i++) {
      expLane[i] = new CircularArrayQueue<Shopper>();
    }

    for (int i = 0; i < numRegular; i++) {
      regLane[i] = new CircularArrayQueue<Shopper>();
    }
  }

  /**
   * Adds shoper to a lane
   * @param laneNumber - the checkout lane the shopper will go to
   * @param shopper - Shopper added to the checkout lane 
   */
  public void enterLane(int laneNumber, Shopper shopper) { 
    if (laneNumber < expLane.length) {
      expLane[laneNumber].add(shopper);
    } else {
      regLane[laneNumber - expLane.length].add(shopper);
    }
  }

  /**
   * Loops until all checkout lanes are empty (until no more shoppers in store; see method boolean shoppersInStore)
   * 
   * EXPRESS LANES: Shoppers in express lanes with 10 items or less, will be checked out successfully through the express lane. 
   *    If shopper has more than 10 items (so 100 items and more), they will be kicked out and moved to a regular checkout lane. 
   *    A message will print if a shopper is checked out or if the shopper is moved to another checkout lane.
   *    Example:
   *        Express lane 1, shopper had 2 items     or
   *        Shopper in express lane w/  15 items moved to lane 2
   *                     
   * REGULAR LANES: Shoppers in regular lanes will be checkout in the lane that they enter, no matter how much items they have. 
   *    A message will print if a shopper is checked out.
   *    Example:
   *        Regular lane 2, shopper had 17 items
   */
  public void simulateCheckout() { 
    while(shoppersInStore()) {
      //Processes through shoppers in express lanes.
      for (int i = 0; i < expLane.length; i++) {
        if (expLane[i].size() > 0) {
          //Checks to see if shoppers in express lanes have max 10 items. If shopper has 10+ items, they will be moved to a regular checkout lane.
          if (( (Shopper) expLane[i].peek()).getNumItems() >= 11) {
            System.out.println("Shopper in express lane w/  " + ((Shopper) expLane[i].peek()).getNumItems() + " items moved to lane " + (nextRegLane() + expLane.length));
            regLane[nextRegLane].add((Shopper) expLane[i].remove());    //Adds shopper to nextRegLane, removing them from the express lane
          } else {
            System.out.println("Express lane " + i + ", shopper had " + ((Shopper) expLane[i].poll()).getNumItems() + " items");
          }
        }
      } //end of express lane simulation
      // This will simulate/process shoppers that are in regular lanes. 
      for (int i = 0; i < regLane.length; i++) {
        if ( (Shopper) regLane[i].peek() != null) {
          System.out.println("Regular lane " + (i + expLane.length) + ", shopper had " + ( (Shopper) regLane[i].poll()).getNumItems() + " items");
        }
      } //end of regular checkout lane simulation
    } //end of while loop
  } // end of simulateCheckout method

  /**
   * Used with method simulateCheckout. 
   * Returns true if there are still shoppers, returns false no more shoppers (empty queue). 
   */
  private boolean shoppersInStore() {
    //Checks to see if there are still shoppers in regular lanes. 
    for (int i = 0; i < expLane.length; i++) {    
      if (expLane[i].size() > 0) {
        return true;
      }
    }
    //Checks to see if there are still shoppers in regular lanes. 
    for (int i = 0; i < regLane.length; i++) {    
      if (regLane[i].size() > 0) {
        return true;
      }
    }
    return false;
  }

  /**
   * Used to put Shopper into next regular checkout lane if they are remvoed from an express lane. 
   */
  private int nextRegLane() {
    nextRegLane = 0;
    return nextRegLane;
  }

} //end of CheckoutLanes.java 
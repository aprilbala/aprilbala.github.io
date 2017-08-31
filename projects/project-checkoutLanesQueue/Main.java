package edu.hawaii.ics211;

/**
 * 
 * Main.java - Uses CheckoutLanes.java and processes shoppers in the checkout lanes.  
 *
 * @author April-Angela Bala
 * Spring 2017, ICS 211
 * 03-10-2017
 * Homework A06
 */

public class Main {
  
  public static void main(String[] args) {

    /**
     * 2 EXPRESS LANES (max 10 items): Lanes 0 and 1
     * 5 REGULAR LANES (no item limit): Lanes 2-5
     */
    CheckoutLanes checkout = new CheckoutLanes(2, 4); 

    //Adds shoppers to checkout lanes
    checkout.enterLane(0, new Shopper(15));   // Shopper will be moved to another lane
    checkout.enterLane(0, new Shopper(3));
    checkout.enterLane(0, new Shopper(12));   // Shopper will be moved to another lane
    checkout.enterLane(0, new Shopper(1));
    checkout.enterLane(1, new Shopper(2));
    checkout.enterLane(1, new Shopper(11));   // Shopper will be moved to another lane
    checkout.enterLane(1, new Shopper(1));
    checkout.enterLane(1, new Shopper(12));   // Shopper will be moved to another lane
    checkout.enterLane(1, new Shopper(10));
    checkout.enterLane(2, new Shopper(17));
    checkout.enterLane(2, new Shopper(4));
    checkout.enterLane(3, new Shopper(52));
    checkout.enterLane(3, new Shopper(1));
    checkout.enterLane(4, new Shopper(15));
    checkout.enterLane(4, new Shopper(12));
    checkout.enterLane(5, new Shopper(7));
    checkout.enterLane(5, new Shopper(11));
    checkout.enterLane(5, new Shopper(11));
    checkout.enterLane(1, new Shopper(11));   // Shopper will be moved to another lane
    checkout.enterLane(1, new Shopper(31));   // Shopper will be moved to another lane
    checkout.enterLane(0,  new Shopper(5));


    //"Rings up" shoppers, also, moves shoppers with 10+ items in Express checkout lanes to a regular lane. 
    checkout.simulateCheckout();
    
  }
}

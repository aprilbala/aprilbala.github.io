package edu.hawaii.ics211;

/** 
 * CheckoutLanesTest.java 
 *    Tests the example on the Assignment 06 info page.
 *
 * @author April-Angela Bala
 * Spring 2017, ICS 211
 * 03-10-2017
 * Homework A06
 */

public class CheckoutLanesTest {

  public static void main(String[] args) {
   
    CheckoutLanes checkout = new CheckoutLanes(1, 2);
    checkout.enterLane(0, new Shopper(15));
    checkout.enterLane(0, new Shopper(3));
    checkout.enterLane(1, new Shopper(20));
    checkout.enterLane(2, new Shopper(17));
    checkout.simulateCheckout();
   
  }
} //end of CheckoutLanesTest



/**
 * EXPECTED OUTPUT: 
 *    Express lane shopper with 15 items moved to lane 1
 *    Regular lane 1, shopper had 20 items
 *    Regular lane 2, shopper had 17 items
 *    Express lane 0, shopper had 3 items
 *    Regular lane 1, shopper had 15 items
 */

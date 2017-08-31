package edu.hawaii.ics211;

import java.util.NoSuchElementException;

/**
 * CircularArrayQueue.java 
 *    Implements the Queue211 interface using a circular array queue to hold items in a queue.
 *
 * @author April-Angela Bala
 * Spring 2017, ICS 211
 * 03-10-2017
 * Homework A06: Write a simulator of the checkout lines at a store like Foodland. 
 */

public class CircularArrayQueue<E> implements Queue211<E> {
  
  /** Holds the data. */
  private E[] data;
  
  private final static int DEFAULT_CAPACITY = 10;
  
  /** Index of the front of the queue. */
  private int front;
  /** Index of the rear of the queue. */
  private int rear;
  /** Holds the size of the queue.*/
  private int size;
  /** The current capacity of the queue. */
  private int capacity;
  
  //Constructors
  /** Creates a queue with a default initial capacity. */
  public CircularArrayQueue() {
    this(DEFAULT_CAPACITY);
  }
  
  /** Default constructor, creates an empty queue. */
  @SuppressWarnings("unchecked")
  public CircularArrayQueue(int initialCap) {
    this.capacity = initialCap;
    this.data = (E[]) new Object[capacity];
    this.front = 0;
    this.rear = capacity - 1;
    this.size = 0;
  }
  
  //Start of Queue Methods
  /**
   * Adds element to the end of queue.
   * @param e - the element to be added
   * @return true
   * @throws IllegalStateException if the queue is full
   */
  public boolean add(E e) {
    if (size == capacity) {
      throw new IllegalStateException();
    }
    size++;
    rear = (rear + 1) % capacity;
    data[rear] = e;
    return true;
  }

  /**
   * Retrieves, but does not remove the head of queue. 
   * @return the head of the queue
   * @throws NoSuchElementException if the queue is empty
   */
  public E element() {
    if (size == 0) {
      throw new NoSuchElementException();
    } else {
      return data[front];
    }
  }

  /**
   * Adds element to the end of queue.
   * @param e - the element to be added
   * @return true
   */
  public boolean offer(E e) {
    if (size == capacity) {
      reallocate();
    }
    size++;
    rear = (rear + 1) % capacity;
    data[rear] = e;
    return true;
  }

  /**
   * Retrieves, but does not remove the head of queue. 
   * @return the head of the queue or null if queue is empty
   */
  public E peek() {
    if (size == 0) {
      return null;
    } else {
      return data[front];
    }
  }

  /**
   * Retrieves, and removes the head of the queue.
   * @return the head of the queue or null if queue is empty
   */
  public E poll() {
    if (size == 0) {
      return null;
    } else {
      E result = data[front];
      front = (front + 1) % capacity;
      size--;
      return result;
    }
  }

  /**
   * Retrieves, and removes the head of the queue.
   * @return the head of the queue or null if queue is empty
   * @throws NoSuchElementException if the queue is empty
   */
  public E remove() {
    if (size == 0) {
      throw new NoSuchElementException();
    } else {
      E result = data[front];
      front = (front + 1) % capacity;
      size--;
      return result;
    }
  }

  /**
   * Returns the size of the queue.
   */
  public int size() {
    return size;
  }
  
  /**
   * Will double the capacity of the array and reallocates data in array.
   */
  @SuppressWarnings("unchecked")
  private void reallocate() {
    int newCap = 2 * capacity;
    E[] newData = (E[]) new Object[newCap];
    int j = front;
    for (int i = 0; i < size; i++) {
      newData[i] = data[j];
      j = (j + 1) % capacity;
    }
    front = 0;
    rear = size - 1;
    capacity = newCap;
    data = newData;
  }
  
} //end of CircularArrayQueue class

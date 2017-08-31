package edu.hawaii.ics211;

public interface Queue211<E> {
  boolean add(E e);  // adds e to the end of the queue. May throw an IllegalStateException if the queue is full.
  E element(); // Retrieves, but doesn't remove the head of the queue. Throws NoSuchElementException if queue is empty.
  boolean offer(E e); // adds e to the end of the queue. Returns false if the queue is full.
  E peek(); // Retrieves, but doesn't remove the head of the queue. Return null if queue is empty.
  E poll(); // Retrieves and removes the head of the queue. Returns null if the queue is empty.
  E remove(); // Retrieves and removes the head of the queue. Throws NoSuchElementException if queue is empty.
  int size(); // Returns the size of the queue.
}
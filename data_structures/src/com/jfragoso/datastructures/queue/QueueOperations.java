package com.jfragoso.datastructures.queue;

/**
 * Created by jonathanfragoso on 07/06/14.
 */
public interface QueueOperations<E> {
    /**
     * Inserts the specified element into this queue if it is possible to do so immediately without
     * violating capacity restrictions, returning true upon success and throwing an IllegalStateException
     * if no space is currently available.
     *
     * @param element the element we want to insert.
     * @return true if the elements has been added successfully.
     */
    public boolean add(E element);

    /**
     * Retrieves the size of the queue.
     *
     * @return the size of the queue.
     */
    public int size();

    /**
     * Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
     *
     * @return the head of the queue, or null if the queue was empty.
     */
    public E peek();

    /**
     * Retrieves and removes the head of this queue. This will act as the poll
     * operation of Queue impl. from the Java SDK, so will return null if the queue is empty.
     *
     * @return the removed element from the queue or null if the queue was empty.
     */
    public E remove();


    /**
     * Informs about the state of emptiness of the queue.
     * @return true if the queue is empty.
     */
    public boolean isEmpty();

}

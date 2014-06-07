package com.jfragoso.datastructures.queue;


/**
 * Created by jonathanfragoso on 07/06/14.
 * <p/>
 * Implementation of a queue using an array of elements. If the size of the array is reached while adding elements,
 * then it'll throw an {@link java.lang.IllegalStateException}, so the size of the queue is not dynamic.
 */
public class QueueArrayImpl<E> implements QueueOperations<E> {

    /**
     * Initial size of the queue. As we're working with arrays
     * we need to fix the size of this queue.
     */
    private static final int INITIAL_SIZE = 10;

    private E[] elements;
    private int headPosition = -1;
    private int lastElementInsertedPosition = -1;

    public QueueArrayImpl() {
        this(INITIAL_SIZE);
    }

    public QueueArrayImpl(int queueSize) {
        if (queueSize < 1) {
            throw new IllegalArgumentException("You cannot create a queue with a size lower than 1");
        }
        elements = (E[]) new Object[queueSize];
    }

    public QueueArrayImpl(E[] baseElements) {
        if (baseElements == null) {
            throw new NullPointerException();
        }
        if (baseElements.length < 1) {
            throw new IllegalArgumentException("You cannot create a queue with a size lower than 1");
        }
        this.elements = baseElements;
    }

    /**
     * Retrieves the array of elements that contains the queue at the time this method is called.
     *
     * @return the array of elements that contains the queue at the time this method is called.
     */
    public E[] getElements() {
        return this.elements;
    }

    @Override
    public boolean add(E element) {
        if (isEmpty()) {
            headPosition++;
            lastElementInsertedPosition = headPosition;
            this.elements[headPosition] = element;

            return true;
        }
        if (lastElementInsertedPosition == size() - 1) {
            throw new IllegalStateException("The queue reached the maximum number of elements that was able to add.");
        } else {
            this.lastElementInsertedPosition++;
            this.elements[lastElementInsertedPosition] = element;

            return true;
        }
    }

    @Override
    public int size() {
        return lastElementInsertedPosition != -1 ? lastElementInsertedPosition + 1 : 0;
    }

    @Override
    public E peek() {
        return !isEmpty() ? elements[headPosition] : null;
    }

    @Override
    public E remove() {
        if (!isEmpty()) {
            E value = this.elements[headPosition];
            this.elements[headPosition] = null;
            lastElementInsertedPosition--;
            return value;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return headPosition == -1;
    }
}

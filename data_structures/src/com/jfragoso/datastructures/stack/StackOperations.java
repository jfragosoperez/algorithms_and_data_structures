package com.jfragoso.datastructures.stack;

import java.util.EmptyStackException;

/**
 * Created by jonathanfragoso on 09/06/14.
 * <p/>
 * Behaviour operations of a stack
 */
public interface StackOperations<E> {

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty at the time this method is called.
     */
    public boolean isEmpty();

    /**
     * Retrieves the first element located at the top of the stack. Throws and {@link java.util.EmptyStackException}
     * if the stack is empty.
     *
     * @return the first element located at the top of the stack if the stack is not empty.
     * @throws {@link java.util.EmptyStackException} if the stack is empty at the time this method is called.
     */
    public E peek() throws EmptyStackException;

    /**
     * Removes the top element of the stack. Throws and {@link java.util.EmptyStackException}
     * if the stack was empty.
     *
     * @return the element that has been removed from the stack.
     * @throws {@link java.util.EmptyStackException} if the stack is empty at the time this method is called.
     */
    public E pop() throws EmptyStackException;

    /**
     * Adds a new element at the top of the stack.
     *
     * @param item is the item we want to add at the top of the stack.
     * @return the element that has been added into the stack.
     */
    public E push(E item);

    /**
     * Retrieves the number of elements contained into the stack.
     * @return the number of elements containted into the stack.
     */
    public int size();

}

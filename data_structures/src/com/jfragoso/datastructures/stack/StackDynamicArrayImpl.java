package com.jfragoso.datastructures.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by jonathanfragoso on 09/06/14.
 * <p/>
 * Implementation of a dynamic size stack using an array of elements
 */
public class StackDynamicArrayImpl<E> implements StackOperations<E> {

    public static final int INITIAL_SIZE = 10;

    private E[] elements;

    private int size = 0;

    public StackDynamicArrayImpl() {
        this.elements = (E[]) new Object[INITIAL_SIZE];
    }

    @Override
    public boolean isEmpty() {
        return elements[0] == null;
    }

    @Override
    public E peek() throws EmptyStackException {
        checkEmptyStack();

        return elements[0];
    }

    private void checkEmptyStack() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
    }

    @Override
    public E pop() throws EmptyStackException {
        checkEmptyStack();
        E element = elements[size - 1];
        elements[size - 1] = null;
        size--;

        return element;
    }

    @Override
    public E push(E item) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size] = item;
        size++;

        return item;
    }

    @Override
    public int size() {
        return size;
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}

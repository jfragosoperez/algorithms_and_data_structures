package com.jfragoso.datastructures.stack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StackDynamicArrayImplTest {

    private StackDynamicArrayImpl<Integer> stack;

    @Before
    public void setUp() throws Exception {
        stack = new StackDynamicArrayImpl<Integer>();
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(stack.isEmpty());
    }

    @Test(expected = EmptyStackException.class)
    public void testPeek() throws Exception {
        stack.push(1);
        assertTrue(stack.peek() == 1);
        stack.pop();
        stack.peek();
    }

    @Test(expected = EmptyStackException.class)
    public void testPop() throws Exception {
        stack.push(2);
        assertTrue(stack.pop() == 2);
        stack.pop();
    }

    @Test
    public void testPush() throws Exception {
        stack.push(32);
        assertTrue(stack.peek() == 32);
        assertTrue(stack.size() == 1);
    }

    @Test
    public void testStackExpandsSizeWhenNeeded() {
        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);
        assertTrue(stack.size() > StackDynamicArrayImpl.INITIAL_SIZE);
    }

    @Test
    public void testSize() {
        assertTrue(stack.size() == 0);
    }
}
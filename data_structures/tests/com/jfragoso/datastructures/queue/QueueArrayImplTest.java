package com.jfragoso.datastructures.queue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueArrayImplTest {

    private QueueArrayImpl<Integer> newDefaultQueue;

    @Before
    public void setUp() throws Exception {
        newDefaultQueue = new QueueArrayImpl<Integer>();
    }

    @Test
    public void testGetElements() throws Exception {

    }

    @Test(expected = IllegalArgumentException.class)
    public void testQueueWithInvalidSize(){
        new QueueArrayImpl<Integer>(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQueueWithInvalidElementsArray(){
        new QueueArrayImpl<Integer>(new Integer[0]);
    }

    @Test(expected = NullPointerException.class)
    public void testQueueWithNullArray(){
        new QueueArrayImpl<Integer>(null);
    }

    @Test
    public void testAdd() throws Exception {
    }

    @Test
    public void testSize() throws Exception {
        assertEquals(newDefaultQueue.size(), 0);
    }

    @Test
    public void testPeek() throws Exception {
        assertNull(newDefaultQueue.peek());
    }

    @Test
    public void testRemove() throws Exception {
        assertNull(newDefaultQueue.peek());
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(newDefaultQueue.isEmpty());
    }
}
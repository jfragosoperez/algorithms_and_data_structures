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
        QueueArrayImpl<Integer> newQueue = new QueueArrayImpl<Integer>();
        newQueue.add(1);
        newQueue.add(2);
        newQueue.add(4);
        newQueue.add(2);
        newQueue.add(20);

        assertArrayEquals(newQueue.getElements(), new Integer[]{1, 2, 4, 2, 20, null, null, null, null, null});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQueueWithInvalidSize() {
        new QueueArrayImpl<Integer>(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQueueWithInvalidElementsArray() {
        new QueueArrayImpl<Integer>(new Integer[0]);
    }

    @Test(expected = NullPointerException.class)
    public void testQueueWithNullArray() {
        new QueueArrayImpl<Integer>(null);
    }

    @Test
    public void testAdd() throws Exception {
        QueueArrayImpl<String> queue = new QueueArrayImpl<String>();
        queue.add("Hello");
        assertFalse(queue.isEmpty());
        assertEquals(queue.size(), 1);
        assertEquals(queue.peek(), "Hello");
    }

    @Test(expected = IllegalStateException.class)
    public void testAddMoreElementsThanQueueSize() {
        QueueArrayImpl<String> queue = new QueueArrayImpl<String>(3);
        queue.add("Hello");
        queue.add(" what's up?");
        queue.add("I'm fine thank you");
        assertEquals(queue.size(), 3);
        queue.add("Let's add one more element in order to test if it's thrown the exception (we're trying to add one more element than the queue size");
    }

    @Test
    public void testSize() throws Exception {
        assertEquals(newDefaultQueue.size(), 0);
        QueueArrayImpl<Integer> newQueue = new QueueArrayImpl<Integer>();
        newQueue.add(1);
        newQueue.add(3);
        newQueue.add(2);
        assertEquals(newQueue.size(), 3);
    }

    @Test
    public void testPeek() throws Exception {
        assertNull(newDefaultQueue.peek());
        QueueArrayImpl<Integer> newQueue = new QueueArrayImpl<Integer>();
        newQueue.add(1);
        assertEquals(newQueue.size(), 1);
        assertEquals((int) newQueue.peek(), 1);
    }

    @Test
    public void testRemove() throws Exception {
        assertNull(newDefaultQueue.peek());
        QueueArrayImpl<Integer> newQueue = new QueueArrayImpl<Integer>();
        newQueue.add(2);
        newQueue.add(3);
        newQueue.add(1);
        assertEquals(newQueue.size(), 3);
        assertEquals((int) newQueue.remove(), 2);
        assertEquals(newQueue.size(), 2);
        newQueue.remove();
        newQueue.remove();
        assertTrue(newQueue.isEmpty());
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(newDefaultQueue.isEmpty());
        QueueArrayImpl<Integer> newQueue = new QueueArrayImpl<Integer>();
        newQueue.add(1);
        newQueue.remove();
        assertTrue(newQueue.isEmpty());
    }
}
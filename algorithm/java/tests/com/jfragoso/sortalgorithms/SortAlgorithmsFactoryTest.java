package com.jfragoso.sortalgorithms;

import org.junit.Before;
import org.junit.Test;

import static com.jfragoso.sortalgorithms.SortAlgorithmsFactory.SortAlgorithmType;
import static org.junit.Assert.*;

public class SortAlgorithmsFactoryTest {

    private int[] integerArrayInput;
    private int[] expectedOutput = new int[]{1, 2, 3, 22, 30, 39, 39, 40};

    @Before
    public void setUp() throws Exception {
        integerArrayInput = new int[]{30, 22, 39, 40, 2, 1, 3, 39};
    }

    @Test(expected = NullPointerException.class)
    public void testExceptionIsThrown_ifUndefinedSortAlgorithmTypeIsRequested(){
        SortAlgorithmsFactory.create(null);
    }


    @Test
    public void testCreateSortAlgorithmsByType() throws Exception {
        assertNotNull(SortAlgorithmsFactory.create(SortAlgorithmType.INSERTION_SORT));
        assertEquals(SortAlgorithmsFactory.create(SortAlgorithmType.INSERTION_SORT).getClass(), InsertionSort.class);
        assertNotNull(SortAlgorithmsFactory.create(SortAlgorithmType.QUICK_SORT));
        assertEquals(SortAlgorithmsFactory.create(SortAlgorithmType.QUICK_SORT).getClass(), QuickSort.class);
        assertNotNull(SortAlgorithmsFactory.create(SortAlgorithmType.MERGE_SORT));
        assertEquals(SortAlgorithmsFactory.create(SortAlgorithmType.MERGE_SORT).getClass(), MergeSort.class);
    }
}
package com.jfragoso.sortalgorithms;

import org.junit.Test;

import static com.jfragoso.sortalgorithms.SortAlgorithmsFactory.SortAlgorithmType;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SortAlgorithmsFactoryTest {

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
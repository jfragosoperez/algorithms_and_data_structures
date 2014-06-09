package com.jfragoso.sortalgorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jonathanfragoso on 08/06/14.
 */
public class SortAlgorithmsTest {

    protected int[] integerArrayInput;
    protected int[] expectedOutput = new int[]{1, 2, 2, 3, 11, 13, 20, 20, 22, 22, 30, 39, 39, 40, 43, 69};

    @Before
    public void setUp() throws Exception {
        integerArrayInput = new int[]{30, 22, 39, 40, 2, 1, 3, 39, 20, 20, 2, 43, 69, 13, 11, 22};
    }

    @Test
    public void testMergeSort() {
        MergeSort mergeSort = (MergeSort) SortAlgorithmsFactory.create(SortAlgorithmsFactory.SortAlgorithmType.MERGE_SORT);
        Assert.assertArrayEquals(mergeSort.sortIntegerArray(integerArrayInput), expectedOutput);
    }

    @Test
    public void testQuickSort() {
        QuickSort quickSort = (QuickSort) SortAlgorithmsFactory.create(SortAlgorithmsFactory.SortAlgorithmType.QUICK_SORT);
        Assert.assertArrayEquals(quickSort.sortIntegerArray(integerArrayInput), expectedOutput);
    }

    @Test
    public void testInsertionSort() {
        InsertionSort insertionSort = (InsertionSort) SortAlgorithmsFactory.create(SortAlgorithmsFactory.SortAlgorithmType.INSERTION_SORT);
        Assert.assertArrayEquals(insertionSort.sortIntegerArray(integerArrayInput), expectedOutput);
    }
}

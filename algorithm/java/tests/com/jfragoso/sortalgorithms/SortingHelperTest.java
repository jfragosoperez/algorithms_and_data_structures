package com.jfragoso.sortalgorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortingHelperTest {

    private int[] integerArrayInput;
    private int[] expectedOutput = new int[]{1, 2, 3, 22, 30, 39, 39, 40};

    @Before
    public void setUp() throws Exception {
        integerArrayInput = new int[]{30, 22, 39, 40, 2, 1, 3, 39};
    }

    @Test
    public void testSortIntegersArray() throws Exception {
    }

    @Test(expected = NullPointerException.class)
    public void testExceptionIsThrownIfUndefinedAlgorithm() {
        SortingHelper.sortIntegerArray(integerArrayInput, null);
    }

    @Test
    public void testInsertionSort() throws Exception {
        assertArrayEquals(expectedOutput, SortingHelper.insertionSort(integerArrayInput));
    }

    @Test
    public void testQuickSort() throws Exception {
        assertArrayEquals(expectedOutput, SortingHelper.quickSort(integerArrayInput));
    }

    @Test
    public void testMergeSort() throws Exception {
        assertArrayEquals(expectedOutput, SortingHelper.mergeSort(integerArrayInput));
    }
}
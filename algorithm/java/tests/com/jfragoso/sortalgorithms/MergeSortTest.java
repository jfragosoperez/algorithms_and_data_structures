package com.jfragoso.sortalgorithms;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest extends SortAlgorithmTest{


    @Test
    public void testSortIntegerArray() throws Exception {
        MergeSort mergeSort = (MergeSort)SortAlgorithmsFactory.create(SortAlgorithmsFactory.SortAlgorithmType.MERGE_SORT);
        Assert.assertArrayEquals(mergeSort.sortIntegerArray(integerArrayInput), expectedOutput);
    }
}
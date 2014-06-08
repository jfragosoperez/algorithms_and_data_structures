package com.jfragoso.sortalgorithms;

/**
 * Created by jonathanfragoso on 08/06/14.
 *
 * Interface from which will inherit all the sort algorithms.
 */
public interface SortAlgorithm{

    /**
     *
     * Sorts in ascending order an integer array input.
     *
     * @param integersArray is the array of integers that we want to sort.
     * @return the integer array sorted in ascending order.
     */
    public int[] sortIntegerArray(int[] integersArray);
}

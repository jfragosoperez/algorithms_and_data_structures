package com.jfragoso.sortalgorithms;

/**
 * Created by jonathanfragoso on 08/06/14.
 *
 * Factory that creates the different kind of sort algorithms.
 */
public final class SortAlgorithmsFactory {

    private SortAlgorithmsFactory(){}

    public enum SortAlgorithmType {
        INSERTION_SORT, QUICK_SORT, MERGE_SORT
    }

    /**
     * Retrieves a new instance of the algorithm requested.
     * @param type is the type of the sort algorithm that we want to retrieve
     * @return returns a new instance of the algorithm requested.
     */
    public static SortAlgorithm create(SortAlgorithmType type){
        if (type == null) {
            throw new NullPointerException("You must select the type of algorithm you want to apply.");
        }
        if (type.equals(SortAlgorithmType.INSERTION_SORT)) {
            return new InsertionSort();
        } else if (type.equals(SortAlgorithmType.QUICK_SORT)) {
            return new QuickSort();
        } else {
            return new MergeSort();
        }
    }
}

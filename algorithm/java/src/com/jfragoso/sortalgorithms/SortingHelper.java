package com.jfragoso.sortalgorithms;

/**
 * This helper class will help us to sort elements using some of the most common sorting algorithms.
 */
public final class SortingHelper {


    public enum SortAlgorithmType {
        INSERTION_SORT, QUICK_SORT, MERGE_SORT
    }

    /**
     * Sorts an array of integers using the requested algorithm.
     *
     * @param integersArray is the integer array we want to sort
     * @param type         is the type of sorting we want to apply (the algorithm)
     * @return the list with the elements sorted in ascending order
     */
    public static int[] sortIntegerArray(int[] integersArray, SortAlgorithmType type) {
        if (type == null) {
            throw new NullPointerException("You must select the type of algorithm you want to apply.");
        }
        if (type.equals(SortAlgorithmType.INSERTION_SORT)) {
            insertionSort(integersArray);
        } else if (type.equals(SortAlgorithmType.QUICK_SORT)) {
            quickSort(integersArray);
        } else {
            mergeSort(integersArray);
        }
        return integersArray;
    }


    /**
     * More efficient in practice than most other simple quadratic
     * (i.e., O(n2)) algorithms such as selection sort or bubble sort;
     * When humans manually sort something (for example, a deck of
     * playing cards), most use a method that is similar to insertion
     * sort.
     * <p/>
     * best case (nearly sorted input) is O(n)
     * average --> O(n^2) comparisons
     * worst case --> O(n^2)
     * <p/>
     * Space complexity --> O(1)
     *
     * @param integersArray is the integer array we want to sort
     * @return the list with the elements sorted in ascending order
     */
    public static int[] insertionSort(int[] integersArray) {
        return integersArray;
    }


    /**
     * Choosing a random pivot minimizes the chance that
     * you will encounter worst-case O(n2) performance (always
     * choosing first or last would cause worst-case performance
     * for nearly-sorted or nearly-reverse-sorted data). Choosing
     * the middle element would also be acceptable in the majority of cases.
     * Quicksort is usually faster than other O(nlogn) algorithms
     * <p/>
     * best case --> O(nlogn) comparisons
     * average --> O(nlogn) comparisons
     * worst case --> O(n^2)
     * <p/>
     * Space complexity --> Worst: O(n)
     *
     * @param integersArray is the integer array we want to sort
     * @return the list with the elements sorted in ascending order
     */
    public static int[] quickSort(int[] integersArray) {
        return integersArray;
    }

    public static int[] mergeSort(int[] integersArray) {
        return integersArray;
    }

}

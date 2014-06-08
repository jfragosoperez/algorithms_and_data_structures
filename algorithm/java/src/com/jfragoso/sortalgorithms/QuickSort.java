package com.jfragoso.sortalgorithms;

/**
 * Created by jonathanfragoso on 08/06/14.
 *
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
 */
public final class QuickSort implements SortAlgorithm{

    @Override
    public int[] sortIntegerArray(int[] elements) {
        return elements;
    }
}

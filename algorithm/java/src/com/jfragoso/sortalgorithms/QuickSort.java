package com.jfragoso.sortalgorithms;

import java.util.Random;

/**
 * Created by jonathanfragoso on 08/06/14.
 * <p/>
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
 */
public final class QuickSort implements SortAlgorithm {

    @Override
    public int[] sortIntegerArray(int[] elements) {
        return quickSort(0, elements.length - 1, elements);
    }

    private int[] quickSort(int low, int high, int[] elements) {
        int i = low, j = high;

        int pivot = elements[randInt(low, (low + (high - low) / 2))];

        // Divide into two lists
        while (i <= j) {
            // get the next element from the left list if current element value from that list is smaller than tha pivot
            while (elements[i] < pivot) {
                i++;
            }
            //get next element from the right list if current element value is larger than pivot one
            while (elements[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(i, j, elements);
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(low, j, elements);
        if (i < high)
            quickSort(i, high, elements);

        return elements;
    }

    /**
     * Returns a random integer that fits into the max/min interval
     * @param min is the minimum value of the interval
     * @param max is the maximum value of the interval
     * @return a random integer between max/min value
     */
    private int randInt(int min, int max) {

        // Usually this should be a field rather than a method variable so
        // that it is not re-seeded every call.
        Random rand = new Random();

        return rand.nextInt((max - min) + 1) + min;
    }

    private void exchange(int i, int j, int[] elements) {
        int temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }
}

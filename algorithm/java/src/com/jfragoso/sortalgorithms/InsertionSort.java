package com.jfragoso.sortalgorithms;

/**
 * Created by jonathanfragoso on 08/06/14.
 *
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
 */
public final class InsertionSort implements SortAlgorithm{

    @Override
    public int[] sortIntegerArray(int[] integersArray) {
        int newValue, j;
        for (int i = 1; i < integersArray.length; i++) {
            j = i;
            newValue = integersArray[j];
            while (j > 0 && integersArray[j - 1] > newValue) {
                integersArray[j] = integersArray[j - 1];
                j--;
            }
            integersArray[j] = newValue;
        }
        return integersArray;
    }
}

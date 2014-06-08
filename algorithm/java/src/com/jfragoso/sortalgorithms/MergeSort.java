package com.jfragoso.sortalgorithms;

/**
 * Created by jonathanfragoso on 08/06/14.
 */
public final class MergeSort implements SortAlgorithm{

    @Override
    public int[] sortIntegerArray(int[] elements) {
        if (elements.length <= 1) {
            return elements;
        }

        int[] firstPart = new int[elements.length / 2];
        int[] secondPart = new int[elements.length - firstPart.length];
        System.arraycopy(elements, 0, firstPart, 0, firstPart.length);
        System.arraycopy(elements, firstPart.length, secondPart, 0, secondPart.length);

        sortIntegerArray(firstPart);
        sortIntegerArray(secondPart);

        merge(firstPart, secondPart, elements);
        return elements;
    }

    private void merge(int[] first, int[] second, int [] result) {
        int elementPositionOfFirstArray = 0;
        int elementPositionOfSecondArray = 0;

        // Next open position in the result
        int j = 0;

        while (elementPositionOfFirstArray < first.length && elementPositionOfSecondArray < second.length) {
            if (first[elementPositionOfFirstArray] < second[elementPositionOfSecondArray]) {
                result[j] = first[elementPositionOfFirstArray];
                elementPositionOfFirstArray++;
            } else {
                result[j] = second[elementPositionOfSecondArray];
                elementPositionOfSecondArray++;
            }
            j++;
        }

        System.arraycopy(first, elementPositionOfFirstArray, result, j, first.length - elementPositionOfFirstArray);
        System.arraycopy(second, elementPositionOfSecondArray, result, j, second.length - elementPositionOfSecondArray);
    }

}

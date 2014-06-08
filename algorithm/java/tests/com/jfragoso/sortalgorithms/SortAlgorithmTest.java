package com.jfragoso.sortalgorithms;

import org.junit.Before;

/**
 * Created by jonathanfragoso on 08/06/14.
 */
public class SortAlgorithmTest {

    protected int[] integerArrayInput;
    protected int[] expectedOutput = new int[]{1, 2, 3, 22, 30, 39, 39, 40};

    @Before
    public void setUp() throws Exception {
        integerArrayInput = new int[]{30, 22, 39, 40, 2, 1, 3, 39};
    }
}

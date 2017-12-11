package com.ajt;

import com.google.common.collect.Lists;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestInsertionSort extends AbstractTest {

    @Test
    public static void testInsertionPreSorted() {
        InsertionSort insertionSort = new InsertionSort();

        assertThat(insertionSort.apply(new ArrayList<>(sortedList)), is(sortedList));
    }

    @Test
    public static void testInsertionReversed() {
        InsertionSort insertionSort = new InsertionSort();

        assertThat(insertionSort.apply(Lists.reverse(new ArrayList<>(sortedList))), is(sortedList));
    }
}

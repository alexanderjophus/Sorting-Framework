package com.ajt;

import com.google.common.collect.Lists;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestSelectionSort extends AbstractTest {

    @Test
    public static void testSelectionPreSorted() {
        SelectionSort selectionSort = new SelectionSort();

        assertThat(selectionSort.apply(new ArrayList<>(sortedList)), is(sortedList));
    }

    @Test
    public static void testSelectionReversed() {
        SelectionSort selectionSort = new SelectionSort();

        assertThat(selectionSort.apply(Lists.reverse(new ArrayList<>(sortedList))), is(sortedList));
    }
}

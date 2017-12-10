package com.ajt;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import com.google.common.collect.Lists;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestAlgorithms {

   private final static List<String> sortedList = new ArrayList<>(){{
       add("Alpha");
       add("Beta");
       add("Charlie");
       add("Delta");
       add("Echo");
       add("Foxtrot");
    }};

    @Test
    public static void testBubblePreSorted() {
        BubbleSort bubbleSort = new BubbleSort();

        assertThat(bubbleSort.apply(new ArrayList<>(sortedList)), is(sortedList));
    }

    @Test
    public static void testBubbleReversed() {
        BubbleSort bubbleSort = new BubbleSort();

        assertThat(bubbleSort.apply(Lists.reverse(new ArrayList<>(sortedList))), is(sortedList));
    }

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
    @Test
    public static void testShellPreSorted() {
        ShellSort shellSort = new ShellSort();

        assertThat(shellSort.apply(new ArrayList<>(sortedList)), is(sortedList));
    }

    @Test
    public static void testShellReversed() {
        ShellSort shellSort = new ShellSort();

        assertThat(shellSort.apply(Lists.reverse(new ArrayList<>(sortedList))), is(sortedList));
    }
}

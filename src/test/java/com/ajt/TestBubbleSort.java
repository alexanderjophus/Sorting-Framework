package com.ajt;

import com.google.common.collect.Lists;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestBubbleSort extends AbstractTest {

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
}

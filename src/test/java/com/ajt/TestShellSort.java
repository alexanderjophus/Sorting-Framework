package com.ajt;

import com.google.common.collect.Lists;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestShellSort extends AbstractTest {

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

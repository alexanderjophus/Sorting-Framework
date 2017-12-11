package com.ajt;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

final public class InsertionSort extends ISorter {
    @Override
    final public <T extends Comparable> List<T> apply(final List<T> unsorted) {
        List<T> list = new ArrayList<>(unsorted);
        for (int i = 1; i < list.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (list.get(j).compareTo(list.get(j-1)) < 0) {
                    swap(list, j, j-1);
                }
            }
        }
        return list;
    }

    @Override
    public String toString() {
        return "InsertionSort{}";
    }
}

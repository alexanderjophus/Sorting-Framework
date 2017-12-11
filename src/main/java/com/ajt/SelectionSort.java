package com.ajt;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class SelectionSort extends ISorter {

    @Override
    final public <T extends Comparable> List<T> apply(final List<T> unsorted) {
        List<T> list = new ArrayList<>(unsorted);
        for (int i = 0; i < list.size(); i++) {
            int selection = i;
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(selection)) < 0) {
                    selection = j;
                }
            }
            swap(list, i, selection);
        }
        return list;
    }

    @Override
    public String toString() {
        return "SelectionSort{}";
    }
}

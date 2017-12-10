package com.ajt;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

final public class BubbleSort extends ISortable {
    @Override
    final public <T extends Comparable> List<T> apply(List<T> unsorted) {
        List<T> list = new ArrayList<>(unsorted);
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - (1+i); j++) {
                if (list.get(j).compareTo(list.get(j+1)) > 0) {
                    swap(list, j, j+1);
                }
            }
        }
        return list;
    }

    @Override
    public String toString() {
        return "BubbleSort{}";
    }
}

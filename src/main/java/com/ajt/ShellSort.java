package com.ajt;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class ShellSort extends ISorter {
    @Override
    final public <T extends Comparable> List<T> apply(List<T> unsorted) {
        List<T> list = new ArrayList<>(unsorted);
        for (int gap = list.size()/2; gap > 0; gap /= 2) {
            for (int i = gap; i < list.size(); i++) {
                T tmp = list.get(i);
                for (int j = i; j >= gap && (list.get(j-gap).compareTo(tmp) > 0); j-=gap) {
                    if (list.get(j).compareTo(list.get(j-gap)) < 0) {
                        swap(list, j, j-gap);
                    }
                }
            }
        }
        return list;
    }

    @Override
    public String toString() {
        return "ShellSort{}";
    }
}

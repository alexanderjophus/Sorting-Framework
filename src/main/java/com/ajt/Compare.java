package com.ajt;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Compare {
    public static void main(String[] args) {
        final List<String> list = new ArrayList<>() {{ }};
        for (int i = 0; i < 1000; i++) {
            list.add(UUID.randomUUID().toString());
        }

        System.out.println(list);

        final List<ISortable> implementations = new ArrayList<>(){{
            add(SortingAlgorithms.SHELL_SORT);
            add(SortingAlgorithms.SELECTION_SORT);
            add(SortingAlgorithms.BUBBLE_SORT);
            add(SortingAlgorithms.INSERTION_SORT);
        }};
        implementations.forEach(impl -> System.out.println(impl.toString() + "\nDuration: " + impl.sort(list) + "\n"));
    }
}

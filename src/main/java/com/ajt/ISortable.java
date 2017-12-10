package com.ajt;

import java.util.ArrayList;
import java.util.List;

abstract class ISortable {
    abstract <T extends Comparable> List<T> apply(final List<T> list);

    long sort(List<? extends Comparable> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            apply(new ArrayList<>(list));
        }
        long endTime   = System.nanoTime();
        return(endTime - startTime);
    }

}

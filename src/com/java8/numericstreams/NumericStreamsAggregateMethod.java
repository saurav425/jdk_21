package com.java8.numericstreams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamsAggregateMethod {

    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,50).sum());
        Integer maxInt = IntStream.rangeClosed(1,50).max().orElse(0);
        System.out.println(maxInt);
        Integer minInt = IntStream.rangeClosed(1,50).min().orElse(9999);
        System.out.println(minInt);
        Double average = IntStream.rangeClosed(1,50).average().orElse(0.0);
        System.out.println(average);


    }
}

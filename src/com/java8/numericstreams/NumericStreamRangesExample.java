package com.java8.numericstreams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);
        System.out.println("count :: "+ intStream.count());
        intStream = IntStream.rangeClosed(1,50);
        System.out.println("count closed :: "+ intStream.count());
        System.out.println(IntStream.rangeClosed(1,50).mapToObj(String::valueOf).collect(Collectors.joining(",")));

        //Long Streams
        LongStream longStream = LongStream.range(1,50);
        System.out.println("Long Count :: "+longStream.count());
        longStream = LongStream.rangeClosed(1,50);
        System.out.println(longStream.mapToObj(String::valueOf).collect(Collectors.joining(",")));
        System.out.println(LongStream.range(1,50).asDoubleStream().mapToObj(String::valueOf).collect(Collectors.joining(",")));



    }
}

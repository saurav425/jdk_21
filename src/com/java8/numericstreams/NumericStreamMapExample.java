package com.java8.numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class NumericStreamMapExample {
    public static int mapToObj(){
         return IntStream.rangeClosed(1,5).mapToObj(Integer::valueOf).mapToInt(i->i).sum();
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1,5).mapToDouble(Double::valueOf).sum();
    }

    public static long mapToLong(){
        return IntStream.rangeClosed(1,5).mapToLong(Long :: valueOf).sum();
    }

    public static void main(String[] args) {
        System.out.println("mapToObj :: "+mapToObj());
        System.out.println("mapToLong ::"+mapToLong());
        System.out.println("mapToDouble :; "+mapToDouble());
    }
}

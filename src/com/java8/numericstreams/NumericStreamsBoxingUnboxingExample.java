package com.java8.numericstreams;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {
    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,50).boxed().toList();
    }

    public static int unboxing(List<Integer> integerList){
        return integerList.stream().mapToInt(Integer::intValue).sum();
    }
    public static void main(String[] args) {
        System.out.println("Boxing ::"+boxing());
        System.out.println("UnBoxing ::"+unboxing(boxing()));
    }
}

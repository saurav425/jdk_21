package com.java8.numericstreams;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {
    public static int sumOfNumbers(List<Integer> integerList){
        return integerList.stream().reduce(0,(x,y)->x+y);
    }

    public static int sumOfNumbersIntStream(){
        return IntStream.rangeClosed(1,6).sum();
    }
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5,6);
        System.out.println(sumOfNumbers(integerList));
        System.out.println(sumOfNumbersIntStream());
    }
}


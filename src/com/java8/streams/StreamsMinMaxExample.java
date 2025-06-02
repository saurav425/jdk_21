package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {
    
    public static Optional<Integer> findMaxValue(List<Integer> integerList){
        return integerList.stream().reduce((a,b)->a>b ? a : b);
    }

    public static Optional<Integer> findMinValue(List<Integer> integerList){
        return integerList.stream().reduce((a,b)->a<b ? a : b);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        Optional<Integer> integer = findMaxValue(integerList);
        System.out.println(integer.get());
        integer = findMaxValue(new ArrayList<>());
        if (integer.isPresent())
             System.out.println(integer.get());
        else
            System.out.println("No Max value");

        integer = findMinValue(integerList);
        integer.ifPresent(System.out::println);
        integer = findMinValue(new ArrayList<>());
        if (integer.isPresent())
            System.out.println(integer.get());
        else
            System.out.println("No Min value");
        
    }
}

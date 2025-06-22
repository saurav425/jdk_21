package com.java8.streams;

import java.util.stream.Stream;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer [] arr = {1,2,3,4,5,6,6,7,8};
        Stream.of(arr).distinct().forEach(System.out::println);
    }
}

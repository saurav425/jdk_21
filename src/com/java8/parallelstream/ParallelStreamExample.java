package com.java8.parallelstream;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static int seqSum(){
        long startTime = System.currentTimeMillis();
        System.out.println("Start Time "+ startTime);
        int sum = IntStream.rangeClosed(1,1000000).sum();
        long endTime = System.currentTimeMillis();;
        System.out.println("End Time "+ endTime);
        System.out.println("Time Taken :: " + (endTime - startTime));
        return sum;
    }

    public static int parralelSum(){
        long startTime = System.currentTimeMillis();
        System.out.println("Start Time "+ startTime);
        int sum = IntStream.rangeClosed(1,1000000).parallel().sum();
        long endTime = System.currentTimeMillis();;
        System.out.println("End Time "+ endTime);
        System.out.println("Time Taken :: " + (endTime - startTime));
        return sum;
    }

    public static void main(String[] args) {
        seqSum();
        parralelSum();
    }
}

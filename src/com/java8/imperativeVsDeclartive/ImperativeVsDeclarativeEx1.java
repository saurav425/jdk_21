package com.java8.imperativeVsDeclartive;

import java.util.stream.IntStream;

import static java.lang.System.out;

/**
 * Sum of integers from 1 to 100
 */
public class ImperativeVsDeclarativeEx1 {
    public static void main(String[] args) {
        /*
        Imperative
         */
        int sum =0;
        for (int i=0;i<=100;i++){
            sum+=i;
        }
        out.println("Sum Imperative Way : "+ sum);
          /*
        Declarative
         */
        sum = IntStream.rangeClosed(1,100).sum();
        out.println("Sum Declarative Way : "+ sum);
    }
}

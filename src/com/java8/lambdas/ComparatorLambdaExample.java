package com.java8.lambdas;

import java.util.Comparator;

import static java.lang.Integer.compare;
import static java.lang.System.out;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /*
         * prior Java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        out.println("Comparator Result : " + comparator.compare(3,4));

        /*
        Java 8 way
         */
        Comparator<Integer> comparator1 = (a,b) ->a.compareTo(b);
        out.println("Comparator new way : "+ comparator1.compare(3,4));
    }
}

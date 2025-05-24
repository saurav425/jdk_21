package com.java8.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static BinaryOperator<Integer> binaryOperator = (a, b)->a*b;
    static Comparator<Integer> comparator = (a,b)->a.compareTo(b);
    public static void main(String[] args) {
        System.out.println(binaryOperator.apply(3,4));
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(8,5));
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(Integer::compareTo);
        System.out.println(minBy.apply(8,5));
    }
}

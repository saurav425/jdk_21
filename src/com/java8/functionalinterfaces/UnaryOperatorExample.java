package com.java8.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    static UnaryOperator<String> unaryOperator = (s -> s.concat("Unary_Operator"));
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Hello! "));
        UnaryOperator<String> unaryIdentity = UnaryOperator.identity();
        System.out.println(unaryIdentity.apply("Hello! Identity"));
    }
}

package com.java8.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> predicate = (a) -> a%2==0;
    static Predicate<Integer> predicate1 = (a) -> a%5==0;

    static void predicateAnd(){
        System.out.println("And Predicate : "+predicate.and(predicate1).test(10));
        System.out.println("And Predicate : "+predicate.and(predicate1).test(9));
    }

    static void predicateOr(){
        System.out.println("Or Predicate : "+predicate.or(predicate1).test(10));
        System.out.println("Or Predicate : "+predicate.or(predicate1).test(9));
    }
    public static void main(String[] args) {
        System.out.println(predicate.test(4));
        predicateAnd();
        System.out.println("=======================");
        predicateOr();
        System.out.println("=======================");
        predicateNegate();
    }

    private static void predicateNegate() {
        System.out.println("Predicate Negate : "+predicate.negate().test(4));
        System.out.println("And Predicate Negate : "+predicate.and(predicate1).negate().test(10));
        System.out.println("And Predicate Negate : "+predicate.and(predicate1).negate().test(9));
        System.out.println("Or Predicate Negate : "+predicate.or(predicate1).negate().negate().test(10));
        System.out.println("Or Predicate Negate : "+predicate.or(predicate1).negate().test(9));

    }
}

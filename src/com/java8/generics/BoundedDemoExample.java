package com.java8.generics;

public class BoundedDemoExample {
    public static void main(String[] args) {
        Double [] doubleArray = {1.0,2.0,3.0,4.0};
        NonBoundedExample<Double> nonBoundedExample = new NonBoundedExample<>(doubleArray);
        System.out.println(nonBoundedExample.average());
    }
}

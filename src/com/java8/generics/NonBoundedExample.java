package com.java8.generics;

public class NonBoundedExample <T extends Number> {

    T [] nums;

    NonBoundedExample(T [] nums){
        this.nums = nums;
    }

    double average(){
        double avg = 0.0;
        for (T num : nums) {
            //avg += d.doubleValue(); //Error without T extends Number
            avg += num.doubleValue();
        }
        return avg;
    }
}

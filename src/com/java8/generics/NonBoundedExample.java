package com.java8.generics;

public class NonBoundedExample <T> {

    T [] nums;

    NonBoundedExample(T [] nums){
        this.nums = nums;
    }

    double average(){
        double avg = 0.0;
        for(int i=0; i< nums.length ; i++){
            double d = (double) nums[i];
            //avg += d.doubleValue(); //Error
        }
        return avg;
    }
}

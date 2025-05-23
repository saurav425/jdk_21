package com.java8.imperativeVsDeclartive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class ImperativeVsDeclarativeEx2 {
    public static void main(String[] args) {
        /*
         * Imperative Way to remove duplicate values
         */
        List<Integer> list = Arrays.asList(1,2,3,4,5,5,5,6,7,8,9,1,2,1);
        List<Integer> uniqueList = new ArrayList<>();

        for (Integer i:list){
            if(!uniqueList.contains(i))
                uniqueList.add(i);
        }
        out.println("uniqueList :"+ uniqueList);


    /*
    Declarative Way
     */
        List<Integer> uniqueList1 = list.stream().distinct().toList();
        out.println("uniqueList1 :"+uniqueList1);
    }

}

package com.java8.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("adam");
        list.add("Nusrat");
        list.add("Darky");
        list.add("Whitey");

        list.removeFirst();

        for(String name : list)
            System.out.println(name);

        Stream<String> nameStream =  list.stream();
        nameStream.forEach(System.out::println);
        //Run Time Exception expected
        nameStream.forEach(System.out::println);
    }
}

package com.java8.streams_terminal;

import com.java8.data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamsCountingExample {
    public static long count(){
        return StudentDatabase.getAllStudents().stream().collect(Collectors.counting());
    }
    public static void main(String[] args) {
        System.out.println("Count :: "+count());
    }
}

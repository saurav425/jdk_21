package com.java8.streams_terminal;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    public static String joining_1(){
        return StudentDatabase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining());
    }

    public static String joining_2(){
        return StudentDatabase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-"));
    }

    public static String joining_3(){
        return StudentDatabase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-","(",")"));
    }
    public static void main(String[] args) {
        System.out.println("joining_1 :: "+joining_1());
        System.out.println("joining_2 :: "+joining_2());
        System.out.println("joining_3 :: "+joining_3());
    }
}

package com.java8.streams;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsMapExample {
    public static List<String> nameList(){
        Function<Student,String> stringFunction = Student::getName;
        return StudentDatabase.getAllStudents().stream().map(stringFunction).map(String::toUpperCase).toList();
    }

    public static Set<String> nameSet(){
        Function<Student,String> stringFunction = Student::getName;
        return StudentDatabase.getAllStudents().stream().map(stringFunction).map(String::toUpperCase).collect(Collectors.toSet());
    }
    public static void main(String[] args) {
        System.out.println( nameList());
        System.out.println( nameSet());
    }
}

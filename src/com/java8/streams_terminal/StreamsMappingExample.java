package com.java8.streams_terminal;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMappingExample {
    public static void main(String[] args) {
        List<String> nameList = StudentDatabase.getAllStudents().stream().collect(Collectors.mapping(Student::getName, Collectors.toList()));
        nameList.stream().forEach(System.out::println);
        System.out.println("=================================================================");
        nameList = StudentDatabase.getAllStudents().stream().map(Student::getName).toList();
        nameList.stream().forEach(System.out::println);
    }
}

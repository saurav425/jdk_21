package com.java8.streams_terminal;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinByMaxByExample {

    public static void main(String[] args) {
        List<Student> students = StudentDatabase.getAllStudents();
        Optional<Student> maxByStudent = students.stream().collect(Collectors.maxBy(Comparator.comparing(Student :: getGpa)));
        System.out.println(maxByStudent.get());
        Optional<Student> minByStudent = students.stream().collect(Collectors.minBy(Comparator.comparing(Student :: getGpa)));
        System.out.println(minByStudent.get());
    }
}

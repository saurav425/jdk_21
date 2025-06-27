package com.java8.streams_terminal;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsPartioningByExample {
    public static void main(String[] args) {
        Map<Boolean, List< Student >> map =StudentDatabase.getAllStudents().stream().collect(Collectors.partitioningBy(student -> student.getGpa()>=3.6));
        System.out.println(map);
        Map<Boolean, Set<Student>> students = StudentDatabase.getAllStudents().stream().collect(Collectors.partitioningBy(student -> student.getGpa()>=3.6,Collectors.toSet()));
        System.out.println(students);

    }
}

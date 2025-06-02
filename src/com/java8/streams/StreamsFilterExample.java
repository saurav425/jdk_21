package com.java8.streams;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.List;

public class StreamsFilterExample {

    public static List<Student> filterStudents(List<Student> students){
        return students.stream().
        filter(student -> student.getGender().equalsIgnoreCase("female")).
                filter(student -> student.getGpa()>=3.9).toList();
    }

    public static void main(String[] args) {
        System.out.println(filterStudents(StudentDatabase.getAllStudents()));
    }
}

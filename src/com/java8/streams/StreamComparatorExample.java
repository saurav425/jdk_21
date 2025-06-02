package com.java8.streams;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;

public class StreamComparatorExample {
    public static List<Student> sortStudentByName(List<Student> students){
        return students.stream().sorted(Comparator.comparing(Student::getName)).toList();
    }

    public static List<Student> sortStudentByGrade(List<Student> students){
        return students.stream().sorted(Comparator.comparing(Student::getGradeLevel).reversed()).toList();
    }

    public static List<Student> sortStudentByGpa(List<Student> students){
        return students.stream().sorted(Comparator.comparing(Student::getGpa).reversed()).toList();
    }
    public static void main(String[] args) {
        List<Student> students = StudentDatabase.getAllStudents();
        sortStudentByName(students).forEach(System.out::println);
        sortStudentByGrade(students).forEach(System.out::println);
        sortStudentByGpa(students).forEach(System.out::println);
    }
}

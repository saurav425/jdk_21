package com.java8.streams_terminal;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsSumAvgExample {
    public static void main(String[] args) {
        List<Student> students = StudentDatabase.getAllStudents();
        Integer sumNotebooks = students.stream().collect(Collectors.summingInt(Student::getNotebooks));
        System.out.println(sumNotebooks);
        sumNotebooks = students.stream().mapToInt(Student :: getNotebooks).sum();
        System.out.println(sumNotebooks);

        Double avgGpa = students.stream().collect(Collectors.averagingDouble(Student :: getGpa));
        System.out.println(avgGpa);
        avgGpa = students.stream().mapToDouble(Student::getGpa).average().getAsDouble();
        System.out.println(avgGpa);


    }
}

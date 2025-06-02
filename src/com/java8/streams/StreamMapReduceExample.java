package com.java8.streams;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.List;

public class StreamMapReduceExample {
    public static int noOfNotebooks(List<Student> students){
        return students.stream().filter(student -> student.getGradeLevel()>3)
                .filter(student -> student.getGender().equalsIgnoreCase("female")).
                map(Student::getNotebooks).reduce(0, Integer::sum);
    }
    public static void main(String[] args) {
        List<Student> students = StudentDatabase.getAllStudents();
        System.out.println(noOfNotebooks(students));
    }
}

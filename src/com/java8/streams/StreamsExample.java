package com.java8.streams;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        Predicate<Student> gradePredicate = student -> student.getGradeLevel()>=3;
        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.9;
        Map<String, List<String>> activityMap = StudentDatabase.getAllStudents().parallelStream().peek(System.out::println).
                filter(gradePredicate).peek(student -> System.out.println("Result after first filter"+student)).filter(gpaPredicate).peek(student -> System.out.println("Result after second filter"+student)).collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(activityMap);
    }
}

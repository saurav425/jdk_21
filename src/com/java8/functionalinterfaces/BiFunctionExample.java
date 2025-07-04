package com.java8.functionalinterfaces;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction = ((students, studentPredicate) -> {
        Map<String,Double> studentMap = new HashMap<>();
        students.forEach(student -> {
            if(studentPredicate.test(student))
                studentMap.put(student.getName(),student.getGpa());
        });
        return studentMap;
    });
    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDatabase.getAllStudents(),PredicateStudentExample.studentPredicate));
    }
}

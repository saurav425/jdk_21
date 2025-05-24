package com.java8.functionalinterfaces;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {
    static Function<List<Student>, Map<String,Double>> listMapFunction = students -> {
        Map<String,Double> studentGradeMap = new HashMap<>();
        students.forEach(student ->{
            if(PredicateStudentExample.studentPredicate.test(student))
                studentGradeMap.put(student.getName(),student.getGpa());
                });
        return studentGradeMap;
    };
    public static void main(String[] args) {
        List<Student> students = StudentDatabase.getAllStudents();
        System.out.println(listMapFunction.apply(students));
    }
}

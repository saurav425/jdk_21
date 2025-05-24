package com.java8.functionalinterfaces;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    static Function<String,String> function = (name) -> name.toUpperCase();
    static Function<String,String> addString = (name) ->name.concat("_default");
    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(student -> System.out.println( function.apply(student.getName())));
        studentList.forEach(student -> System.out.println( function.andThen(addString).apply(student.getName())));
        studentList.forEach(student -> System.out.println( function.compose(addString).apply(student.getName())));
    }
}

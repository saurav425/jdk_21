package com.java8.functionalinterfaces;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> predicate = student -> student.getGradeLevel()>=3;
    Predicate<Student> predicate1 = student -> student.getGpa()>=3.5;
    BiPredicate<Integer,Double> biPredicate = (gradeLevel,gpa)-> gradeLevel >=3 && gpa >=3.5;
    BiConsumer<String, List<String>> studentBiConsumer = (name,activities) -> System.out.println(name + " : "+activities);

    Consumer<Student> studentConsumer = student -> {
        if(predicate.and(predicate1).test(student))
            studentBiConsumer.accept(student.getName(),student.getActivities());
    };

    Consumer<Student> studentConsumer1 = student -> {
        if(biPredicate.test(student.getGradeLevel(),student.getGpa()))
            studentBiConsumer.accept(student.getName(),student.getActivities());
    };

    public static void main(String[] args) {
        List<Student> students = StudentDatabase.getAllStudents();
        students.forEach(student -> new PredicateAndConsumerExample().studentConsumer.accept(student));
        System.out.println("Bi Predicate Result");
        students.forEach(student -> new PredicateAndConsumerExample().studentConsumer1.accept(student));
    }
}

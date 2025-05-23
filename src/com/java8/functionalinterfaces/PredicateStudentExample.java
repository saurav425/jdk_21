package com.java8.functionalinterfaces;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> studentPredicate = (s) -> s.getGradeLevel() >=3;
    static Predicate<Student> studentPredicate1 = (s) -> s.getGpa() >=4;

    static void filterStudentsByGrade(){
        System.out.println("filterStudentsByGrade");
        List<Student> students = StudentDatabase.getAllStudents();
        students.forEach(student -> {
            if(studentPredicate.test(student))
                 System.out.println(student);
        } );
    }

    static void filterStudentsByGpa(){
        System.out.println("filterStudentsByGpa");
        List<Student> students = StudentDatabase.getAllStudents();
        students.forEach(student -> {
            if(studentPredicate1.test(student))
                System.out.println(student);
        } );
    }

    static void filterStudents(){
        System.out.println("filterStudents");
        List<Student> students = StudentDatabase.getAllStudents();
        students.forEach(student -> {
            if(studentPredicate1.and(studentPredicate).test(student))
                System.out.println(student);
        } );
    }
    public static void main(String[] args) {
        filterStudentsByGrade();
        filterStudentsByGpa();
        filterStudents();
    }
}

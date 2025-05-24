package com.java8.methodreference;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {
    static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradeLevel;
    public static boolean greaterThanGradeLevel(Student s){
        return s.getGradeLevel()>=3;
    }
    public static void main(String[] args) {
        System.out.println(p1.test(StudentDatabase.studentSupplier.get()));
    }
}

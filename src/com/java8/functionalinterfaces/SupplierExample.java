package com.java8.functionalinterfaces;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static Supplier<Student> studentSupplier = Student::new;
    static Supplier<List<Student>> listSupplier = StudentDatabase::getAllStudents;
    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(listSupplier.get());
    }
}

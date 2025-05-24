package com.java8.methodreference;

import com.java8.data.Student;
import com.java8.functionalinterfaces.SupplierExample;

import java.util.function.Consumer;


public class ConsumerMethodReferenceExample {
    static Consumer<Student> studentConsumer = System.out::println;
    public static void main(String[] args) {
        Student s = SupplierExample.studentSupplier.get();
        studentConsumer.accept(s);
    }
}

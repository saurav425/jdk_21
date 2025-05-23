package com.java8.functionalinterfaces;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

import static java.lang.System.out;

public class BiConsumerExample {

    public static void getStudentNameAndActivities(){
        List<Student> students = StudentDatabase.getAllStudents();
        BiConsumer<String,List<String>> studentBiConsumer = (name, activities) -> out.println("Name : "+name+"Activities : "+activities);
        students.forEach(student -> studentBiConsumer.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer = (a,b)-> out.println("Values a :"+a+" Value b: "+b);
        biConsumer.accept(1,2);

        // Multiplication
        biConsumer = (a,b) -> out.println("Multiplication : "+a*b);
        biConsumer.accept(8,2);

        //Division
        biConsumer = (a,b) -> out.println("Division : "+a/b);
        biConsumer.accept(8,2);

        getStudentNameAndActivities();
    }
}

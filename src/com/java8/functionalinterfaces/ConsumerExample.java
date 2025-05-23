package com.java8.functionalinterfaces;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

import static java.lang.System.out;

public class ConsumerExample {
    static List<Student> students = StudentDatabase.getAllStudents();
    public static void getAllStudents(){
        Consumer<Student> studentConsumer = (student) -> out.println(student);
        students.forEach(studentConsumer);
    }

    public static void getNameAndActivities(){
        Consumer<Student> name = (student) -> out.print(student.getName());
        Consumer<Student> activities = (student -> out.println(student.getActivities()));
        students.forEach(name.andThen(activities));
    }

    public static void getNameAndActivitiesUsingCondition(){
        Consumer<Student> name = (student) -> out.print(student.getName());
        Consumer<Student> activities = (student -> out.println(student.getActivities()));
        students.stream().filter(student -> student.getGradeLevel() >=3 && student.getGpa()>=4).forEach(name.andThen(activities));
    }

    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> out.println( s.toLowerCase());
        c1.accept("DADA");

        getAllStudents();
        out.println("Name and Activities :: ");
        getNameAndActivities();
        out.println("Name and Activities Using Condition:: ");
        getNameAndActivitiesUsingCondition();

    }
}

package com.java8.streams;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {
    /**
     *
     * @return
     */
    public static List<String> printStudentActivities(){
       return StudentDatabase.getAllStudents().stream().map(Student::getActivities)
               .flatMap(List::stream).toList();
    }

    /**
     *
     * @return
     */
    public static Set<String> printStudentDistinctActivities(){
        return StudentDatabase.getAllStudents().stream().map(Student::getActivities)
                .flatMap(List::stream).collect(Collectors.toSet());
    }

    /**
     *
     * @return
     */
    public static List<String> printStudentDistinctActivities1(){
        return StudentDatabase.getAllStudents().stream().map(Student::getActivities)
                .flatMap(List::stream).distinct().toList();
    }

    /**
     *
     * @return
     */
    public static long countDistinct(){
        return StudentDatabase.getAllStudents().stream().map(Student::getActivities)
                .flatMap(List::stream).distinct().count();
    }

    /**
     *
     * @return
     */
    public static List<String> sortActivities(){
        return StudentDatabase.getAllStudents().stream().map(Student::getActivities)
                .flatMap(List::stream).distinct().sorted().toList();
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(printStudentDistinctActivities());
        System.out.println(printStudentDistinctActivities1());
        System.out.println(countDistinct());
        System.out.println("Sorted :: "+sortActivities());
    }
}

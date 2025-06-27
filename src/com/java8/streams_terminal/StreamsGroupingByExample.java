package com.java8.streams_terminal;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.*;
import java.util.stream.Collectors;

import static com.java8.data.StudentDatabase.*;
import static java.util.stream.Collectors.toSet;

public class StreamsGroupingByExample {
    public static void main(String[] args) {
        Map<String, List<Student>> map = getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender));
        System.out.println(map);
       // Customised Grouping
        map = getAllStudents().stream().collect(Collectors.groupingBy(student -> student.getGpa() > 3.8 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println(map);
        //Two Level Grouping
        Map<Integer, Map<Object, List<Student>>> map1 = getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.groupingBy(student -> student.getGpa() > 3.8 ? "OUTSTANDING" : "AVERAGE")));
        System.out.println(map1);

        Map<Integer,Integer> map2 = getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.summingInt(Student::getNotebooks)));
        System.out.println(map2);

        Map<String,Integer> map3 = getAllStudents().stream().collect(Collectors.groupingBy(Student::getName,Collectors.summingInt(Student::getNotebooks)));
        System.out.println(map3);

        //3 Argument Versipn
        LinkedHashMap<String, Set<Student>> linkedHashMap = getAllStudents().stream().collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new,toSet()));
        System.out.println(linkedHashMap);

        //Combination
        System.out.println(calculateTopGpaOptional());
        System.out.println("============================");
        System.out.println(calculateTopGpa());
        System.out.println("============================");
        System.out.println(calculateMinGpa());
    }

    public static Map<Integer, Optional<Student>> calculateTopGpaOptional(){
       return StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.maxBy(Comparator.comparing(Student::getGpa))));
    }

    public static Map<Integer, Student> calculateTopGpa(){
        return StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
    }

    public static Map<Integer, Student> calculateMinGpa(){
        return StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
    }
}

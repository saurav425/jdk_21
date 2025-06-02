package com.java8.streams;

import com.java8.data.Student;
import com.java8.data.StudentDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static int performMultiplyWithIdentity(List<Integer> integers){
        return integers.stream().reduce(1,(a,b)->a*b);
    }

    public static Optional<Integer> performMultiplyWithOutIdentity(List<Integer> integers){
        return integers.stream().reduce((a,b)->a*b);
    }
    public static Optional<Student> getStudentWithHighestGpa(List<Student> students){
       return students.stream().reduce((s1,s2)->s1.getGpa() > s2.getGpa() ? s1 : s2);
    }
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7);
        System.out.println(performMultiplyWithIdentity(integers));
        //System.out.println();
        Optional<Optional<Integer>> result = Optional.of(performMultiplyWithOutIdentity(integers));
        System.out.println(result.isPresent());
        System.out.println(result.get());

        Optional<Optional<Integer>> result1 = Optional.of(performMultiplyWithOutIdentity(new ArrayList<>()));
        System.out.println(result1.isPresent());
        System.out.println(result1.get());

        List<Student> students = StudentDatabase.getAllStudents();
        Optional<Student> student = getStudentWithHighestGpa(students);
        System.out.println(student.get());
    }
}

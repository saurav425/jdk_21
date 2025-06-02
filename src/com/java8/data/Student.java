package com.java8.data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    private List<String> activities;
    private int notebooks;


    public Student(String name,int gradeLevel,double gpa, String gender,List<String> activities) {
        this.gpa = gpa;
        this.gender = gender;
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.activities = activities;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student getOneStudent(){
        return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
    }
}

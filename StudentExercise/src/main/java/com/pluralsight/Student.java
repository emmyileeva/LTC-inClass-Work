package com.pluralsight;

public class Student {
    public String name;
    public int age;
    public double grade;
    public boolean isEnrolled;
    public String hobby;

    // Constructor to set custom values when creating a student
    public Student(String name, int age, double grade, boolean isEnrolled) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.isEnrolled = isEnrolled;
    }

    // Default constructor to use default values
    public Student() {
        this.name = "Student";
        this.age = 20;
        this.grade = 99.0;
        this.isEnrolled = true;
        this.hobby = "Running";
    }
}

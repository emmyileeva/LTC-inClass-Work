package org.example;

import com.pluralsight.Student;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for name and age
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // A method is a block of code that you can repeat multiple times
        //sayHi();
        //sayHi();
        //sayHi();
        //sayHi();
        //sayHi();

        sayHi("Joe, "); // calling a function or a method
        sayAge(70 );
        yearsToRetire(70);

        String firstname = "Emiliya";
        String lastname = "Ileeva";
        String fullname = firstname + " " + lastname;
        System.out.println((fullname));


//                int count = 11;
//                float unitPrice = 7.12f; //this is an error without the f
//                float taxRate = 0.825f;
//                float totalCost;
//                totalCost = (count * unitPrice) * (1 + taxRate);
//                System.out.println(totalCost);
//
//        int count = 11;
//        double unitPrice = 7.12;
//        double taxRate = 0.825;
//        double totalCost;
//        totalCost = (count * unitPrice) * (1 + taxRate);
//        System.out.println(totalCost);


        // Create a student using the input
        Student userStudent = new Student(name, age, 100, true);

        // Print age category based on input
        if (userStudent.age < 13) {
            System.out.println("🧒 " + userStudent.name + " is a child.");
        } else if (userStudent.age >= 13 && userStudent.age <= 17) {
            System.out.println("👦 " + userStudent.name + " is a teenager.");
        } else if (userStudent.age >= 18 && userStudent.age <= 64) {
            System.out.println("🧑 " + userStudent.name + " is an adult.");
        } else if (userStudent.age >= 65 && userStudent.age <= 125) {
            System.out.println("👴 " + userStudent.name + " is a senior.");
        } else {
            System.out.println("🧙‍♂️ " + userStudent.name + " is a legend! ");
        }

        sc.close();

        // Second student
//        Student anotherStudent = new Student();
//        anotherStudent.name = "Joe";
//        anotherStudent.age = 26;
//        anotherStudent.grade = 95.0;
//        anotherStudent.isEnrolled = false;
//        anotherStudent.hobby = "Running";
//
//
//        System.out.println("Student 2's name: " + anotherStudent.name);
//        System.out.println("Student 2's age: " + anotherStudent.age);
//        System.out.println("Student 2's grade: " + anotherStudent.grade);
//        System.out.println("Is Student 2 enrolled? " + false);
//        System.out.println("Hobby? " + anotherStudent.hobby);
//
//        if (anotherStudent.age > 18) {
//            System.out.println("Student 2 is old enough to watch the movie.");
//        } else {
//            System.out.println("Student 2 needs more years before they can watch it.");
//        }
//
//        // Age category check for Student 2
//        if (anotherStudent.age < 13) {
//            System.out.println("🧒 " + anotherStudent.name + " is a child.");
//        } else if (anotherStudent.age >= 13 && anotherStudent.age <= 17) {
//            System.out.println("👦 " + anotherStudent.name + " is a teenager.");
//        } else if (anotherStudent.age >= 18 && anotherStudent.age < 65) {
//            System.out.println("🧑 " + anotherStudent.name + " is an adult.");
//        } else if (anotherStudent.age >= 65 && anotherStudent.age <= 125) {
//            System.out.println("👴 " + anotherStudent.name + " is a senior.");
//        } else {
//            System.out.println("🧙‍♂️ " + anotherStudent.name + " is a legend! ");
//        }
    }

    // We are describing a block of code to run
    // _name is a convention for parameters... it is not a variable. The values can be different
    // arguments

    public static void sayHi(String _name)
    {
        System.out.println("Hi " + _name + "how are you? ");
    }

    public static void sayAge(int _age)
    {
        System.out.println("Your current age is " + _age + " years old. ");
    }

    public static void yearsToRetire(int age)
    {
        int retirementAge = 65;
        int yearsLeft = retirementAge - age;

        if (yearsLeft > 0) {
            System.out.println("You need " + yearsLeft + " more years to retire.");
        } else {
            System.out.println("You are ready to retire!");
        }
    }
}
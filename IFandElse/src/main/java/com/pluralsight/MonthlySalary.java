package com.pluralsight;
import java.util.Scanner;

public class MonthlySalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("Enter your monthly salary: ");
//        int salary = input.nextInt();
//        String customer = "C1000";
//
//        if (customer.startsWith("C")) {
//            System.out.println("Good customer code.");
//        } else {
//            System.out.println("Wrong customer code. It should start with C.");
//        }



        System.out.println("Enter your username: ");
        String username = input.nextLine();

        if (!username.isEmpty()) {
            System.out.println("Access granted, welcome " + username + "!");
        } else {
            System.out.println("Access denied -- username required. ");
        }

        System.out.println("Enter your years of experience: ");
        int yearsOfExperience = input.nextInt();

        System.out.println("Enter the number of programming languages you know: ");
        int languages = input.nextInt();

//        if (salary < 1000) {
//            System.out.println("I want to earn more.");
//        } else if (salary == 10000) {
//            System.out.println("This is what I am talking about.");
//        } else if (salary > 5000) {
//            System.out.println("Now we are talking.");
//        } else if (salary > 2000) {
//            System.out.println("Just getting started.");
//        }
//
//        if (salary < 10000) {
//            int difference = 10000 - salary;
//            System.out.println("You need to earn " + difference + " more to reach 10000");
//        }


        if (yearsOfExperience > 5 && languages > 3 ) {
            System.out.println("You are a senior developer!");
        } else if (yearsOfExperience >= 2 && yearsOfExperience <= 5 && languages >= 2) {
            System.out.println("You are a developer.");
        } else if (yearsOfExperience < 2 || languages < 2) {
            System.out.println("You are a junior developer.");
        } else {
            System.out.println("Developer level could not be determined.");
        }
        input.close();
    }
}

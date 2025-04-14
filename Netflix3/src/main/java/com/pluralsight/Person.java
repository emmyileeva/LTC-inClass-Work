package com.pluralsight;

// Information on people
// Login info, watch history


import java.time.LocalDate;

public class Person {
    String firstName = "Emiliya";
    String lastName = "Ileeva";
    int age = 24;
    String email = "emilyileeva@gmail.com";
    String[] watchList ={"Harry Potter", "Interstellar", "Pulp Fiction"};
    String address = "San Jose";
    boolean isSubscribed = true;
    int creditCardNo = 12345678;
    long balance = 1234567890;
    char gender = 'F'; // it takes less space
    LocalDate birthDate = LocalDate.of(2000,10,6);
}

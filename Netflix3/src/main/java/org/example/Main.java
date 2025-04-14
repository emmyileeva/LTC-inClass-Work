package org.example;

import com.pluralsight.Movie;
import com.pluralsight.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        /*
        Class myClass = new Class()
        signature of creating a new movie
        myMovie is a label/name for a particular movie
        */
        Movie myMovie = new Movie();
        myMovie.favoriteMovie = "A new movie";
        myMovie.title = "Harry Potter";
        System.out.println(myMovie.title);
        Person myPerson = new Person();
    }
}
package com.pluralsight;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create an arrayList of books
        List<Book> books = new ArrayList<>();

        // Create 3 book objects using the constructor
        Book book1 = new Book("Alex Michaelides", "The Silent Patient", "9781250301697");
        Book book2 = new Book("Gillian Flynn", "Gone Girl", "9788817077231");
        Book book3 = new Book("Colleen Hoover", "Verity", "9781538724736");

        // Add the book objects to the ArrayList
        books.add(book1);
        books.add(book2);
        books.add(book3);

        // Iterate through the arrayList and print the details of each book
        for (Book book : books) {
            System.out.println("Book: " + book.getAuthor() + ", " + book.getTitle() + ", " + book.getISBN());
        }
    }
}
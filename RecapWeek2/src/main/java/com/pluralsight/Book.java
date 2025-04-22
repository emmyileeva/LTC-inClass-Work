package com.pluralsight;

public class Book {
    // author, title, tableOfContents, Genre, pageNumber ISBN, publishingYear properties
    private String author;
    private String title;
    private String tableOfContents;
    private String genre;
    private int pageNumber;
    private String ISBN;
    private int publishingYear;
    // Constructor
    public Book(String author, String title, String ISBN) {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
    }

        // Getters and Setters
        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTableOfContents() {
            return tableOfContents;
        }

        public void setTableOfContents(String tableOfContents) {
            this.tableOfContents = tableOfContents;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public int getPageNumber() {
            return pageNumber;
        }

        public void setPageNumber(int pageNumber) {
            // Validate pageNumber
            if (pageNumber <= 0) {
                throw new IllegalArgumentException("Page number must be greater than 0");
            }
            this.pageNumber = pageNumber;
        }

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public int getPublishingYear() {
            return publishingYear;
        }

        public void setPublishingYear(int publishingYear) {
            this.publishingYear = publishingYear;
        }

        // Method to display book details
        public void displayBookDetails() {
            System.out.println("Author: " + author);
            System.out.println("Title: " + title);
            System.out.println("ISBN: " + ISBN);
            System.out.println("Genre: " + genre);
            System.out.println("Page Number: " + pageNumber);
            System.out.println("Publishing Year: " + publishingYear);
            System.out.println("Table of Contents: " + tableOfContents);
        }
}

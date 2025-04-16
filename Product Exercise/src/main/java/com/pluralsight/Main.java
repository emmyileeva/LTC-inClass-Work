package com.pluralsight;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        // string contains "id|description|quantity|price"
        String input = "111|Hot Chocolate (12-count)|21|4.99";
        String input2 = "112|Coffee (24-count)|10|7.49";

        // Convert the input strings into Product objects using the method below
        Product p1 = splitThisLineOfProducts(input);
        Product p2 = splitThisLineOfProducts(input2);

        // Print out the total price
        System.out.println("Total Price for Product 1: $" + p1.getTotalPrice());
        System.out.println("Total Price for Product 2: $" + p2.getTotalPrice());
    }

    // Method to convert a single line of product data into a product object
    public static Product splitThisLineOfProducts(String input) {

        // Split the input line by the '|' character using pattern.quote for safety
        String[] tokens = input.split(Pattern.quote("|"));
        int id = Integer.parseInt(tokens[0]);
        String name = tokens[1];
        int quantity = Integer.parseInt(tokens[2]);
        double price = Double.parseDouble(tokens[3]);

        // Return new product object using the extracted values
        return new Product(name, price, quantity, id);

    }
}
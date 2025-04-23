package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ProductReader {
    public static List<Product> readProductFromCSV(String fileName) {

        List<Product> productList = new ArrayList<>();

        // Pseudocode for reading from CSV
        // 1. Open the file, try/catch necessary
        // 2. Read each line
        // 3. Split the line by a comma
        // 4. Create a Product object
        // 5. Add the Product object to the list
        // 6. Close the file
        // 7. Return the list of products


        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);

            // Skip the first line (it contains column names like id, name, price, stock)
            reader.readLine();

            String line;
            // Read each remaining line in the file
            while ((line = reader.readLine()) != null) {
                // Split the line into parts, using a comma as the separator
                String[] parts = line.split(",");

                // Check if the line has exactly 4 parts (id, name, price, stock)
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0]);        // Convert the first part to an integer (ID)
                    String name = parts[1];                     // Get the name as text
                    double price = Double.parseDouble(parts[2]); // Convert price to a decimal number
                    int stock = Integer.parseInt(parts[3]);     // Convert stock to an integer

                    // Create a new Product object using the parts
                    Product p = new Product(id, name, price, stock);

                    // Add the product to the list
                    productList.add(p);
                    System.out.println("Product added: " + p.getName() + " with ID: " + p.getId());
                    System.out.println();
                }
        }
            // Close the reader
            reader.close();

        } catch (IOException e) {
            // Handle any exceptions that occur during file reading
            System.out.println("Error reading the file: ");
            e.printStackTrace();
        }
        // Return the list of products
        return productList;
    }
}

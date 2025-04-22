package com.pluralsight;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean success = false;
        int maxAttempts = Integer.MAX_VALUE; // Default for easy mode
        int correctNumber = 0;

        // Menu for selecting difficulty
        System.out.println("Select difficulty:");
        System.out.println("1. Easy (1-10, unlimited tries)");
        System.out.println("2. Hard (1-100, 5 tries)");
        int level = 0;

        while (true) {
            try {
                System.out.print("Enter your choice (1 or 2): ");
                level = scanner.nextInt();
                scanner.nextLine();
                if (level == 1) {
                    correctNumber = (int) (Math.random() * 10) + 1;
                    break;
                } else if (level == 2) {
                    correctNumber = (int) (Math.random() * 100) + 1;
                    maxAttempts = 5;
                    break;
                } else {
                    System.out.println("Invalid choice. Please select 1 or 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
                scanner.nextLine();
            }
        }

        int attempts = 0;

        // Game loop
        while (!success && attempts < maxAttempts) {
            try {
                System.out.print("Pick a number: ");
                int guessedNumber = scanner.nextInt();
                scanner.nextLine();

                if (level == 1 && (guessedNumber < 1 || guessedNumber > 10)) {
                    System.out.println("Number out of range. Pick between 1 and 10.");
                    continue;
                } else if (level == 2 && (guessedNumber < 1 || guessedNumber > 100)) {
                    System.out.println("Number out of range. Pick between 1 and 100.");
                    continue;
                }

                attempts++;

                if (guessedNumber != correctNumber) {
                    if (guessedNumber > correctNumber) {
                        System.out.println("It's too high.");
                    } else {
                        System.out.println("It's too low.");
                    }
                    if (level == 2 && attempts >= maxAttempts) {
                        System.out.println("You've run out of attempts! The correct number was: " + correctNumber);
                        break;
                    }
                    System.out.println("Wrong, try again.");
                } else {
                    System.out.println("You guessed it correctly!");
                    success = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Not a valid number. Please enter digits only.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("⚠️ Something else went wrong: " + e.getMessage());
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
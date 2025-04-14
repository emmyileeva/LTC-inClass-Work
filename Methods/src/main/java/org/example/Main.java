package org.example;

public class Main {
    public static void main(String[] args) {

        // Creating an object
        Calculator myCalculator = new Calculator();
        myCalculator.brand = "TI -84";

        // Another object
        Calculator myFriendsCalculator = new Calculator();
        myFriendsCalculator.brand = "TI -83";

//        myCalculator.userFirstNumber = 30;
//        myCalculator.userSecondNumber = 50;
//        myCalculator.Add();

        System.out.println("\nMy calculator: \n");
        myCalculator.Add();
        myCalculator.Subtract();
        System.out.println("\nMy friend's calculator: \n");
        myFriendsCalculator.Add();
        myFriendsCalculator.Subtract();

        // You don't have to create a certain type of calculator
        System.out.println();
        double result = Calculator.Add(23, 24);
        System.out.println("Result of addition: " + result);

       double total = Calculator.Subtract(100, 50);
        System.out.println("Result of subtraction: " + total);

        // Exit the game
        GameManager.exitGame();

//        double result = Calculator.Subtract(50, 30);
//        System.out.println(result);

//        System.out.println(Calculator.Add(23, 24));


    }
}
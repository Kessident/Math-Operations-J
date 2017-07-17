package com;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    
    private static double getUserNumber(){
        double userNumber = 1;
        try {
            System.out.print("Please enter a number: ");
            userNumber = Double.parseDouble(scan.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("You didn't enter a number");
            getUserNumber();
        }
        return userNumber;
    }
    private static void showResults(double sum, double difference, double multiplication, double remainder, double num1, double num2) {
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum + "\n" +
                "The difference between " + num1 + " and " + num2 + " is: " + difference + "\n" +
                num1 + " multiplied by " + num2 + " is: " + multiplication + "\n" +
                "The remainder of " + num1 + " divided by " + num2 + " is: " + remainder);
    }
    public static void main(String[] args) {
        System.out.println("Please enter two numbers");
        double operand1 = getUserNumber();
        double operand2 = getUserNumber();
        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double multiplication = operand1 * operand2;
        double remainder = operand1 % operand2;
        showResults(sum, difference, multiplication, remainder, operand1, operand2);
    }
}
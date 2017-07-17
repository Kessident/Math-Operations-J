package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        double operand1 = Double.parseDouble(scan.nextLine());
        System.out.print("Enter a second number: ");
        double operand2 = Double.parseDouble(scan.nextLine());
        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double multiplication = operand1 * operand2;
        double remainder = operand1 % operand2;
        showResults(sum, difference, multiplication, remainder, operand1, operand2);
    }

    private static void showResults(double sum, double difference, double multiplication, double remainder, double num1, double num2) {
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum + "\n" +
                "The difference between " + num1 + " and " + num2 + " is: " + difference + "\n" +
                num1 + " multiplied by " + num2 + " is: " + multiplication + "\n" +
                "The remainder of " + num1 + " divided by " + num2 + " is: " + remainder);
    }
}
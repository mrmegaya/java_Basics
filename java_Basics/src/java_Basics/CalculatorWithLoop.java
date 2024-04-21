package java_Basics;

import java.util.Scanner;

public class CalculatorWithLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;
        String input;

        while (true) {
            // Take input from the user
            System.out.println("Enter the numbers (or press Enter to exit):");
            input = scanner.nextLine();

            if (input.equals("")) {
                // User pressed Enter, break the loop
                System.out.println("Exiting calculator.");
                break;
            } else if (input.equals("5")) {
                // User typed '5', exit the program
                System.out.println("Exiting program.");
                return;
            }

            try {
                String[] tokens = input.split(" ");
                num1 = Double.parseDouble(tokens[0]);
                operator = tokens[1].charAt(0);
                num2 = Double.parseDouble(tokens[2]);

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Invalid operator. Please try again.");
                        continue;
                }

                System.out.println("The result:");
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter valid numbers and an operator.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}

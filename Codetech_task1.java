package codetech;

import java.util.Scanner;

public class Codetech_task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            System.out.print("Choose an operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            double result = 0;
            
            switch (operation) {
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
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation.");
                    return;
            }
            System.out.println("The result is: " + result);

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");
        } finally {
            scanner.close();
        }
    }
}

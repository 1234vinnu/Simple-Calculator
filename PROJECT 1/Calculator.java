import java.util.Scanner;  // Import the Scanner class

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();  // Read user input

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();  // Read user input

        System.out.println("Enter the operation (+, -, *, /):");
        String operation = scanner.next();  // Read user input

        double result = 0;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid operation. Please enter +, -, *, or /.");
                return;
        }

        System.out.println("The result is: " + result);
    }
}
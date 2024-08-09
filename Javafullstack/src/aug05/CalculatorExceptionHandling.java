package aug05;
import java.util.InputMismatchException;
import java.util.Scanner;


public class CalculatorExceptionHandling {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        try {
            System.out.println("Welcome to the Calculator!");
            System.out.println("Enter an operation (+, -, *, /):");

            String operation = scanner.next();

            System.out.println("Enter the first number:");
            int num1 = scanner.nextInt();

            System.out.println("Enter the second number:");
            int num2 = scanner.nextInt();

            int result = 0;
            
            switch (operation) {
            case "+":
                result = add(num1, num2);
                break;
            case "-":
                result = subtract(num1, num2);
                break;
            case "*":
                result = multiply(num1, num2);
                break;
            case "/":
                result = divide(num1, num2);
                break;
            default:
                throw new UnsupportedOperationException("Invalid operation");
        }
            
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input! Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            
        }
    }
	
	
	public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return a / b;
    }
	
	
	
	

}

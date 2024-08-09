package aug05;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
	  Scanner scanner = new Scanner (System.in);
	  
	
	  System.out.println("Welcome to the Calculator");
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
          if (num2 != 0) {
              result = divide(num1, num2);
          } else {
              System.out.println("Error: Division by zero!");
              return;
          }
          break;
      default:
          System.out.println("Invalid operation");
          return;
  }
      System.out.println("Result: " + result);
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
        return a / b;
	}
}
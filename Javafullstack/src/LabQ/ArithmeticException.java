package LabQ;

public class ArithmeticException {

	
	public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;
        
        try {
            int result = divideNumbers(dividend, divisor);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
    }
    
    public static int divideNumbers(int dividend, int divisor) {
        return dividend / divisor;
    }

}
package aug6labq;
import java.util.function.Function;

public class Lab3 {
	interface SquareCalculator {
        int calculate(int number);
    }
	

    // Static method to calculate the square of a number
    public static int calculateSquare(int number) {
        return number * number;
    }

	public static void main(String[] args) {
		
		// Create a method reference to the static method
        SquareCalculator calculator =  Lab3 ::calculateSquare;

        // Use the method reference to calculate the square of a number
        int result = calculator.calculate(5);
        System.out.println("Square of 5: " + result);
    }
		
		

	}



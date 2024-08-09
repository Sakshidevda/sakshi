package aug6labq;
import java.util.function.BiFunction;

public class Lab19 {
	
	 public static void main(String[] args) {
	        int num1 = 10;
	        int num2 = 2;
	        
	        //for addition
 	        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
	        System.out.println("Addition: " + add.apply(num1, num2));
	        
	        //for subtraction
	        BiFunction<Integer, Integer, Integer> subtract = (a, b) -> a - b;
	        System.out.println("Subtraction: " + subtract.apply(num1, num2));

	        //for multiplication
	        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
	        System.out.println("Multiplication: " + multiply.apply(num1, num2));

	        // for division
	        BiFunction<Integer, Integer, Double> divide = (a, b) -> (double) a / b;
	        System.out.println("Division: " + divide.apply(num1, num2));       
	   }
  }

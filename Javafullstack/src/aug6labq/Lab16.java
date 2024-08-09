package aug6labq;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab16 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int userInput = 0;
		
		while(true) {
			try {
				System.out.println("Enter an integer:");
				
				 userInput = scanner.nextInt();
	                break; //exit the loop if input is valid
			   }catch (InputMismatchException e) {
	                System.out.println("Invalid input. Please enter an integer.");
	               //invalid input
	                scanner.next();
		}
	}
		
		System.out.println("You entered: " + userInput);

}
}

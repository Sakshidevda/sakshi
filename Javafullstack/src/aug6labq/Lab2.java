package aug6labq;
import java.util.function.UnaryOperator;

public class Lab2 {

	
	public static void main(String[] args) {
        String str = "Hello World";

        //  convert to uppercase
        UnaryOperator<String> toUpperCase = s -> s.toUpperCase();
        System.out.println("Original: " + str);
        System.out.println("Uppercase: " + toUpperCase.apply(str));

        // convert to lowercase
        UnaryOperator<String> toLowerCase = s -> s.toLowerCase();
        System.out.println("Lowercase: " + toLowerCase.apply(str));

        //  reverse the string
        UnaryOperator<String> reverse = s -> new StringBuilder(s).reverse().toString();
        System.out.println("Reversed: " + reverse.apply(str));
    }
}

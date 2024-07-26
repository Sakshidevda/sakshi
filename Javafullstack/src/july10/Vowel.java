package july10;
import java.util.*;

public class Vowel {

	public static void main(String[] args) {
		
		String s = "Sakshi devda";
		 boolean containsAllVowels = checkIfContainsAllVowels(s);
		 
		 System.out.println("s");
		 System.out.println("Contains all vowels " + containsAllVowels);
		}
	
	public static boolean checkIfContainsAllVowels(String s) {
		
		boolean[] vowelsPresent = new boolean[5];
		for(char ch : s.toCharArray()) {
			
			switch (ch) {
			case 'a' :
				vowelsPresent[0] = true;
				break;
				
			case 'e' :
				vowelsPresent[1] = true;
				break;
			case 'i':
				vowelsPresent[2] = true;
				break;
			case 'o':
				vowelsPresent[3] = true;
			break;
			case 'u':
				vowelsPresent[4] = true;
				break;
			default:
				break;
			}
			
		}
		
		for(boolean present : vowelsPresent) {
			if(!present) {
				
				return false;
			}
			
		}
		return true;
		
	}

}

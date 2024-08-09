package aug6labq;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lab17 {

	public static void main(String[] args) {
		
		// Create a list of strings
		
		List<String> ss = new ArrayList<>();
        
		ss.add("apple");
        ss.add("banana");
        ss.add("apple");
        ss.add("orange");
        ss.add("banana");
        ss.add("grapes");
		
        List<String> uniqueStrings = ss.stream()
                .distinct()
                .collect(Collectors.toList());
        
        // Print the result
        System.out.println("Original list: " + ss);
        System.out.println("List without duplicates: " + uniqueStrings);

	}

}

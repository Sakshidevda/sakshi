package aug6labq;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Lab18 {
	
	public static void main(String[] args) {
	
		 // Create a list of strings
        
		List<String> st = new ArrayList<>();
        st.add("Hello");
        st.add(" ");
        st.add("World");
        st.add("!");
        st.add(" My");
        st.add(" Name");
        st.add(" is");
        st.add(" Khushi.");
        
        String concatenatedString = st.stream()
                .collect(Collectors.joining());
        
        
        // Print the result
        System.out.println("Original list: " + st);
        System.out.println("Concatenated string: " + concatenatedString);
	}

}

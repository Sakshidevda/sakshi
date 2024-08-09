package aug06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ques {

	public static void main(String[] args) {
		
		
	List<Integer> numbers = new ArrayList<>();
        
	    numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
       
        
       List<Integer> result = numbers.stream()
                .map(num -> num % 2 != 0 ? num + 5 : num)
                .collect(Collectors.toList());


        

          System.out.println(result);
        
	}

}

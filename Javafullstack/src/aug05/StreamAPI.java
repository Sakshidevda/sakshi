package aug05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> nums = new ArrayList<>() ;
		
		nums.add(1211);
		nums.add(1212);
		nums.add(1213);
		nums.add(1243);
		nums.add(1243);
		
		for(Integer s : nums){
			System.out.println(s);
		}
		
		
		Stream s  = nums.stream() ;
	//	
//			s.forEach(x -> System.out.println(x));// I am using this stream 
//			
			
			//s.collect()
			
			// Functionimpl gg = new Functionimpl() ;

			//Stream<Integer> s2 = ; // object kind of data
	        System.out.println("Streams data");
			Stream<Integer> newnums = nums.stream()
					                    .map(n -> {
					                    	
					                    	System.out.println("mai hu map function");
					                    	System.out.println(n);
					                    	
					                    	return n*n ;
					                    })
					                    .filter(c -> {
					                    	System.out.println("mai hu filter function");
					                    	System.out.println(c);
					                        return c % 2 == 0 ;
					                    });
			
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            
            
List<Integer> listlist = newnums .collect(Collectors.toList());

for(Integer j:listlist) {
System.out.println(j);
}






}





		
		
		
		
	}

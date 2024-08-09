package aug06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreamApi {
	
	public class WithoutStreamApi {
		
		public static void main(String[] args) {
			
			List<Product> list = new ArrayList<>();
			list.add(new Product (1 , "jeans" , 3500));
			list.add(new Product (2 , "top" , 300));
			list.add(new Product (3 , "kurta" , 250));
			list.add(new Product (4 , "tv" , 35000));
			list.add(new Product (5 , "frize" , 4000));
			list.add(new Product (6 , "toy" , 350));
			
			int sum = 0;
		//	List<Double> listOfPrice = list.stream().filter(p -> p.price > 3000).map(p -> p.price).collect(Collectors.toList());			
			
			
			
			
			List<Integer> listOfPricee = new ArrayList<>();
	
			Integer totolsum =   list.stream()
					                 .filter(p -> p.price > 3000)
					                 .peek(l -> listOfPricee.add(l.price) )
					                 .mapToInt(o ->  o.price)
					                 .sum();
			
			
			System.out.println( "Total sum of list : " + totolsum);
			
			System.out.println(listOfPricee);
		}

	}


}

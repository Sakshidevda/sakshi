package aug06;

import java.util.ArrayList;
import java.util.List;

public class WithoutStreamApi {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product (1 , "jeans" , 3500));
		list.add(new Product (2 , "top" , 300));
		list.add(new Product (3 , "kurta" , 250));
		list.add(new Product (4 , "tv" , 35000));
		list.add(new Product (5 , "frize" , 4000));
		list.add(new Product (6 , "toy" , 350));
		
		ArrayList<Integer>  ss = new ArrayList<>();
		int sum = 0;
		for(Product p : list) {
			
			if(p.price > 3000) {
				ss.add((int) p.price);
				
				sum +=  p.price;
			}
			
		}
		
		System.out.println(ss);
		System.out.println(sum);
		
	}

}

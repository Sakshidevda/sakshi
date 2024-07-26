package Javacollection;
import java.util.HashMap;
import java.util.Map;

public class Mapex {

	public static void main(String[] args) {
		
		 Map<String, Boolean> map = new HashMap<>();

	        
	        map.put("Ques1", true);
	        map.put("Ques2", false);
	        map.put("Ques3", true);
	        map.put("Ques4", false);

	        
	       
	        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }
	
		
		

	}



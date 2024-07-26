package July16;
import java.util.HashMap;


public class Map {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		map.putAll(map);
		map.putIfAbsent(1212, 5);
		map.remove(map);
		map.clear();
		if(map.containsValue(4)) {
			System.out.println("4 is there");
		}
		map.equals(map);
		map.put(1212 , 7);
		
		 for(Map.Entry<Integer, Integer>  mm : map.entrySet()) {
		
			 System.out.println(mm.getKey() +"---->" + mm.getValue());
		}
		System.out.println(map.size());
	}

}

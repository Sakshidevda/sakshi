package Javacollection;
import java.util.HashMap;
import java.util.*;
import java.util.Map;


public class Quesfrequency {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4, 5, 6, 3, 2, 5, 2, 1, 4, 6, 3, 1, 1};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        //for(int i=0; i<arr.length; i++) {
        	
        	//HashMap<Integer, Integer> map = new HashMap<>();
			//if(map.containsKey(arr[i])) {
        		//map.put(arr[i],map.get(arr[i]+1));
        	//}else {
        		//map.put(arr[i], 1);
        	//}
        //}
       
        
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
           //  map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println("Frequency Map:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

	}



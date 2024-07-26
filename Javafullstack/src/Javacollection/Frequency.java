package Javacollection;

import java.util.Arrays;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;


public class Frequency {

	public static void main(String[] args) {
		
		String s = "sacassppkc";
		//count the frequency character 
		//a- 2  c-2   p-2  s-3 {12,12,23,45,12,23,45}
		
		//array of chracter
		
		char[] arr=s.toCharArray();
		HashMap<Character , Integer> map = new HashMap<>();
		
		System.out.println(Arrays.toString(arr));
		
		for(char c : arr) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				
			}else {
				map.put(c,  1);
				
			}
		}
		
		for(Entry<Character, Integer> ekpair:map.entrySet()) {
		System.out.println(ekpair.getKey()+"-------" + ekpair.getValue());

	}
	}

}

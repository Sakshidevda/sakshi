package Javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.*;

public class MainMain {

	public static void main(String[] args) {
		
		// it contain a unique value
		// it allow only single null value 
		//it dose not allow any duplicate value
		//it dose not maintain any insertion order
		
		HashSet<String> ss = new HashSet<String> ();
		
		ss.add("sakshi");
		ss.add("swati");
		ss.add("pooja");
		ss.add("sakshi");
		ss.add("null");
		ss.add("null");
		ss.add("null");
	
	for(String hh:ss) {
		System.out.println(hh);
	}
	
	
	LinkedHashSet <String> kk = new LinkedHashSet ();
	
	kk.add("Sting");
	kk.add("Sting");
	kk.add("coco");
	kk.add("map");
	kk.add("mobile");
	
	for(String hh:kk) {
		System.out.println(hh);
	}
	
	
	TreeSet<Integer> set = new TreeSet <Integer>();
	//It dose not allow any null value
	set.add(12);
	set.add(13);
	set.add(14);
	set.add(15);
	set.add(16);
	set.add(18);
	
	
	System.out.println(set);
	
	}

}

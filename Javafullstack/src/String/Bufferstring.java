package String;

public class Bufferstring {

	public static void main(String[] args) {
		
		//It is mutable
		
		
		
		StringBuffer s = new StringBuffer("Sakshi");//singal threaded or thread safe
		s = s.append("Devda");
		
		s.insert(1,"Java");//now original string is changed  
		System.out.println(s);//prints HJavaello  
		
		
		s.replace(1,3,"Java");
		
		s.delete(1,3);  
		
		s.reverse();
		
		for(int i =0; i<5; i++) {
		s.append(i);
		}
		System.out.println(s);
		
		
		
		StringBuilder gg = new StringBuilder("Lankesh");
		// you can use multiple thread in this 
		
		
	}

}

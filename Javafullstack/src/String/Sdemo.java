package String;

public class Sdemo {

	public static void main(String[] args) {
		
        String s = "welcome";
		String s2 = "welcome";
		  
		String s3 = new String  ("welcome");
		String s4 = new String  ("welcome");
		
		System.out.println(s == s2);//true
		System.out.println(s == s3);//false
		System.out.println(s3 == s4);//false
		
		
		System.out.println(s.equals(s4));//true
		System.out.println(s.equals(s2));//true
		System.out.println(s.equals(s4));//true
		
		//what is diffence between == and equals operator
		
		String c = "sakshi";
		for(int i=0; i<5; i++) {
			c= c+i ;
		}
		System.out.println(c);
	}

}
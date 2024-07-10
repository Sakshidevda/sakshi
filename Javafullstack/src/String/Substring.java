package String;

public class Substring {

	public static void main(String[] args) {
		
		String s = "Vikas";
		
		
		System.out.println(s.length());
		System.out.println(s.charAt(4));
		s.length();
		
		
		String ss  = s.substring(2);
		System.out.println(ss);
		
		s.contains(ss);
		
		char arr[] = s.toCharArray();
		
		for(char pp : arr) {
			System.out.println(pp);
		}
		
		s.replace('k','s');
		
		System.out.println(s);
	}
  
	
	
}

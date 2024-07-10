package String;

public class Allsubstring {
	public static void main(String[]args) {
		
		// create all possible substring of s
		//n*(n+1)/2
		 
		
		String s = "ramlal";

        System.out.println("All substrings of " + s );
        for (int i = 0; i < s.length();i++) {
            for (int j =i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                System.out.println(substring);
            }
            
           // for (int i  =0  ;i<s.length() ;i++) {
  			 // String t = "" ;
  			  //for(int j  =i ; j<s.length() ;j++) {
  				// t= t + s.charAt(j);
  				  //System.out.println(t);
  				 //}
  		  }
        }
	}



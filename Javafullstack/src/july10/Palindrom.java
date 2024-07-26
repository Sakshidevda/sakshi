package july10;

public class Palindrom {
	public static void main(String[] args) {
		
		String kk = "racecar";
		int i = 0;
		int j = kk.length()-1;
		boolean flg =true;
		
	     while(i<j) {
	    	 if(kk.charAt(i) == kk.charAt(j)) {
	    		 i++;
	    		 j--;
	    		 
	    	 }else {
	    		 System.out.println("not palidrom");
	    		 flg = false;
	    		 break;
	    	 }
	     }
	     if (flg) {
	    	 System.out.println("palindrom");
	     }
	     }
		      
		       
	
	}



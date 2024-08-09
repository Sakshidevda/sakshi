package july31labq;

public class MainMain {
	
	public static void main(String[] args) {
		
	    //Predicate pp = new Predicate ();
		//	System.out.println(pp.check(12));
			
			
		//	 CheckOddEven pp = new  CheckOddEven () {
		//		 @Override
		//			public boolean check(int a) {
			//			if(a%2 == 0) {
				//			return true;
				//		}
				//		// TODO Auto-generated method stub
					//	return false;
				//	}
			
			// };
			 
			// System.out.println(pp.check(1));
	
			 
			 
			 // lamda function
			 
			 CheckOddEven pppp =  new CheckOddEven () {
					@Override
					public boolean check(int a) {
						// TODO Auto-generated method stub
						if (a%2 == 0) {
							// it even
							return true ;
						}
						return false;
					}
				} ;
				
				
				CheckOddEven pp = (int a) ->  (a%2 == 0);
			 
			 
			 
       }
}

					
				 
			 
	
	


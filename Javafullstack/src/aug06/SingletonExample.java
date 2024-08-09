package aug06;

import java.io.Serializable;

public class SingletonExample implements Cloneable , Serializable {
	
	
	 static SingletonExample instance = null;
	
	private SingletonExample() {
		
	}
	
		public static SingletonExample getInstance() {
			if(instance == null) {
				return new  SingletonExample();
			}
			
			return instance ;
		}
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
			
		    return super.clone(); 
		}
	

}

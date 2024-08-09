package aug06;

public class Test2 {

	public static void main(String[] args) {
		
		SingletonExample firstObj = SingletonExample.getInstance();
		
		
		try {
			SingletonExample secObj = (SingletonExample) firstObj.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println(firstObj.hashCode());
		
		

	}

}

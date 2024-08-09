package aug06;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

	public static void main(String[] args) {
		
		SingletonExample s =  SingletonExample.getInstance();
		
		
		Constructor<SingletonExample> cons = null;
		try {
			cons = SingletonExample.class.getDeclaredConstructor();
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		cons.setAccessible(true);
        SingletonExample s2 =  SingletonExample.getInstance();
		
		
		Constructor<SingletonExample> con = null;
		
		try {
			SingletonExample newObj = cons.newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
	}

	

}

package aug06;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test3 {
	
	public static void main(String[] args) {
		
		SingletonExample first = SingletonExample.getInstance();	
		
		// serialization of this first obj
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Anudeep.text"));
		
		out.writeObject(first);
		
		
		
		
		//desrialization
		
		
		ObjectIutputStream input = new ObjectIutputStream(new FileIutputStream("Anudeep.text"));
		
		input.readObject();
		
		
	}

}

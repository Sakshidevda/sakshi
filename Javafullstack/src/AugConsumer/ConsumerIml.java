package AugConsumer;

import java.util.function.Consumer;

public class ConsumerIml implements Consumer{

	@Override
	public void accept(Object t) {
		// TODO Auto-generated method stub
		System.out.println("mai aayi hu ConsumerIml");
		System.out.println(t);
	}
	
	

}

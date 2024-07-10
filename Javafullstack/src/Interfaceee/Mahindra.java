package Interfaceee;

public class Mahindra implements Car , Truck {

	public static void main(String[] args) {
		
	}

	@Override
	public void acceleration(int forced) {
		System.out.println("yes speed is increasing at rate of 20km/sec square");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brake() {
	 System.out.println("yes brake applied");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void horn() {
		// TODO Auto-generated method stub
		System.out.println("yes there is professional horn");
		
	}

	@Override
	public void heavyLoad() {
		// TODO Auto-generated method stub
		System.out.println("only pick truck can be both car as truck");
		
	}

}

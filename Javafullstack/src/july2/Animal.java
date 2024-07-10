package july2;

public class Animal {

	void doCalculation() throws wrongCalculation {
		int a = 2;
		int b= 3;
		int c = 4;
		
		if(c!= 5) {
			throw new wrongCalculation("aapka ans galat hai");
		}else {
			System.out.println("yes it is correct");
		}
		
	}
}

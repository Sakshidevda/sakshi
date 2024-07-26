package java.point.JUnittesting;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	 @Test
	    public void testAdd() {
		 
	        //  Calculator object
	        CalculatorTest calculator = new CalculatorTest();

	        // Test the add method with some sample inputs
	        
	        int result1 = calculator.add(2, 3); 
	        AssertEquals(5, result1);

	        int result2 = calculator.add(-1, 1);
	        AssertEquals(0, result2);

	        int result3 = calculator.add(0, 0);
	        AssertEquals(0, result3);

	        int result4 = calculator.add(-5, -3);
	        AssertEquals(-8, result4);
	    }

	private int add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	private void AssertEquals(int i, int result1) {
		// TODO Auto-generated method stub
		
	}

}

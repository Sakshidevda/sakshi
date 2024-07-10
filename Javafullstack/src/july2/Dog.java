package july2;

public class Dog extends Animal{
	//yadi parent exception nhi de rha h toh it is not possible ki child class check exceptiondee
	void doCalculation()  {
		System.out.println("yes they are genius");
	}
	
	public static void main(String[]args) {
		Dog cc = new Dog();
		
		cc.doCalculation();
	}

}

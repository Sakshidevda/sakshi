package factorydesignpattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Employee s = new AndroidDeveloper();
		
		Employee e = EmployeeFactory.getEmp("Android Developer");
		int s = e.Salary();
		System.out.println(s);
	}

}

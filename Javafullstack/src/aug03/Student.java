package aug03;

public class Student {
	
	private String name;
	private int age ;
	private String department;
	
	
	public Student () {
		this.name = "Unknown";
		this.age = 20;
		this.department = "Unassigned";
	}
	
	public Student (String name, int age) {
		this.name = name;
		this.age=age;
		this.department = "IT";
		}
	
	public Student(String name, int age , String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	
	public void setAge(int age) {
		this.age =age;
	}

	public String getDepartment() {
		// TODO Auto-generated method stub
		return department;
	}
	
	public void setDepartment(String Department) {
		this. department = department;
	}

}

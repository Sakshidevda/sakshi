package aug03;

public class Main {

	public static void main(String[] args) {
		
		Student studnet1 = new Student();
		
		System.out.println("studnet1 :" + studnet1.getName() + " ,"+ studnet1.getAge() + ", " + studnet1.getDepartment());
		
		
		Student student2 = new Student("Sakshi Devda", 20);
		
		System.out.println("student2 :" + student2.getName() + " ," + student2.getAge() + ", " + student2.getDepartment());
		
		
		Student student3 = new Student("Sakshi Devda", 25 , "BCA");
		
		System.out.println("student3 :" + student3.getName() + ", " + student3.getAge() + " ," + student3.getDepartment());
		
		
		
	}

}

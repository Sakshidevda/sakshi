package Department;

public class DemoD {
	
	public static void main(String[] args) {
	
        //  departments
        Department department1 = new Department(1, "Computer Science");
        Department department2 = new Department(2, "Physics");
        Department department3 = new Department(3, "Mathematics");
        Department department4 = new Department(4, "Biology");
        Department department5 = new Department(5, "Chemistry");
        
        
     // professors
        Professor professor1 = new Professor(101, "Mohan Singh", "Computer Science");
        Professor professor2 = new Professor(102, "Sumit Sharma", "Physics");
        Professor professor3 = new Professor(103, "Vikas Devda", "Mathematics");
        Professor professor4 = new Professor(104, "Khushi More", "Biology");
        Professor professor5 = new Professor(105, "Vivek Patel", "Chemistry");

        
     // universities with departments
        University university1 = new University(department1);
        University university2 = new University(department2);
        University university3 = new University(department3);
        University university4 = new University(department4);
        University university5 = new University(department5);
        
     
        University[] universities = {university1, university2, university3, university4, university5};

        // Change professor name and ID  
        universities[4].getDepartment().getProfessor().setProfessorName("Updated Name");
        universities[4].getDepartment().getProfessor().setProfessorId(999);

     
        System.out.println("Updated Professor Name: " + universities[4].getDepartment().getProfessor().getProfessorName());
        System.out.println("Updated Professor ID: " + universities[4].getDepartment().getProfessor().getProfessorId());
    }

}


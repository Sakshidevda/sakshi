package July16;
import java.util.LinkedHashMap;
import java.util.Map;


public class Linkhash {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new LinkedHashMap<>();
		
		Employee employee1 = new Employee(1, "John Doe", 50000.0);
        Employee employee2 = new Employee(2, "Jane Smith", 60000.0);
        Employee employee3 = new Employee(3, "Bob Johnson", 70000.0);
        
        map.put(1, employee1);
        map.put(2, employee2);
        map.put(3, employee3);
        
        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
            Employee employee = entry.getValue();
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Salary: " + employee.getSalary());
	}

}
}

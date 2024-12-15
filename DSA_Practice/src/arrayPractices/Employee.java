package arrayPractices;

import java.util.Arrays;
import java.util.Comparator;

public class Employee {

	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}



	public static Comparator<Employee> nameComparator = new  Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.getName().compareTo(o2.getName());
		}
		
		
	};	
	public static void main(String args[]) {
		int [] intArr = {5,9,1,10};
		Arrays.sort(intArr);
		System.out.print(Arrays.toString(intArr) );
		
		
		Employee[] emp = new Employee[4];
		emp[0] = new Employee(5,"John");
		emp[1] = new Employee(9,"Amit");
		emp[2] = new Employee(1,"Paul");
		emp[3] = new Employee(10,"Ame");
		
		Arrays.sort(emp, Employee.nameComparator);
		System.out.println(Arrays.toString(emp));
		
		 
	}
	
	
}

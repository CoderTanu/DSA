package arrayPractices;

import java.util.Arrays;

public  class ComparableSortingEmployee  implements Comparable<ComparableSortingEmployee>{
	
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
	public ComparableSortingEmployee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	

	@Override
	public String toString() {
		return "ComparableSortingEmployee [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		ComparableSortingEmployee[] emp = new ComparableSortingEmployee[4];
		emp[0] = new ComparableSortingEmployee(5,"John");
		emp[1] = new ComparableSortingEmployee(9,"Amit");
		emp[2] = new ComparableSortingEmployee(1,"Paul");
		emp[3] = new ComparableSortingEmployee(10,"Ame");
		
		Arrays.sort(emp);
		System.out.println(Arrays.toString(emp));

	}
	@Override
	public int compareTo(ComparableSortingEmployee o) {
		return this.id - o.id;
	}

}

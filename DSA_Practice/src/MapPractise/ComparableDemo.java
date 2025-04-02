package MapPractise;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Charlie", 3.5));
		list.add(new Student("Bob", 3.8));
		list.add(new Student("Alice", 5.0));
		list.add(new Student("Akshit", 3.9));
		list.sort(null);
		System.out.println(list);
	}

}

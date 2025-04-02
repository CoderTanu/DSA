package MapPractise;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractices {

	public static void main(String[] args) {
		 HashMap<Person,String> map1 = new HashMap<>();
		 
		 Person p1 = new Person("Alice","1");
		 Person p2 = new Person("Bob","2");
		 Person p3 = new Person("Alice","1");
		 
		 map1.put(p1,"Engineer"); //hashcode1 --index1
		 map1.put(p2, "Designer");//hashcode2 --index2
		 map1.put(p3, "Software developer");//hashcode3 --index3
		 
		 System.out.println(map1.size());
		 System.out.println(map1);
		 System.out.println(map1.get(p3));
		 
		 Map<String, Integer> map = new HashMap<>();
		 map.put("tanu", 90);//hashcode1 --index1
		 map.put("Khushi", 98);//hashcode2 --index2
		 map.put("tanu", 99);//hashcode1 --index1 -- replace first map mapping value to last map entry value.
		 
		 System.out.println(map.size());
		 
	}

}

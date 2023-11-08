package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MapPractices {
	
	public static boolean removeData() {
		Map<Integer ,String> map = new HashMap<>();
		map.put( 1, "Java");
		map.put( 2, "C++");
		map.put( 3, "C");
		map.put( 4, "python");
		map.put( 5, "rust");
		map.put( 6, "Javacsript");
		
		System.out.println(map);
	if (map.containsKey(1) && Objects.equals(map.get(1), "Java")) {
	     map.remove(1);
	     return true;
	 } else
	     return false;
	 }


	public static void main(String[] args) throws InterruptedException {
	
		Map<Integer ,String> map = new HashMap<>();
		Map<Integer ,String> map1 = new HashMap<>();
		
		map.put( 1, "Java");
		map.put( 2, "C++");
		map.put( 3, "C");
		map.put( 4, "python");
		map.put( 5, "rust");
		map.put( 6, "Javacsript");
		
		System.out.println(map);
		
		System.out.println(map.containsKey(1));
		System.out.println(map.get(1));
		System.out.println(map.isEmpty());
//		map.wait(5000);
		
		System.out.println();
		System.out.println(map.get(1));
		System.out.println(map.get(1));
		System.out.println(map.get(1));
		map1.putAll(map);
		System.out.println(map1);
		map1.putIfAbsent(7, "GoLang");
		System.out.println(map1);
		map1.putIfAbsent(5, "hello");
		map1.remove(5);
		System.out.println(map1);
	 

		map1.remove(2,"java");
		System.out.println(map1);
		
		boolean v= removeData();
		System.out.println(v);
		Set set =map.entrySet();
		Iterator it =set.iterator();
		
		System.out.println();
		System.out.println(map.keySet());
		
		
		
		
		
	}

}

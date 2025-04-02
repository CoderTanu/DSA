package LinkedListPractices;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {
		//follow natural order, sorting happened based on keys
//		SortedMap<String, Integer> map = new TreeMap<>();
//		map.put("Vivek", 90);
//		map.put("Subham", 99);
//		map.put("Mohit", 78);
//		System.out.println(map);
		//output {Mohit=78, Subham=99, Vivek=90}
		
		
		//instead of sortedMap, we can use Map but sorted map gives below useful methods
		SortedMap<Integer, String> map = new TreeMap<>((a,b)->b-a);
		map.put(91,"Vivek");
		map.put(99,"Subham");
		map.put(78, "Mohit");
		map.put(77,"Vipul");
		System.out.println(map);
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.headMap(91));//exclude
		System.out.println(map.tailMap(91));
		
		NavigableMap<Integer, String> map1 = new TreeMap<>();
		map1.put(1,"Vivek");
		map1.put(5,"Subham");
		map1.put(3, "Mohit");
		System.out.println(map1);
		System.out.println(map1.lowerKey(4));
		System.out.println(map1.ceilingKey(4));
	}

}

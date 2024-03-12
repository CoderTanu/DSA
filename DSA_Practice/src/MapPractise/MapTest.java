package MapPractise;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("a", 100);
		map.put("b", 200);
		map.put("c", 300);
		map.put("d", 400);
		map.put("e", 500);
		map.put("f", 600);
		
		//System.out.println(map);
		
		map.put("e", 900);
		map.put("e", 100);
		//remove from map
		map.remove("a");
		map.remove("f", 600);
		for(Map.Entry<String, Integer> me: map.entrySet()) {
			System.out.println(me.getKey() + " " + me.getValue());
			
		}
		
		//Count the Occurrence of numbers using Hashmap
		
		int a[]= { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2 }; 
		
	}

}

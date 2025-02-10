package collections;

import java.util.HashMap;
import java.util.Map;

public class HashPractices {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1,"Tanu");
		hashMap.put(2,"shashwat");
		hashMap.put(3,"pavleen");
		hashMap.put(4,"khushi");
		hashMap.put(5,"ayush");
		
		System.out.println(hashMap);
		System.out.println(hashMap.get(6));
		System.out.println(hashMap.containsKey(5));
		System.out.println(hashMap.getOrDefault(5, "Not present"));
		hashMap.replace(5, "Jyoti");
		System.out.println(hashMap);
		

		
		//how to iterate
		for(Map.Entry<Integer, String> entry: hashMap.entrySet()) {
			  System.out.println("key"+entry.getKey());
			  System.out.println("value"+entry.getValue());
		}
		
		for(Integer key: hashMap.keySet()) {
			  System.out.println("key" + key);
			  System.out.println("val" + hashMap.get(key));
		}
			
		
	}

}

package StringPractices;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {

	public static void main(String[] args) {
		String word ="aaaaaaaaaaaaaabb";
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();
		
		char [] strArray = word.toCharArray();
		
		
		for(char c : strArray) {
			
			
			if(!map.containsKey(c)) {
		    	map.put(c,  1);
			}else {
				map.put(c,  map.get(c)+1);
			}
			
		}
		//map.forEach((key, value)-> System.out.println(key + ":" + value));
		
		
		sb.append(false);
		sb.append(false)
	}

}

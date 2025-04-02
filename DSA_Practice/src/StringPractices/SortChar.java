package StringPractices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortChar {
	
	
	 public static List<Character> frequencySort(String s) {
	        int n =s.length();
	        List<Character> list = new ArrayList<>();
	        Set<Character> set = new HashSet<>();
	        for(int i=0; i<n; i++){
	            set.add(s.charAt(i));
	        }
	        
	        System.out.println(set);
	        
	        list = set.stream().sorted().toList();
	        System.out.println(list);
	        return list;
	        
	    }

	public static void main(String[] args) {
		String s = "tree";
		frequencySort(s);

	}

}

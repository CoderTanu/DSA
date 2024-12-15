package arrayPractices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {

	public static void main(String[] args) {
		int [] arr = {3,1,7,2,90,1,0,12,6,23};
		
		//collection
		
		//collection--cnvert into Integer than list
		
		Arrays.sort(arr);;
		
		for(int i:arr) {
			System.out.println(i);
		}
		
		//using stream
		
		Integer[] val =Arrays.stream(arr).boxed().toArray(Integer[]::new);
		
		List<Integer> list = Arrays.asList(val);
		
		List<Integer> vals = list.stream().sorted().collect(Collectors.toList());
		System.out.println(vals);
	}

}

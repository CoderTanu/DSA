package arrayPractices;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MaxAndMin {

	public static void main(String[] args) {
		int [] arr = {3,1,7,2,90,1,0,12,6,23};
		
		//1. way
//		Arrays.sort(arr);
//		int max = arr[arr.length-1];
//		int min = arr[0];
//		
//		System.out.println(max  + " " + min);
//		
		
		//2.way
		OptionalInt val = IntStream.of(arr).max();
		OptionalInt minVal =IntStream.of(arr).min();
		if(val.isPresent()) {
			System.out.println(val.getAsInt());
		}
		
		if(minVal.isPresent()) {
			System.out.println(minVal.getAsInt());
		}
	}

}

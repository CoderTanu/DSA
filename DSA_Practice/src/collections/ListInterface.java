package collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(1);
		
		System.out.println(list);
		
		list.add(3, 8);
		list.add(2, 9);
		
//		System.out.println(list);
//		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		list2.add(23);
//
//		System.out.println(list2);
//		list2.addAll(list);
//
//		System.out.println(list2);
		
//		list2.addAll(5, list);
//
//		System.out.println(list2);
//		
		
//		list.clear();
//		System.out.println(list);
		
		
		System.out.println(list.set(3,34));
		
		
		System.out.println(list);
		
	
		System.out.println(list.contains(3));
		
//		System.out.println(list2.containsAll(list));
//		
//		System.out.println(list.equals(list2));
//		
//		System.out.println(list2.get(0));
//		System.out.println(list.indexOf(9));
//		
//		System.out.println(list.isEmpty());
//		
//		System.out.println(list.lastIndexOf(1));
//		
//		System.out.println(list.remove(3));
//		System.out.println(list);
//		
//		System.out.println(list.iterator());
//		
		
		



		
		
		
	}

}

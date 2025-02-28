package collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {

		/*
		 * List<String> shoppingList = new ArrayList<>();
		 * java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
	at collections.CopyOnWriteArrayListDemo.main(CopyOnWriteArrayListDemo.java:18)
		 */
		
		List<String> shoppingList = new CopyOnWriteArrayList<>();
		
		shoppingList.add("Milk");
		shoppingList.add("Butter");
		shoppingList.add("Bread");
		shoppingList.add("Eggs");
		System.out.println("Initial shopping list: "+shoppingList);
		
		for(String item: shoppingList) {
			if(item.equals("Eggs")) {
				shoppingList.add("Paneer");
			}
		}
		
		System.out.println("Updated shopping list: "+shoppingList);
		
	
		
	}

}

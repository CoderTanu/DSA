package MapPractise;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * example for linkedhashmap
 */
public class LRUCache<K,V> extends LinkedHashMap<K,V>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int capacity;
	
	

	public LRUCache(int capacity) {
		super(capacity, 0.75f, true);
		this.capacity = capacity;
	}
	
	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > capacity;
	}



	public static void main(String[] args) {
		LRUCache<String,Integer> map = new LRUCache<>(3);
		map.put("Bob", 91);
		map.put("Alice", 98);
		map.put("Ram", 89);
		map.put("Bob",100);
		map.put("Vipul", 93);
      
		System.out.println(map);

		System.out.println(map.size());

	}

}

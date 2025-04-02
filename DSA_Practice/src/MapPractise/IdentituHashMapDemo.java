package MapPractise;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentituHashMapDemo {

	public static void main(String[] args) {
	  String key1 = new String("key");
	  String key2 = new String("key");
	  
	  //used string hashcode it do care there internal hashcode
	  //identityhashcode(means object hashcode here string is the object) 
	  //and == (will check address using == )used to check hashcode and equal  
	  Map<String, Integer> map = new IdentityHashMap<>();
	  map.put(key1, 1);
	  map.put(key2, 2);
	  System.out.println(System.identityHashCode(key1));
	  System.out.println(System.identityHashCode(key2));
	  System.out.println(map);
	  
	  //hashcode and equals (will check content using == )used to check hashcode and equal  
	  Map<String, Integer> map1= new HashMap<>();
	  map1.put(key1, 1);
	  map1.put(key2, 2);
	  System.out.println(key1.hashCode());
	  System.out.println(key2.hashCode());
	   System.out.println(key1.equals(key2));
	  System.out.println(map1);
	}

}

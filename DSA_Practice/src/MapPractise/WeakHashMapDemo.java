package MapPractise;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	
	
	public static void main(String[] args) {
		WeakHashMap<String , Image> imgCache = new WeakHashMap<>();
//		imgCache.put("img1", new Image("Image 1"));
//		imgCache.put("img2", new Image("Image 2"));
	
		loadCache(imgCache);
		System.out.println(imgCache);
		System.gc();
		
		simulateApplicationRunning();
		System.out.println("cache after running some entries may be cleared "+imgCache);
	}
	
	private static void loadCache(Map<String,Image> imgCache) {
		String k1 = new String("img1");
		String k2 = new String("img1");
		imgCache.put(k1, new Image("Image 1"));
		imgCache.put(k2, new Image("Image 2"));
	}

	private static void simulateApplicationRunning() {
		try {
			System.out.println("Simualting application running");
			Thread.sleep(10000);
		}catch(Exception e) {
			
		}
		
	}

}

class Image{
	
	private String name;

	public Image(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Image [name=" + name + "]";
	}
	
	
}
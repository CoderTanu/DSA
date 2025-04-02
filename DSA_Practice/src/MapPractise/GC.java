package MapPractise;

import java.lang.ref.WeakReference;

public class GC {
	
	public static void main(String[] args) {
		Phone phone = new Phone("Apple","16 promax"); //object created in heap
		System.out.println(phone); //print referenc
		
		phone = null;
		System.out.println(phone); 
		
		//SAME WEEK
		
		WeakReference<Phone> weak = new WeakReference<>( new Phone("Apple","16 promax"));
		System.out.println(weak.get());
		System.gc();
		
	   try {
		   Thread.sleep(10000);
	   }catch(Exception e) {
		   
	   }
	   System.out.println(weak.get());
	}

}

class Phone{
	
	private String brand;
	private String model;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Phone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", model=" + model + "]";
	}
}

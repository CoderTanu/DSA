package Object_OrientedProgramming;

//abstract class Demo for showing abstraction in JAVA OOPS
public abstract class Animal {
	
	//abstract method 
	public abstract void sound();
	
	//regular method
	public void sleep() {
		System.out.println("This animals sleeps");
	}
	
	
	
	
	

	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.sleep();
		cat.sound();
		
		Animal dog = new Dog();
		dog.sleep();
		dog.sound();

	}

}

class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("Cat meow");
		
	}
	
}

class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("Dog bark");
		
	}
	
}

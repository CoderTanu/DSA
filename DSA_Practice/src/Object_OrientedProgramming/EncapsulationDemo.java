package Object_OrientedProgramming;

class Vehicle{
	
	private String numberfVehicle;
	
	public Vehicle(String numberfVehicle) {
		this.numberfVehicle = numberfVehicle;
	}
	
	public void honk() {
		System.out.println("Honk!!!!!!!!!!!!!!!!!");
	}
	
	public void printVehicleNo() {
		System.out.println("Vehicle no is:" + numberfVehicle);
	}
	
	
}

class Car extends Vehicle{
//	private String numberfCar;
	
	public Car(String numberfCar) {
		super(numberfCar);
	}
	
//	public void printCarNo() {
//		System.out.println("car no is:"+ numberfCar );
//	}
//	public void honk() {
//		System.out.println("Honk!!!!!!!!!!!!!!!!!");
//	}
	
}


class Bus extends Vehicle{
//	private String numberfBus;
	
	public Bus(String numberfBus) {
		super(numberfBus);
	}
	
//	public void honk() {
//		System.out.println("Honk!!!!!!!!!!!!!!!!!");
//	}
//	
//	public void printVehicleNo() {
//		System.out.println("bus no is:");
//	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Car car = new Car("287998uh787656");
		car.printVehicleNo();
		car.honk();
		
		Bus bus = new Bus("98732rhjmn9837");
		bus.printVehicleNo();
		bus.honk();
		

	}

}

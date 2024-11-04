package Object_OrientedProgramming;

public class PolymorphismDemo {
	
	private String vehicleNumber;
	
	

	public PolymorphismDemo(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public void honk() {
		System.out.println("honk!!!");
	}

	 public void printVehicleNumber() {
	        System.out.println(vehicleNumber);
	    }

	public static void main(String[] args) {
		Cars demo = new Cars("fvhjvdh7833");
		demo.honk();
		demo.printVehicleNumber();
		
		Buses demo1 = new Buses("khdgcjh67");
		demo1.honk();
		demo1.printVehicleNumber();

	}

}

class Cars extends PolymorphismDemo{

	public Cars(String vehicleNumber) {
		super(vehicleNumber);
	}
	
	@Override
	public void honk() {
		System.out.println("car honks");
		
	}
	
}

class Buses extends PolymorphismDemo{

	public Buses(String vehicleNumber) {
		super(vehicleNumber);
	}
	
	@Override
	public void honk() {
		System.out.println("bus honks");
		
	}
}

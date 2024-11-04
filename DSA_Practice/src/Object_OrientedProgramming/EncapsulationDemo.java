package Object_OrientedProgramming;

public class EncapsulationDemo {
	
	private int balance;
	
	

	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public static void main(String[] args) {
		EncapsulationDemo demo = new EncapsulationDemo();
		//demo.setBalance(1200000);
		
		System.out.println(demo.getBalance());

	}

}

package Object_OrientedProgramming;

class BankAccount{
	double balance;
	String accountType;
	
	BankAccount(){
		System.out.println("Inside default constuctor");
	}
	BankAccount(double _balance){
		System.out.println("Inside parameterized constuctor");
		balance= _balance;
	}
	
	BankAccount(double _balance, String accountTypes){
		System.out.println("Inside parameterized constuctor");
		balance= _balance;
		accountType=accountTypes;
	}
	
	public void printBalance() {
		System.out.println(balance);
	}
	public void printType() {
		System.out.println(accountType);
	}
}



public class ConstructorDemo {

	public static void main(String[] args) {
		
		BankAccount p1 = new BankAccount(100);
		p1.printBalance();
		p1.printType();
		
		BankAccount p2 = new BankAccount(100,"saving");
		p2.printBalance();
		p2.printType();
	
	}

}

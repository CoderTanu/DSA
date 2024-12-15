package DaimondProblem;

public class D extends B, C {
	
	public static void main(String args[])  
	{  
	D d = new D();  
	//creates ambiguity which display() method to call  
	d.display();   
	}  

}

package DaimondProblemSolution;

public interface TerrestialAnimal {
	
	public void livesIn();
	
	public default void  defaultDemo() {
		System.out.println("inside of TerrestialAnimal of default method");
	}

}

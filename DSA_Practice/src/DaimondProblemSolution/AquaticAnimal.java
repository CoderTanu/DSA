package DaimondProblemSolution;

public interface AquaticAnimal {

	public void livesIn();
	
	public default void  defaultDemo() {
		System.out.println("inside of AquaticAnimal of default method");
	}
}

package DaimondProblemSolution;

public class Dog  implements Animal, TerrestialAnimal{

	@Override
	public void specialCapabilties() {
	System.out.println("dog can bark");
	}

	@Override
	public void livesIn() {
		System.out.println("Dog lived on lands");
		
	}

}

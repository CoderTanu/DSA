package DaimondProblemSolution;

public class Frog implements Animal, TerrestialAnimal, AquaticAnimal{

	@Override
	public void specialCapabilties() {
		System.out.println("frog can live land as well as in water");
		
	}

	@Override
	public void livesIn() {
		System.out.println("frog is an amphibian animal and hence can live on land as well as water");
		
	}

	@Override
	public void defaultDemo() {
		// TODO Auto-generated method stub
		AquaticAnimal.super.defaultDemo();
	}

}

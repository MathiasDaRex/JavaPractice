package methodOverriding;

public class Main {

	public static void main(String[] args) {
		// method overriding = 	Declaring a method in sub class, witch is already present in parent class.
		//						Done so that a child class can give its own implementation
		Animal animal = new Animal();
		Dog doggy = new Dog();
		animal.makeNoise();
		doggy.makeNoise();
	}

}

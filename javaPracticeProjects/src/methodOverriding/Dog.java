package methodOverriding;

public class Dog extends Animal{

	@Override
	void makeNoise() {
		System.out.println("The dog *bark*");
	}
}

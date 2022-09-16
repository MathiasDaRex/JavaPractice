package dynamicPolymorphism;

public class Dog extends Animal{

	@Override
	public void makeNoise() {
		System.out.println("Dog goes bark");
	}
}

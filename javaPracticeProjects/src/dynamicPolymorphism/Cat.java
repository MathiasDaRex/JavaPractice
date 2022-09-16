package dynamicPolymorphism;

public class Cat extends Animal{

	@Override
	public void makeNoise() {
		System.out.println("Cat goes meow");
	}
}

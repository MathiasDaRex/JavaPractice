package dynamicPolymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// polymorphism = many shapes/form
		// dynamic = after compilation (during runtime)
		// The ability of an object to take many shapes or forms after the program is already running
		
		// A lada is a: lada, and a car, and a vehicle, and an object 
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Animal animal;
		
		System.out.println("What animal do you want?");
		System.out.println("(1=dog) or (2=cat): ");
		int choice = sc.nextInt();
		
		if(choice==1) {
			animal = new Dog();
			animal.makeNoise();
		} else if(choice==2) {
			animal = new Cat();
			animal.makeNoise();
		} else {
			animal = new Animal();
			System.out.println("That choice was invalid");
			animal.makeNoise();
		}
	}

}

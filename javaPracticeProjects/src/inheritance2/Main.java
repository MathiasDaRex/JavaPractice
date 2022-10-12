package inheritance2;

public class Main {

	// intharitance = the process where one class acquires the attributes and methods of another
	public static void main(String[] args) {
		
		// if we make the vehicle class a parent class of Car class
		// the instances can se the methods written in the vehicle class
		Car car = new Car();
		car.go();
		
		Bike bike = new Bike();
		bike.go();
		bike.stop();
		
		System.out.println(bike.pedals);
		System.out.println(car.doors);
		
	}
}

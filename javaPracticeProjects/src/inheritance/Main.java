package inheritance;

public class Main {

	// inheritance = the process where one class acquires the attributes and methods of another
	public static void main(String[] args) {
		
		// 		if we make the vehicle class a parent class of the Car class,
		//		the instances can use the methods written in the vehicle class
		Car car = new Car();
		car.go();
		
		Bicycle bike = new Bicycle();
		bike.stop();
		
//		System.out.println(car.speed);
//		System.out.println(bike.speed);
		System.out.println(car.doors);
		System.out.println(bike.pedals);

	}
	
	
}
